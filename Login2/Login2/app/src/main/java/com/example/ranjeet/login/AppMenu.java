package com.example.ranjeet.login;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.google.android.gms.location.places.Places;

public class AppMenu extends AppCompatActivity {
    private AutoCompleteTextView mSearchText;
    private PlaceAutocompleteAdapter mplaceAutoCompleteAdapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_menu);


    }

}
    /*    mSearchText = (AutoCompleteTextView) findViewById(R.id.input_search);
        init();


    private void init(){
        mplaceAutoCompleteAdapter = new PlaceAutocompleteAdapter(this,);
        mSearchText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (       actionId == EditorInfo.IME_ACTION_SEARCH
                        || actionId == EditorInfo.IME_ACTION_DONE)
                {
                    //execute our search method
                    Intent i = new Intent(AppMenu.this, item.class);
                    startActivity(i);
                }
                return false;
            }
        });


    }

}*/
