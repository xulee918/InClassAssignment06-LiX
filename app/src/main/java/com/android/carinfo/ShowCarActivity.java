package com.android.carinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowCarActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_car);

        Intent intent = getIntent();
        Car car = (Car) intent.getSerializableExtra("myCar");

        textView = findViewById(R.id.show_car_text_view);
        textView.setText(car.toString());
    }
}
