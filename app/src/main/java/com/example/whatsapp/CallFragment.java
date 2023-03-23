package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CallFragment extends Fragment {

    private RecyclerView recyclerView;
    private CallListAdapter adapter;
    private List<Call> callList;

    public CallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call, container, false);

        recyclerView = view.findViewById(R.id.call_list);
        callList = new ArrayList<>();
        adapter = new CallListAdapter(callList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareCallData();

        return view;
    }

    private void prepareCallData() {
        Call call = new Call("John Doe", "10 minutes ago", R.drawable.ic_launcher_background);
        callList.add(call);

        call = new Call("Jane Doe", "1 hour ago", R.drawable.ic_launcher_background);
        callList.add(call);

        call = new Call("Bob Smith", "2 hours ago", R.drawable.ic_launcher_background);
        callList.add(call);

        adapter.notifyDataSetChanged();
    }
}
