package com.example.mytong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tt.whorlviewlibrary.WhorlView;

public class CeActivity extends AppCompatActivity {

    private WhorlView jing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce);
        initView();
    }

    private void initView() {
        jing = (WhorlView) findViewById(R.id.jing);
        jing.start();
    }
}
