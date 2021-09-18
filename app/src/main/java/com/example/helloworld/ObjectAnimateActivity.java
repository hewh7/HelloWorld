package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ObjectAnimateActivity extends AppCompatActivity {

    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animate);

        tvTest = this.<TextView>findViewById(R.id.tv);

        //2s后沿y轴平移500
//        tvTest.animate().translationYBy(500).setDuration(2000).start();
        //2s后透明
    //    tvTest.animate().alpha(0).setDuration(2000).start();

        //监听
//        ValueAnimator valueAnimator = ValueAnimator.ofInt(0,100);
//        valueAnimator.setDuration(2000);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                //valueAnimator 实际的值
//                Log.d("aaaa",valueAnimator.getAnimatedValue()+"");
//                //动画的进度0-1
//                Log.d("aaaa",valueAnimator.getAnimatedFraction()+"");
//            }
//        });
//        valueAnimator.start();

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tvTest,"translationY",0,500,200,800);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }
}
