package cl.luis.proyectoestadios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class arica2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arica2);

    }

    public void ButtonComoLlegar (View view){
        Intent buttonComoLlegar = new Intent(this, gps.class);
        startActivity(buttonComoLlegar);


    }
    public void MiUbicaion (View view){
        Intent miUbicaion = new Intent(this, Localizacion.class);
        startActivity(miUbicaion);


    }

    public void DatosAsistente (View view){
        Intent Datosasistente = new Intent(this, MainActivity3.class);
        startActivity(Datosasistente);


    }

}//MiUbicaion
