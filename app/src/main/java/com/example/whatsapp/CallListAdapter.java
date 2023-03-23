package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CallListAdapter extends RecyclerView.Adapter<CallListAdapter.ViewHolder> {

    private List<Call> callList;

    public CallListAdapter(List<Call> callList) {
        this.callList = callList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_call, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Call call = callList.get(position);
        holder.nameTextView.setText(call.getName());
        holder.timeTextView.setText(call.getTime());
        Glide.with(holder.itemView)
                .load(call.getIcon())
                .circleCrop()
                .into(holder.iconImageView);
        //holder.iconImageView.setImageResource(call.getIcon());
    }

    @Override
    public int getItemCount() {
        return callList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView timeTextView;
        public ImageView iconImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.call_name);
            timeTextView = itemView.findViewById(R.id.call_time);
            iconImageView = itemView.findViewById(R.id.call_icon);
        }
    }
}