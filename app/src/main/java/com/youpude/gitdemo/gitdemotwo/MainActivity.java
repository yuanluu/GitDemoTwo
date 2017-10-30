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
        showToastTwo();
        showHelloWorldTwo();
        showJavaWorld();
        showJavaWorldTwo();
        testOne();
    }

    private void testOne() {

    }

    private void showJavaWorldTwo() {
        Toast.makeText(this, "��ʾJava World Two��", Toast.LENGTH_SHORT).show();
    }

    private void showJavaWorld() {
        Toast.makeText(this, "��ʾJava World��", Toast.LENGTH_SHORT).show();
    }

    private void showHelloWorldTwo() {
        Toast.makeText(this, "��ʾHello World��", Toast.LENGTH_SHORT).show();
    }

    private void showToastOne() {
        Toast.makeText(this, "���ǵڶ������Toast���ܣ�", Toast.LENGTH_SHORT).show();
    }

    private void showToastTwo() {
        Toast.makeText(this, "���ǵ��������Toast���ܣ�", Toast.LENGTH_SHORT).show();
    }
}
