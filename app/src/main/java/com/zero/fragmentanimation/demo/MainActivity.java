package com.zero.fragmentanimation.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.zero.fragmentanimation.R;
import com.zero.fragmentanimation.openGL.FragAnimLayout;

/**
 * @author linzewu
 * @date 2017/7/11
 */

public class MainActivity extends Activity {

    private FragAnimLayout mFragAnimLayout;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.main_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimation();
            }
        });
    }
    
    private void startAnimation() {
        mFragAnimLayout = (FragAnimLayout) findViewById(R.id.main_layout);
        mFragAnimLayout.startAnimation();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mFragAnimLayout != null) {
            mFragAnimLayout.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mFragAnimLayout != null) {
            mFragAnimLayout.onPause();
        }
    }
}
