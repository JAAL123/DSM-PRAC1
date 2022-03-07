package sv.edu.udb.dsm.guia3.pruebapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void irEjercicio1(View v){
        Intent llamar = new Intent(menu.this,Ej1.class);
        startActivity(llamar);
    }
    public void  irEjercicio2(View v){
        Intent llamar = new Intent(menu.this,Ej2.class);
        startActivity(llamar);
    }
}