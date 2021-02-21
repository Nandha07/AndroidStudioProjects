package com.example.snk;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;


public class MainActivity<toolbar> extends AppCompatActivity {

    Menu share;
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt3 =findViewById(R.id.bt3);


    }

    public void bt1(View v) {
        Intent i = new Intent(this, page1.class);
        startActivity(i);
    }

    public void bt2(View v) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
    public void bt3(View v) {
        Intent i = new Intent(this, fragment.class);
        startActivity(i);
    }

    @Override

    public void onBackPressed() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are you sure want to exit");
        builder.setCancelable(true);


        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();

            }
        });
        builder.setNegativeButton("NO!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();

        alertDialog.show();

    }

    public void button2(View V) {

        Intent share = new Intent(android.content.Intent.ACTION_SEND);

        share.setType("text/plain");

        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

        share.putExtra(Intent.EXTRA_SUBJECT, "hi this my app");

        share.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());

        startActivity(Intent.createChooser(share, "Share to Friends!"));
    }
    public void clicked_btn(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.share) {
            Intent share = new Intent(android.content.Intent.ACTION_SEND);

            share.setType("text/plain");

            share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

            share.putExtra(Intent.EXTRA_SUBJECT, "hi this my app");

            share.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());

            startActivity(Intent.createChooser(share, "Share to Friends!"));
            return true;
        }
        int i = item.getItemId();
        if (i == R.id.settings) {
            Intent settings = new Intent(MainActivity.this, settings.class);
            startActivity(settings);
            return true;
        }
        return true;
    }
}

