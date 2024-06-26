package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button blinkBTN, rotateBTN, fadeBTN, moveBTN, slideBTN, zoomBTN, stopBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        blinkBTN = findViewById(R.id.blinkbutton);
        rotateBTN = findViewById(R.id.rotatebutton);
        fadeBTN = findViewById(R.id.fadebutton);
        moveBTN = findViewById(R.id.movebutton);
        slideBTN = findViewById(R.id.slidebutton);
        zoomBTN = findViewById(R.id.zoombutton);
        stopBTN = findViewById(R.id.stopbutton);
        blinkBTN.setOnClickListener(new View.OnClickListener() {
            @Override public
            void onClick(View v) {
                // To add blink animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink); imageView.startAnimation(animation);
            }
        });
        rotateBTN.setOnClickListener(new View.OnClickListener() {
            @Override public
            void onClick(View v) {
                // To add rotate animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                imageView.startAnimation(animation);
            } });
        fadeBTN.setOnClickListener(new View.OnClickListener() {
            @Override public
            void onClick(View v) {
                                                             // To add fade animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                imageView.startAnimation(animation);
            } });
        moveBTN.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                // To add move animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                imageView.startAnimation(animation);
            } });
        slideBTN.setOnClickListener(new View.OnClickListener() {
            @Override public
            void onClick(View v) { //To add slide animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
                imageView.startAnimation(animation);
            } });
        zoomBTN.setOnClickListener(new View.OnClickListener() {
            @Override public
            void onClick(View v) {
                // To add zoom animation
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                imageView.startAnimation(animation);
            } });
        stopBTN.setOnClickListener(new View.OnClickListener() {
            @Override public
            void onClick(View v) {
                // To stop the animation going on imageview
                imageView.clearAnimation();
            }
        });




    }
}
