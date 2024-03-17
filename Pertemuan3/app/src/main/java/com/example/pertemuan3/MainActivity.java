package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Eksplisit(View view) {
        Intent eksplisit = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(eksplisit);
    }

    public void Implisit(View view) {
        Intent implisit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6282188759039"));
        startActivity(implisit);
    }

    public void kirim(View view) {
        Intent send = new Intent(Intent.ACTION_SEND);
        send.putExtra()
        startActivity(send);
    }
}