package cl.luis.proyectoestadios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class arica1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arica1);
    }

        public void ButtonAtras (View view){
            Intent buttonatras = new Intent(this, MainActivity.class);
            startActivity(buttonatras);
        }

    public void ButtonSiguiente (View view){
        Intent buttonsiguiente = new Intent(this, arica2.class);
        startActivity(buttonsiguiente);
    }
    }


