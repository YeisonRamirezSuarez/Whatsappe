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

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.ViewHolder> {

    private List<Chat> chatList;

    public ChatListAdapter(List<Chat> chatList) {
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_chat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chat chat = chatList.get(position);
        holder.nameTextView.setText(chat.getName());
        holder.timeTextView.setText(chat.getTime());
        Glide.with(holder.itemView)
                .load(chat.getImage())
                .circleCrop()
                .into(holder.imageView);
        //holder.imageView.setImageResource(status.getImage());
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView timeTextView;
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.status_name);
            timeTextView = itemView.findViewById(R.id.status_time);
            imageView = itemView.findViewById(R.id.status_image);

        }
    }
}