package com.test.yooki.testbb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String a1 = "你好";
        String a2 = "鸠摩智";
        //A对象的getString方法持有了变量a1 a2
        A a = A.createA(a1, a2);

        //字符串置空后 可以看到A对象的getString方法仍然持有值
        a1 = null;
        a2 = null;

        String s = a.getString(new B());
        Log.d("MainActivity", "s==" + s);
    }
}
