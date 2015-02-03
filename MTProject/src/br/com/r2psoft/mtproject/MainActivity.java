package br.com.r2psoft.mtproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button Procurar = (Button) findViewById(R.id.btnProcurar);
        Procurar.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent it = new Intent(this, SearchMapActivity.class);
		startActivity(it);
		/*Toast.makeText(MainActivity.this,
				"ImageButton (selector) is clicked!",
				Toast.LENGTH_SHORT).show();*/
	}     
    
}
