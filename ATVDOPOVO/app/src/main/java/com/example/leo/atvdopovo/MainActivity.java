package com.example.leo.atvdopovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startTV2Activity (View view) {
        Intent tv2Activity = new Intent(this, TV2Activity.class);
        startActivity(tv2Activity);
    }
}
