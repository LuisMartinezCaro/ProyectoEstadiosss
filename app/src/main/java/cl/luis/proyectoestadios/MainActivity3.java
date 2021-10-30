
package cl.luis.proyectoestadios;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;

        import com.google.firebase.FirebaseApp;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.UUID;

        import cl.luis.proyectoestadios.asistente.asistente;

public class MainActivity3 extends AppCompatActivity {

    private List<asistente> Listasistente = new ArrayList<asistente>();
    ArrayAdapter<asistente> arrayadapterasisitente;
    EditText eTNombre,eTUbicacion;
    Button bTAceptar;
    ListView lvasistente;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        eTNombre=findViewById(R.id.eTNombre);
        eTUbicacion=findViewById(R.id.eTUbicacion);
        bTAceptar=findViewById(R.id.bTAceptar);
        lvasistente=findViewById(R.id.lvasistente);

        inicializarFirebase();
        ListarDatos ();

        bTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                asistente Asistente = new asistente();
                Asistente.setIdAsistente(UUID.randomUUID().toString());
                Asistente.setNombre(eTNombre.getText().toString());
                Asistente.setUbicacion(eTUbicacion.getText().toString());
                databaseReference.child("asistente").child(Asistente.getIdAsistente()).setValue(Asistente);}
        });

    }

    private void ListarDatos() {
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
    }

}