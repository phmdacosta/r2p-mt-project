package br.com.r2psoft.mtproject;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SearchMapActivity extends android.support.v4.app.FragmentActivity{

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
        
        map.addMarker(new MarkerOptions()
						.position(latlng)
						.title("MyToilet")
						.snippet("Primeiro marcador")
						.icon(BitmapDescriptorFactory.defaultMarker()));
        
        map.setMyLocationEnabled(true);       
        
        /** Animação de camera
         * map.animateCamera(update, 1000, new CancelableCallback(){
        	@Override
        	public void onFinish(){
        		Toast.makeText(getBaseContext(), "Mapa Centralizado", Toast.LENGTH_SHORT).show();
        	}
        	@Override
        	public void onCancel(){
        		Toast.makeText(getBaseContext(), "Animação Cancelada", Toast.LENGTH_SHORT).show();
        	}
        });*/
    }
	
}
