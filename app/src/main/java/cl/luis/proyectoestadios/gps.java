package cl.luis.proyectoestadios;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.luis.proyectoestadios.databinding.ActivityGpsBinding;

public class gps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityGpsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGpsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng arica = new LatLng(-18.488192264448816, -70.2991746362048);
        LatLng chillan = new LatLng(-36.61824947869104, -72.10788100180784);
        LatLng puertomontt = new LatLng(-41.49149096039751, -72.98673344400692);
        mMap.addMarker(new MarkerOptions().position(arica).title("Estadio Carlos Dittborn"));
        mMap.addMarker(new MarkerOptions().position(chillan).title("Estadio Bicentenario Municipal Nelson Oyarzún Arenas"));
        mMap.addMarker(new MarkerOptions().position(puertomontt).title("Estadio Chinquihue"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(puertomontt));
    }
}