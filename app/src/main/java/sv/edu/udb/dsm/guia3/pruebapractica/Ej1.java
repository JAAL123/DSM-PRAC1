package sv.edu.udb.dsm.guia3.pruebapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ej1 extends AppCompatActivity {

    EditText nombre, fecha,codigo,monto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1);
        nombre = (EditText) findViewById(R.id.editNombre);
        codigo = (EditText) findViewById(R.id.editCodigo);
        fecha = (EditText) findViewById(R.id.editFecha);
        monto = findViewById(R.id.editMonto);
    }


    public void enviarDatos(View v){

        String Nombre = nombre.getText().toString();
        String Codigo = codigo.getText().toString();
        String Fecha = fecha.getText().toString();
        String Monto = monto.getText().toString();


        Intent intent = new Intent(Ej1.this,mostrarEj1.class);

        intent.putExtra("nombre",Nombre);
        intent.putExtra("codigo",Codigo );
        intent.putExtra("fecha",Fecha );
        intent.putExtra("monto",Monto );
        startActivity(intent);
    }
}