package com.example.fragmentlisthomework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment  implements  ViewClickListener {

    MainAdapter adapter;
IInputFragment iInputFragment;
    public MainFragment() {
        // Required empty public constructor
        adapter = new MainAdapter();
        adapter.listener = this;

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.fragment_recycler_view);
        recyclerView.setAdapter(adapter);
        fullList(100);
    }

    public void fullList(int amount) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            list.add(i + 1 + ") Element");
        }
        adapter.data = list;
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onViewClick(String s) {
       iInputFragment.forResult(s);
    }
}




