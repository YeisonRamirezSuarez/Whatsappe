package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StatusFragment extends Fragment {

    private RecyclerView chatList;

    public static StatusFragment newInstance() {
        return new StatusFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);

        // Obtén una referencia a la lista de chat2s
        RecyclerView chatList = rootView.findViewById(R.id.chat_list);

        // Crea un LinearLayoutManager para la lista de chat2s
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        chatList.setLayoutManager(layoutManager);

        // Crea una lista de chat2s de ejemplo
        List<Status> statuses = new ArrayList<>();
        statuses.add(new Status("Chat 1", "Último mensaje del chat 1", "08:00"));
        statuses.add(new Status("Chat 2", "Último mensaje del chat 2", "09:00"));

        // Crea un adaptador personalizado para la lista de chat2s y configúralo
        StatusListAdapter adapter = new StatusListAdapter(statuses);
        chatList.setAdapter(adapter);

        return rootView;
    }
}
