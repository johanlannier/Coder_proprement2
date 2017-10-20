package fr.lannier.iem.myapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fr.lannier.iem.myapp.R;
import fr.lannier.iem.myapp.devices.Device;
import fr.lannier.iem.myapp.manager.BLEManager;

public class MainActivity extends AppCompatActivity {

    private Button button_detail;
    private Button button_connect;
    private TextView textView_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView(){
        textView_status=(TextView) findViewById(R.id.main_connect_value);

        button_detail=(Button) findViewById(R.id.main_detail_button);
        button_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, DetailActivity.class);
                startActivity(i);
            }
        });

        button_connect=(Button) findViewById(R.id.main_connect_button);
        button_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLEManager manager=BLEManager.getInstance();
                manager.connect(new Device());
                textView_status.setText(manager.getDeviceName()+" paired");
            }
        });
    }
}
