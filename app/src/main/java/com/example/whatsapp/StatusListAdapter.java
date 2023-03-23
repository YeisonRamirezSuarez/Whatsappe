package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatusListAdapter extends RecyclerView.Adapter<StatusListAdapter.ViewHolder> {

    private List<Status> statusList;

    public StatusListAdapter(List<Status> statusList) {
        this.statusList = statusList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_status, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Status status = statusList.get(position);
        holder.titleTextView.setText(status.getTitle());
        holder.lastMessageTextView.setText(status.getLastMessage());
        holder.lastMessageTimeTextView.setText(status.getLastMessageTime());
    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTextView;
        public TextView lastMessageTextView;
        public TextView lastMessageTimeTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            lastMessageTextView = itemView.findViewById(R.id.last_message);
            lastMessageTimeTextView = itemView.findViewById(R.id.last_message_time);
        }
    }
}