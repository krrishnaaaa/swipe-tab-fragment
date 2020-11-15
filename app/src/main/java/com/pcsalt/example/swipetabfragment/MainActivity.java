package com.pcsalt.example.swipetabfragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

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
