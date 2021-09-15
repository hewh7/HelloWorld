package com.example.helloworld.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;


public class LinearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private OnItemClickLisener mLisener;

    public LinearAdapter(Context context,OnItemClickLisener lisener){
        this.mContext = context;
        this.mLisener = lisener;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == 0){
            return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,parent,false));
        }else{
            return new LinearViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item_2,parent,false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if(getItemViewType(position)==0){
            ((LinearViewHolder)holder).textView.setText("Hello World!");
        }else{
            ((LinearViewHolder2)holder).textView.setText("小灰灰加油呀！");
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLisener.onClick(position);
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        if(position % 2 == 0){
            return 0;
        }else{
            return 1;
        }
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

    class LinearViewHolder2 extends  RecyclerView.ViewHolder{
        private TextView textView;
        private ImageView imageView;

        public LinearViewHolder2(@NonNull View itemView) {
            super(itemView);
            textView = itemView.<TextView>findViewById(R.id.tv_title);
            imageView = itemView.<ImageView>findViewById(R.id.iv_image);
        }
    }
    public interface OnItemClickLisener{
        void onClick(int pos);
    }
}
