package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.helloworld.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = this.<Button>findViewById(R.id.btn_textview);
        mBtnButton = this.<Button>findViewById(R.id.btn_button);
        mBtnEditText = this.<Button>findViewById(R.id.btn_edittext);
        mBtnRadioButton = this.<Button>findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = this.<Button>findViewById(R.id.btn_checkbox);
        mBtnImageView = this.<Button>findViewById(R.id.btn_imageview);
        mBtnRecyclerView = this.<Button>findViewById(R.id.btn_recycleview);
        setListeners();
    }
    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnRecyclerView.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_recycleview:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
