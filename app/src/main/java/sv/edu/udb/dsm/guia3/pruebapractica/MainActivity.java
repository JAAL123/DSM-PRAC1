package sv.edu.udb.dsm.guia3.pruebapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<Public, pirvate> extends AppCompatActivity {

    TextView msj;
    EditText campUsuario, campContra;

    private Button btnIS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campUsuario = (EditText) findViewById(R.id.input_usuario);
        campContra = (EditText) findViewById(R.id.input_contrasena);
        msj = (TextView) findViewById(R.id.mostrar_msj);

        cargarPreferencias();
    }

   private void cargarPreferencias() {
        SharedPreferences preferencias = getSharedPreferences
                ("Credenciales", Context.MODE_PRIVATE);

        String user = preferencias.getString("user","Nada");
        String pass = preferencias.getString("pass","Nada");
        msj.setVisibility(View.INVISIBLE);

    }

    public void guardarPreferencias(View v){
        SharedPreferences preferencias = getSharedPreferences
                ("Credenciales", Context.MODE_PRIVATE);
        String Usuario = campUsuario.getText().toString();
        String Contra = campContra.getText().toString();

        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("user",Usuario);
        editor.putString("pass", Contra);

        editor.commit();
    }

    public void inicioSesion(View v){
        SharedPreferences preferencias = getSharedPreferences
                ("Credenciales", Context.MODE_PRIVATE);

        String user = preferencias.getString("user","Nada");
        String pass = preferencias.getString("pass","Nada");

        String Usuario = campUsuario.getText().toString();
        String Contra = campContra.getText().toString();

         if (user.equals(Usuario) && pass.equals(Contra)){
        Intent llamar = new Intent( MainActivity.this,menu.class);
        startActivity(llamar);}
         else{
            msj.setVisibility(View.VISIBLE);
         }

    }
}