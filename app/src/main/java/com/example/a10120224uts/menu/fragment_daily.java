package com.example.a10120224uts.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.a10120224uts.menu.daily.friend.daily_daily_activity;
import com.example.a10120224uts.menu.daily.friend.daily_friends_list;

public class fragment_daily extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        Button btn = (Button) view.findViewById(R.id.btn_daily);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_daily, new daily_daily_activity());
                fr.commit();
            }
        });

        Button btn1 = (Button) view.findViewById(R.id.btn_friend);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_daily, new daily_friends_list());
                fr.commit();
            }
        });
        return view;
    }
}
