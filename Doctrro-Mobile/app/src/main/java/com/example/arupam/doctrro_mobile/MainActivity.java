package com.example.arupam.doctrro_mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ViewPager patientProfiePager;
    //private ViewPagerAdapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        patientProfiePager = (ViewPager)findViewById(R.id.pager);
        addTabs(patientProfiePager);
    }

    private void addTabs(ViewPager viewPager){
        // ViewPagerAdapter patientProfileAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    }
}
