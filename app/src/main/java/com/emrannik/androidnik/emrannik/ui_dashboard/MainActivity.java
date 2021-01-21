package com.emrannik.androidnik.emrannik.ui_dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction ;
    RecyclerView recyclerView ;
    List<item> mData;
    MenuAdapter adapter;

    // fragment codes
    public static final int DASHBOARD_CODE = 0 ;
    public static final int WIFI_CODE = 1 ;
    public static final int SETTINGS_CODE = 2 ;
    public static final int SCHOOL_CODE = 3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mData = new ArrayList<>();
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_school_black_24dp,SCHOOL_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_wifi_black_24dp,WIFI_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_settings_black_24dp,SETTINGS_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_school_black_24dp,SCHOOL_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_wifi_black_24dp,WIFI_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_settings_black_24dp,SETTINGS_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_school_black_24dp,SCHOOL_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_wifi_black_24dp,WIFI_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_settings_black_24dp,SETTINGS_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        adapter = new MenuAdapter(this,mData);
        recyclerView.setAdapter(adapter);



        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        // Dashboard instantiate
        DashboardFrag dashboardFrag = new DashboardFrag();

        fragmentTransaction.replace(R.id.container,dashboardFrag);
        fragmentTransaction.commit();




    }
}
