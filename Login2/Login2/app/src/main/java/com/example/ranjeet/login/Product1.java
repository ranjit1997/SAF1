package com.example.ranjeet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class Product1 extends AppCompatActivity {


    ListView Listview;
    ImageView tvsell;
    ImageView Hostel;
    ImageView IVSusity;
    ImageView IVRoom;
    ImageView IVHotel;
    ImageView IVDry;
    TextView Filters;
    ImageView IVSearch;
    ImageView IVProfile;
    ImageView cancel;
    ImageView IVHome;
    GridView gridview;

    public static String[] osNameList = {
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
    };
    public static int[] osImages = {
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,};


    ImageView back;
    String key = "AIzaSyBj91Ixfl6MTQ1Fahu2L7aGz03Wvotf2HQ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);

        gridview = (GridView) findViewById(R.id.customgrid2);
        gridview.setAdapter(new CustomAdapter(Product1.this, osNameList, osImages));



        back = (ImageView) findViewById(R.id.back );

        IVHome = (ImageView) findViewById(R.id.IVHome);



        IVHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Product1.this,ServicePage.class);
                startActivity(intent);
            }
        });



        back .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Product1.this,ServicePage.class);
                startActivity(intent);
            }
        });

    }
}
