package com.example.ranjeet.login;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.GridView;



public class ServicePage extends AppCompatActivity {
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
    ImageView os_images;
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


//    TextView Location_bt;
//    LocationManager locationManager;
     public static final int CAMERA_REQUEST=9999;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_page);

        //LinearLayout gallery = findViewById(R.id.gallery);
       // LayoutInflater inflater = LayoutInflater.from(this);

        IVSearch = findViewById(R.id.IVSearch);
        IVProfile = findViewById(R.id.IVProfile);
        tvsell = findViewById(R.id.tvsell);
        Hostel = findViewById(R.id.Hostel);
        IVSusity = findViewById(R.id.IVSusity);
        IVRoom = findViewById(R.id.IVRoom);
        IVDry = findViewById(R.id.IVDry);
        IVHotel = findViewById(R.id.IVHotel);
        Filters = findViewById(R.id.Filters);
        os_images = findViewById(R.id.os_images);
        //Location_bt =(TextView)findViewById(R.id.Location_button);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(this, osNameList, osImages));





        //     for ( int i=0;i<6;i++ ){

  //          View view = inflater.inflate(R.layout.activity_item, gallery, false);
    //        TextView textView = view.findViewById(R.id.text);
      //      textView.setText("activity_item"+ i);

        //    ImageView imageView = view.findViewById(R.id.IVItem);
          //  imageView.setImageResource(R.mipmap.ic_launcher);


            //gallery.addView(view);
        //}

//        if (ContextCompat.checkSelfPermission(getApplicationContext(),
//                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
//                ActivityCompat.checkSelfPermission(getApplicationContext(),
//                        android.Manifest.permission.ACCESS_COARSE_LOCATION)
//                        != PackageManager.PERMISSION_GRANTED) {
//
//            ActivityCompat.requestPermissions(this, new String[]
//                    {android.Manifest.permission.ACCESS_FINE_LOCATION,
//                    android.Manifest.permission.ACCESS_COARSE_LOCATION}, 101);
//
//        }
//
//        Location_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getLocation();
//            }
//        });



        tvsell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent,CAMERA_REQUEST);


            }
        });




        Hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,Product.class);
                startActivity(intent);
            }
        });



        IVSusity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,Product1.class);
                startActivity(intent);
            }
        });



        IVRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,Product2.class);
                startActivity(intent);
            }
        });




        IVDry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,Product3.class);
                startActivity(intent);
            }
        });




        IVHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,Product4.class);
                startActivity(intent);
            }
        });




        Filters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,Filterpage.class);
                startActivity(intent);
            }
        });



        IVSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,AppMenu.class);
                startActivity(intent);
            }
        });



        IVProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ServicePage.this,Profile.class);
                startActivity(intent);
            }
        });




    }
//    void getLocation() {
//        try {
//            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 5, (LocationListener) this);
//        }
//        catch(SecurityException e) {
//            e.printStackTrace();
//        }
//    }


}
