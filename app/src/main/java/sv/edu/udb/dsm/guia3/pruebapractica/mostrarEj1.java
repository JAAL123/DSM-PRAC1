package sv.edu.udb.dsm.guia3.pruebapractica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mostrarEj1 extends AppCompatActivity {

    TextView Nombre,Monto,Fecha,Codigo,Porcentaje,Comision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_ej1);
        recibirDatos();
        Calculos();
    }
    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String rNombre = extras.getString("nombre");
        String rMonto = extras.getString("monto");
        String rFecha = extras.getString("fecha");
        String rCodigo = extras.getString("codigo");

        Nombre = (TextView) findViewById(R.id.tvNombre);
        Nombre.setText(rNombre);

        Monto = (TextView) findViewById(R.id.tvVentas);
        Monto.setText("$"+rMonto);

        Fecha = (TextView) findViewById(R.id.tvMes);
        Fecha.setText(rFecha);

        Codigo = (TextView) findViewById(R.id.tvCodigo);
        Codigo.setText(rCodigo);

    }
    public void Calculos(){
        Bundle extras = getIntent().getExtras();
        String rMonto = extras.getString("monto");

        Double numero = Double.parseDouble(rMonto);
        double comision;

        if (numero < 500) {
            Porcentaje = (TextView) findViewById(R.id.tvPorcentaje);
            Porcentaje.setText("No hay porcentaje de comision");

            Comision = (TextView) findViewById(R.id.tvComision);
            Comision.setText("No tendra comision.");
        }else if(numero >= 500 && numero < 1000){
            comision = numero * 0.05;
            Porcentaje = (TextView) findViewById(R.id.tvPorcentaje);
            Porcentaje.setText("5%");

            Comision = (TextView) findViewById(R.id.tvComision);
            Comision.setText("$" + comision);
        }else if(numero >= 1000 && numero < 2000){
            comision = numero * 0.10;
            Porcentaje = (TextView) findViewById(R.id.tvPorcentaje);
            Porcentaje.setText("10%");

            Comision = (TextView) findViewById(R.id.tvComision);
            Comision.setText("$" + comision);
        }else if(numero >= 2000 && numero < 3000){
            comision = numero * 0.15;
            Porcentaje = (TextView) findViewById(R.id.tvPorcentaje);
            Porcentaje.setText("15%");

            Comision = (TextView) findViewById(R.id.tvComision);
            Comision.setText("$" + comision);
        }else if(numero >= 3000 && numero < 4000){
            comision = numero * 0.20;
            Porcentaje = (TextView) findViewById(R.id.tvPorcentaje);
            Porcentaje.setText("20%");

            Comision = (TextView) findViewById(R.id.tvComision);
            Comision.setText("$" + comision);
        }else if(numero >= 4000){
            comision = numero * 0.30;
            Porcentaje = (TextView) findViewById(R.id.tvPorcentaje);
            Porcentaje.setText("30%");

            Comision = (TextView) findViewById(R.id.tvComision);
            Comision.setText("$" + comision);
        }

    }

    public void finalizarActividad(View v) {
        finish();
    }
}