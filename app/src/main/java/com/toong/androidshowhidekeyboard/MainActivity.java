package com.toong.androidshowhidekeyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.showKeyboard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppUtils.showSoftKeyboard(MainActivity.this);
            }
        });

        findViewById(R.id.hideKeyboard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppUtils.hideSoftKeyboard(MainActivity.this);
            }
        });
    }
}
