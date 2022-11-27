package com.example.rishek.nura;

import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigation_bar;
    private fragment_about about_fragment;
    private fragment_contact contact_fragment;
    private fragment_home home_fragment;
    private fragment_photos photos_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_bar);
        navigation_bar=findViewById(R.id.navigation);
        about_fragment=new fragment_about();
        contact_fragment=new fragment_contact();
        home_fragment = new fragment_home();
        photos_fragment = new fragment_photos();
        navigation_bar.setSelectedItemId(R.id.homepage);
        setFragment(home_fragment);
        navigation_bar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.homepage:
                        setFragment(home_fragment);
                        break;
                    case R.id.about:
                        setFragment(about_fragment);
                        break;
                    case R.id.photos:
                        setFragment(photos_fragment);
                        break;
                    case R.id.cotact:
                        setFragment(contact_fragment);
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }
}
