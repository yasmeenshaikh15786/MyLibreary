package com.example.yasmin.mylibreary;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.example.yasmin.mylibrary.MyView;

public class MainActivity extends Activity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      new MyView().test();

       /* MyView.test();*/

      /*  View v = new MyView(this);
        setContentView(v);*/


    }
}
