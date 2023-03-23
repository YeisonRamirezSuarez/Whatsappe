package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.SpannableString;

import com.google.android.material.tabs.TabLayout;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new ChatFragment(), getString(R.string.chat_fragment_title));
        adapter.addFragment(new StatusFragment(), getString(R.string.status_fragment_title));
        adapter.addFragment(new CallFragment(), getString(R.string.call_fragment_title));
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }


}