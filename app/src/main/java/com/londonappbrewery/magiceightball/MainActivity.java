package com.londonappbrewery.magiceightball;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        };

        Button myButton = (Button) findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });

        final RelativeLayout layoutDisplay = (RelativeLayout) findViewById(R.id.activity_main);
        final int[] colorArray = {
            Color.parseColor("#4DB6AC"),
            Color.parseColor("#42A5F5"),
            Color.parseColor("#7E57C2"),
            Color.parseColor("#EF5350"),
            Color.parseColor("#AB47BC"),
            Color.parseColor("#66BB6A")
        };

        Button colorButton = (Button) findViewById(R.id.colorButton);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomColorGenerator = new Random();
                int color = randomColorGenerator.nextInt(6);

                layoutDisplay.setBackgroundColor(colorArray[color]);
            }
        });
    }
}
