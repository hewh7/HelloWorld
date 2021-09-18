package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.helloworld.util.ToastUtil;
import com.example.helloworld.widget.MyButton;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnEvent;
    private MyButton btnMy;
    private Button mBtnHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        mBtnEvent = this.<Button>findViewById(R.id.btn_event);
        btnMy = this.<MyButton>findViewById(R.id.btn_my);
        mBtnHandler = this.<Button>findViewById(R.id.btn_handler);

        mBtnHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventActivity.this,HandlerActivity.class);
                startActivity(intent);
            }
        });

//监听优于回调
        btnMy.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.d("Lisener","----onTouch----");
                        break;
                }
                return false;
            }
        });
        btnMy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Lisener","----onClick----");
            }
        });

        btnMy.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });

//内部类
//        mBtnEvent.setOnClickListener(new OnClick());
//匿名内部类
//        mBtnEvent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ToastUtil.showMsg(EventActivity.this,"click...");
//            }
//        });
//事件源所在activity实现
//        mBtnEvent.setOnClickListener(EventActivity.this);
// 通过内部类实现
    class OnClick implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_event:
                ToastUtil.showMsg(EventActivity.this,"click...");
                break;
            }
        }
    }

//通过外部类实现
        mBtnEvent.setOnClickListener(new MyClickLisener(EventActivity.this));
  }
//通过事件源所在activity实现
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_event:
                    ToastUtil.showMsg(EventActivity.this,"click...");
                    break;
            }
        }

    public void show(View v){
        switch (v.getId()){
            case R.id.btn_event:
                ToastUtil.showMsg(EventActivity.this,"click...");
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("Activity","----onTouchEvent----");
                break;
        }
        return false;
    }
}
//Q:给同一事件源添加多个同种类型监听器会怎样？
//A:系统只会执行最后一个设置的监听器，其它的都不会执行，且xml上设置的监听器默认为最早设置。
