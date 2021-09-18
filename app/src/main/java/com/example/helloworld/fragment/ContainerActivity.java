package com.example.helloworld.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.R;
import com.example.helloworld.jump.BActivity;

public class ContainerActivity extends AppCompatActivity implements AFragment.IOnMessageClick{

    private AFragment aFragment;
    private BFragment bFragment;
    private TextView mTvTitle;
//    private Button mBtnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        mTvTitle = this.<TextView>findViewById(R.id.tv_title);
//        mBtnChange = this.<Button>findViewById(R.id.btn_change);

//        mBtnChange.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(bFragment == null){
//                    bFragment = new BFragment();
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();
//            }
//        });

        //实例化AFragment
        //aFragment aFragment =  new AFragment();
        aFragment = AFragment.newInstance("我是参数");
        //把AFragment添加到指定Activity中,记得调用commit；
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,aFragment,"a").commitAllowingStateLoss();
    }

    public void setData(String text){
        mTvTitle.setText(text);
    }

    public void onClick(String text){
        mTvTitle.setText(text);
    }
}
