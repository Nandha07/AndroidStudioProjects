package com.example.nandhakumar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

     Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.log);
        toolbar.setTitle("snk");
        toolbar.setSubtitle("game");
        toolbar.setSubtitleTextColor(getResources().getColor(R.color.black));

       /* findViewById(R.id.button).setonClickListener(new View.onClickListener());
        {
            @Override
            public void onclickListener (View v)
            {
                clicked_btn("http://youtube");
            }
        }

    }

    public void clicked_btn(String url){
    Intent intent=new Intent(Intent.ACTION_VIEW);
    intent.setData(Uri.parse(url));
    startActivity(intent);
    }*/
    }


    public void bt1(View v){
        Intent i=new Intent( this,page1.class);
        startActivity(i);
    }

    public void bt3(View v) {

        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}