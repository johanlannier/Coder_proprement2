package fr.lannier.iem.myapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fr.lannier.iem.myapp.R;
import fr.lannier.iem.myapp.manager.BLEManager;

public class DetailActivity extends AppCompatActivity {

    private Button rate;
    private TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        value=(TextView) findViewById(R.id.rateValue);

        rate=(Button) findViewById(R.id.rateButton);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLEManager manager=BLEManager.getInstance();
                value.setText(String.valueOf(manager.getRate()));
            }
        });
    }
}
