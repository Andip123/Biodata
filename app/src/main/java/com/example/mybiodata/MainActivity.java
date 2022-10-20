package com.example.mybiodata;

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
    public void openMaps(View v){
        Uri gmmIntentUri = Uri.parse("geo:-6.976727, 110.403835?q=-6.976721, 110.403866(my kos)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void openContact(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:081325145843"));
        startActivity(intent);
    }

    public void openEmail(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "andiprabandaru@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Aplikasi Biodata email");
        startActivity(intent);
    }
}