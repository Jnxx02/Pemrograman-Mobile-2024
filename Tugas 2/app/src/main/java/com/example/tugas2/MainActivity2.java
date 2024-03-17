package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void telpon(View view) {
        Intent telepon = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082188759039"));
        startActivity(telepon);
    }

    public void maps(View view) {
        Intent unhas = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-5.132018092528762, 119.48594852164932"));
        startActivity(unhas);
    }
}