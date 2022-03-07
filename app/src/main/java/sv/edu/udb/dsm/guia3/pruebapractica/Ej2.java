package sv.edu.udb.dsm.guia3.pruebapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ej2 extends AppCompatActivity {

    EditText etA,etB,etC;
    TextView s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej2);
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);

        s1 = (TextView) findViewById(R.id.s1);
        s2 =(TextView)findViewById(R.id.s2);
    }
    public void Calcular(View v){
        String n1 = etA.getText().toString();
        String n2 = etB.getText().toString();
        String n3 = etC.getText().toString();

        double a = Double.parseDouble(n1);
        double b = Double.parseDouble(n2);
        double c = Double.parseDouble(n3);

        double x0, x1;

        double numero = (b*b) - (4*a*c);

        if (numero > 0){
            x0 = (-b + Math.sqrt(numero))/(2*a);
            x1 = (-b - Math.sqrt(numero))/(2*a);

            s1.setText("La solucion 1 es: " + x0);
            s2.setText("La solucion 2 es: " + x1);
        }else {
            s1.setText("No hay solucion en los reales");
        }
    }


}