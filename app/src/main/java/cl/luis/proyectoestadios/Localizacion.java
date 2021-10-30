package cl.luis.proyectoestadios;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationProvider;
import android.os.Bundle;
import android.util.Log;

//****//
public class Localizacion implements LocationListener {
    private final MainActivity2 mainActivity2;


    public Localizacion(MainActivity2 mainActivity) {
        this.mainActivity2 = mainActivity;
    }

    public MainActivity2 getMainActivity2() {
        return mainActivity2;
    }


    @Override
    public void onLocationChanged(Location loc) {
        loc.getLatitude();
        loc.getLongitude();
        mainActivity2.TvLatitud.setText(String.valueOf(loc.getLatitude()));
        mainActivity2.TvLongitud.setText(String.valueOf(loc.getLongitude()));
        this.mainActivity2.setLocation(loc);

    }

    @Override
    public void onProviderDisabled(String provider) {
        mainActivity2.TvLatitud.setText("GPS Desactivado");
    }

    @Override
    public void onProviderEnabled(String provider) {
        mainActivity2.TvLatitud.setText("GPS Activo");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        switch (status) {
            case LocationProvider.AVAILABLE:
                Log.d("debug", "LocationProvider.AVAILABLE");
                break;
            case LocationProvider.OUT_OF_SERVICE:
                Log.d("debug", "LocationProvider.OUT_OF_SERVICE");
                break;
            case LocationProvider.TEMPORARILY_UNAVAILABLE:
                Log.d("debug", "LocationProvider.TEMPORARILY_UNAVAILABLE");
                break;
        }
    }
}