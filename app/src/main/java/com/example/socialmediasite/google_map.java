package com.example.socialmediasite;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.support.v4.app.FragmentManager;

public class MapsMarkerActivity extends AppCompatActivity implements OnMapReadyCallback {
    // onCreate method is called when the activity is first created
    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.google_map);

        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    // This method is called when the map is ready to be used.
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
      myMap = googleMap;

      LatLng sydney = new LatLng(-34,151);
      myMap.addMarker(new MarkerOptions().position(sydney).title("Sydney"));
      myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
