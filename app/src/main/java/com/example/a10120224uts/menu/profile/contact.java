package com.example.a10120224uts.menu.profile;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class contact extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_contact, container,false);


        TextView textView = view.findViewById(R.id.ig_akun);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView2 = view.findViewById(R.id.fb_akun);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

}
