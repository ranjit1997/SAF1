package com.example.ranjeet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Product2 extends AppCompatActivity {

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


          ImageView IVHome;
          ImageView back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product2);

        gridview = (GridView) findViewById(R.id.customgrid3);
       gridview.setAdapter(new CustomAdapter(Product2.this, osNameList, osImages));


        // LinearLayout gallery = findViewById(R.id.gallery);
       // LayoutInflater inflater = LayoutInflater.from(this);

        //for ( int i=0;i<6;i++ ){

          //  View view = inflater.inflate(R.layout.activity_item, gallery, false);
           // TextView textView = view.findViewById(R.id.text);
            //textView.setText("activity_item"+ i);

          //  ImageView imageView = view.findViewById(R.id.IVItem);
          //  imageView.setImageResource(R.mipmap.ic_launcher);

         //   gallery.addView(view);
      //  }

        back1 = (ImageView) findViewById(R.id.back1);
        IVHome = (ImageView) findViewById(R.id.IVHome);



        IVHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Product2.this,ServicePage.class);
                startActivity(intent);
            }
        });



        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Product2.this,ServicePage.class);
                startActivity(intent);
            }
        });

    }
}
