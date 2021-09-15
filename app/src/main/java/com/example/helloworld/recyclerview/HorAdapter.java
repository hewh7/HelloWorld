package com.example.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;


public class HorAdapter extends RecyclerView.Adapter<HorAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickLisener mLisener;

    public HorAdapter(Context context, OnItemClickLisener lisener){
        this.mContext = context;
        this.mLisener = lisener;
    }
    @NonNull
    @Override
    public HorAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorAdapter.LinearViewHolder holder, final int position) {
        holder.textView.setText("Hello!");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLisener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends  RecyclerView.ViewHolder{
        private TextView textView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.<TextView>findViewById(R.id.tv_title);
        }
    }

    public interface OnItemClickLisener{
        void onClick(int pos);
    }
}
