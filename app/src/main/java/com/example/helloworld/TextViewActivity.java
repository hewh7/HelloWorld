package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv4;
    private TextView mTv5,mTv6;
    private TextView mTv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4 = this.<TextView>findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTv4.getPaint().setAntiAlias(true);//去除锯齿

        mTv5 = this.<TextView>findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线

        mTv6 = this.<TextView>findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>小灰灰加油呀！</u>"));//下划线2

        mTv7 = this.<TextView>findViewById(R.id.tv_7);
        mTv7.setSelected(true);
    }
}
