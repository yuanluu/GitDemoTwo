package com.youpude.gitdemo.gitdemotwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "�����Toast���ܣ�", Toast.LENGTH_SHORT).show();
        showToastOne();
    }

    private void showToastOne() {
        Toast.makeText(this, "���ǵڶ������Toast���ܣ�", Toast.LENGTH_SHORT).show();
    }
}
