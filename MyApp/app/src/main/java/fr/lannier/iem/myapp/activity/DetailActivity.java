package fr.lannier.iem.myapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fr.lannier.iem.myapp.R;
import fr.lannier.iem.myapp.manager.BLEManager;

public class DetailActivity extends AppCompatActivity {

    private Button button_rate;
    private TextView textView_rateValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView_rateValue=(TextView) findViewById(R.id.detail_rate_value);

        button_rate=(Button) findViewById(R.id.detail_rate_button);
        button_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLEManager manager = BLEManager.getInstance();
                textView_rateValue.setText(manager.getHeartRate());
            }
        });
    }
}
