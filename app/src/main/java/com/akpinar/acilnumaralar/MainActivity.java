package com.akpinar.acilnumaralar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ambulans_ara = (Button) findViewById(R.id.ambulans);
        final Button polis_ara = (Button) findViewById(R.id.polis);
        final Button orman_ara = (Button) findViewById(R.id.ormanyangini);
        final Button dogalgaz_ara = (Button) findViewById(R.id.dogalgazacil);
        final Button jandarma_ara = (Button) findViewById(R.id.jandarma);
        final Button zehir_ara = (Button) findViewById(R.id.zehirdanisma);
        final Button kizilay_ara = (Button) findViewById(R.id.kizilay);
        final Button saglik_ara = (Button) findViewById(R.id.saglikdanisma);
        final Button ruhsal_ara = (Button) findViewById(R.id.ruhsalbunalim);
        final Button uyusturucu_ara = (Button) findViewById(R.id.uyusturucubilgi);
        final Button alodoktorum_ara = (Button) findViewById(R.id.alodoktorumyanimda);
        final Button elektrik_ara = (Button) findViewById(R.id.elektrikariza);
        final Button su_ara = (Button) findViewById(R.id.suariza);
        final Button telefonariza_ara = (Button) findViewById(R.id.telefonariza);
        final Button cenaze_ara = (Button) findViewById(R.id.cenazehizmetleri);
        final Button iskur_ara = (Button) findViewById(R.id.iskur);
        final Button vergi_ara = (Button) findViewById(R.id.vergidanisma);




ambulans_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+112));
                startActivity(intent);

            }
        });

        polis_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+155));
                startActivity(intent);
            }
        });

        orman_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+177));
                startActivity(intent);
            }
        });
        dogalgaz_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+187));
                startActivity(intent);
            }
        });

        jandarma_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+156));
                startActivity(intent);
            }
        });
        zehir_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+114));
                startActivity(intent);
            }
        });
        kizilay_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+168));
                startActivity(intent);
            }
        });
        saglik_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+184));
                startActivity(intent);
            }
        });
        ruhsal_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+182));
                startActivity(intent);
            }
        });
        uyusturucu_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+171));
                startActivity(intent);
            }
        });
        alodoktorum_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+113));
                startActivity(intent);
            }
        });
        elektrik_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+186));
                startActivity(intent);
            }
        });
        su_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+185));
                startActivity(intent);
            }
        });
        telefonariza_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+121));
                startActivity(intent);
            }
        });

        cenaze_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+188));
                startActivity(intent);
            }
        });

        iskur_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+180));
                startActivity(intent);
            }
        });
        vergi_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData( Uri.parse("tel:"+189));
                startActivity(intent);
            }
        });










}
}
