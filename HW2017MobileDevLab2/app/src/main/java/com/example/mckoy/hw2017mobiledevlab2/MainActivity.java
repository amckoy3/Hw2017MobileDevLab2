package com.example.mckoy.hw2017mobiledevlab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button gButton;
    private Button bButton;
    private LinearLayout mLayout;
    int count_g=0;
    int count_b=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.Text_view);
        mLayout = (LinearLayout) findViewById(R.id.Lin_Layout);

        gButton = (Button) findViewById(R.id.green_button);
        gButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("now we feel green");
                mLayout.setBackgroundResource(android.R.color.holo_green_light);
                if (count_g == 0) {
                    count_g++;
                    Toast.makeText(MainActivity.this, "now we feel green", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bButton = (Button) findViewById(R.id.blue_button);
        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("now we feel blue");
                mLayout.setBackgroundResource(android.R.color.holo_blue_bright);
                if(count_b == 0)
                {
                    count_b++;
                    Toast.makeText(MainActivity.this, "now we feel blue", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
