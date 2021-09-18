package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.helloworld.fragment.AFragment;
import com.example.helloworld.fragment.ContainerActivity;
import com.example.helloworld.jump.AActivity;
import com.example.helloworld.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnRecyclerView;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnCustomDialog;
    private Button mBtnPopUpWindow;
    private Button mBtnLifeCycle;
    private Button mBtnJump;
    private Button mBtnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = this.<Button>findViewById(R.id.btn_textview);
        mBtnButton = this.<Button>findViewById(R.id.btn_button);
        mBtnEditText = this.<Button>findViewById(R.id.btn_edittext);
        mBtnRadioButton = this.<Button>findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = this.<Button>findViewById(R.id.btn_checkbox);
        mBtnImageView = this.<Button>findViewById(R.id.btn_imageview);
        mBtnRecyclerView = this.<Button>findViewById(R.id.btn_recycleview);
        mBtnWebView = this.<Button>findViewById(R.id.btn_webview);
        mBtnToast = this.<Button>findViewById(R.id.btn_toast);
        mBtnDialog = this.<Button>findViewById(R.id.btn_dialog);
        mBtnProgress = this.<Button>findViewById(R.id.btn_progress);
        mBtnCustomDialog = this.<Button>findViewById(R.id.btn_customdialog);
        mBtnPopUpWindow = this.<Button>findViewById(R.id.btn_popupwindow);
        mBtnLifeCycle = this.<Button>findViewById(R.id.btn_lifecycle);
        mBtnJump = this.<Button>findViewById(R.id.btn_jump);
        mBtnFragment = this.<Button>findViewById(R.id.btn_fragment);
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
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustomDialog.setOnClickListener(onClick);
        mBtnPopUpWindow.setOnClickListener(onClick);
        mBtnLifeCycle.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);
        mBtnFragment.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview:
                    intent = new Intent(UIActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(UIActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(UIActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent = new Intent(UIActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(UIActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_recycleview:
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;
                case R.id.btn_progress:
                    intent = new Intent(UIActivity.this,ProgressActivity.class);
                    break;
                case R.id.btn_customdialog:
                    intent = new Intent(UIActivity.this,CustomDialogActivity.class);
                    break;
                case R.id.btn_popupwindow:
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    break;
                case R.id.btn_lifecycle:
                    intent = new Intent(UIActivity.this,LifeCycleActivity.class);
                    break;
                case R.id.btn_jump:
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent = new Intent(UIActivity.this, ContainerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
