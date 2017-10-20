package fr.lannier.iem.myapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fr.lannier.iem.myapp.R;
import fr.lannier.iem.myapp.manager.BLEManager;

public class MainActivity extends AppCompatActivity {

    private Button detail;
    private Button connect;
    private TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value=(TextView) findViewById(R.id.connectValue);

        detail=(Button) findViewById(R.id.detailButton);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });

        connect=(Button) findViewById(R.id.connectButton);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLEManager manager=BLEManager.getInstance();
                value.setText(manager.isConnected());
            }
        });



    }
}
