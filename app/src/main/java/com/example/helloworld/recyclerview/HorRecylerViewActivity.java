package com.example.helloworld.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.helloworld.R;

public class HorRecylerViewActivity extends AppCompatActivity {

    private RecyclerView mRvHor;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recyler_view);

        mRvHor = this.<RecyclerView>findViewById(R.id.rv_hor);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HorRecylerViewActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRvHor.setLayoutManager(linearLayoutManager);
        mRvHor.addItemDecoration(new MyDecoration());
        mRvHor.setAdapter(new HorAdapter(HorRecylerViewActivity.this, new HorAdapter.OnItemClickLisener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(HorRecylerViewActivity.this,"click:"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerhHeight1),0);
        }
    }
}
