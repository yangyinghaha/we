package com.example.administrator.car;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import java.util.ArrayList;

import fragment.ZixunFragment;

/**
 * Created by Administrator on 2015/4/20.
 */
public class ZhuyaoActivity extends ActionBarActivity {
    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuyao_activity_main);
        viewPager= (ViewPager) findViewById(R.id.viewpager_main);
        ZixunFragment fragment1=new ZixunFragment();
        fragmentlist=new ArrayList<Fragment>();
        fragmentlist.add(fragment1);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    }
    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentlist.get(position);
        }

        @Override
        public int getCount() {
            return fragmentlist.size();
        }
    }
}
