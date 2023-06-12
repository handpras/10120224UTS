package com.example.a10120224uts.menu.daily.friend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class daily_daily_activity extends Fragment {

    @Nullable
    RecyclerView recyclerView;
    ArrayList name_daily, images_daily;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.daily_daily_activity, container, false);
        recyclerView = view.findViewById(R.id.recycleView);
        images_daily = new ArrayList();
        name_daily = new ArrayList();
        for (int i = 0; i< com.example.a10120224uts.adapter.daily.adapter_daily_activity.name_daily.length; i++)
        {
            images_daily.add(com.example.a10120224uts.adapter.daily.adapter_daily_activity.images_daily);
            name_daily.add(com.example.a10120224uts.adapter.daily.adapter_daily_activity.name_daily);
        }
        com.example.a10120224uts.adapter.daily.helper_adapter_daily_activity helperAdapter = new com.example.a10120224uts.adapter.daily.helper_adapter_daily_activity(getContext(), images_daily, name_daily);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(helperAdapter);

        return view;
    }
}
