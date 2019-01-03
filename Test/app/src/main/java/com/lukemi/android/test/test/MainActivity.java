package com.lukemi.android.test.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        test();
    }

    private void test() {
        TextView view = findViewById(R.id.tv);
        float x = view.getX();
        float y = view.getY();
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        int width = view.getWidth();
        int height = view.getHeight();

        String text = "x = " + x
                + "\n" + "y = " + y
                + "\n" + "left = " + left
                + "\n" + "top = " + top
                + "\n" + "right = " + right
                + "\n" + "bottom = " + bottom
                + "\n" + "width = " + width
                + "\n" + "height = " + height;

        view.setText(text);
    }
}
