package com.example.snk;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;

public class fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
    public void changeFragment(View view){
        Fragment fragment;
        if (view == findViewById(R.id.b)){
            fragment = new Fragment1();
            FragmentManager fn=getSupportFragmentManager();
            FragmentTransaction ft = fn.beginTransaction();
            ft.replace(R.id.fragmentplace, fragment);
            ft.commit();
        }
        if (view==findViewById(R.id.b2)) {
            fragment = new BlankFragment();
            FragmentManager fn=getSupportFragmentManager();
            FragmentTransaction ft=fn.beginTransaction();
            ft.replace(R.id.fragmentplace,fragment);
            ft.commit();
        }
    }
}