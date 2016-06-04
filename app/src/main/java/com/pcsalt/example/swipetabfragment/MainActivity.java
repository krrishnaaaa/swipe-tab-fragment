package com.pcsalt.example.swipetabfragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.pcsalt.example.swipetabfragment.adapter.MyPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private MyPagerAdapter mPagerAdapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        addAdapter();

    }

    private void init() {
        mPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
    }

    private void addAdapter() {
        mViewPager.setAdapter(mPagerAdapter);
    }
}
