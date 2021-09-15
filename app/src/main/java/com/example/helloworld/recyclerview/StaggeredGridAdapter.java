package com.example.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;


public class StaggeredGridAdapter extends RecyclerView.Adapter<StaggeredGridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickLisener mLisener;

    public StaggeredGridAdapter(Context context, OnItemClickLisener lisener){
        this.mContext = context;
        this.mLisener = lisener;
    }
    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggeredgrid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder holder, final int position) {
        if(position % 2 != 0){
            holder.imageView.setImageResource(R.drawable.image1);
        }else{
            holder.imageView.setImageResource(R.drawable.image2);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLisener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 80;
    }

    class LinearViewHolder extends  RecyclerView.ViewHolder{
        private ImageView imageView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.<ImageView>findViewById(R.id.iv);
        }
    }

    public interface OnItemClickLisener{
        void onClick(int pos);
    }
}
