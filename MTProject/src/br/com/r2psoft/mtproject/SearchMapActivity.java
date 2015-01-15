package br.com.r2psoft.mtproject;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class SearchMapActivity extends android.support.v4.app.FragmentActivity {

	@Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_search_map);
        SupportMapFragment mapFragment = (SupportMapFragment)
        		getSupportFragmentManager().findFragmentById(R.id.map);
        GoogleMap map = mapFragment.getMap();
        
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        LatLng latlng = new LatLng(-22.8440802,-43.3094623);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(latlng, 15);
        map.moveCamera(update);
    }
}
