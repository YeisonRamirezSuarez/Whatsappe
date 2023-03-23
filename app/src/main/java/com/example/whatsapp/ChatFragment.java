package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    private RecyclerView recyclerView;
    private ChatListAdapter adapter;
    private List<Chat> chatList;

    public ChatFragment() {
        // Constructor vacío requerido
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);

        // Inicializa la lista de estados
        chatList = new ArrayList<>();

        // Agrega algunos estados de prueba
        chatList.add(new Chat("Juan", "Hace 30 minutos", R.drawable.ic_launcher_background));
        chatList.add(new Chat("Maria", "Hace 1 hora", R.drawable.ic_launcher_background));
        chatList.add(new Chat("Carlos", "Hace 2 horas", R.drawable.ic_launcher_background));
        chatList.add(new Chat("Luis", "Hace 3 horas", R.drawable.ic_launcher_background));
        chatList.add(new Chat("Ana", "Hace 4 horas", R.drawable.ic_launcher_background));

        // Inicializa y configura el RecyclerView y el adaptador
        recyclerView = view.findViewById(R.id.status_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ChatListAdapter(chatList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}