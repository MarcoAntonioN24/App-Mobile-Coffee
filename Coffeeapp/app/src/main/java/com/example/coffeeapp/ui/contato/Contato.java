package com.example.coffeeapp.ui.contato;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.coffeeapp.R;
import com.example.coffeeapp.databinding.FragmentContatoBinding;
import com.example.coffeeapp.databinding.FragmentHomeBinding;


public class Contato extends Fragment {
    private FragmentContatoBinding binding;


    public Contato() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentContatoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        Button btnmap = root.findViewById(R.id.map);
        Button btnfone = root.findViewById(R.id.fone);

        btnfone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:19992937754"));
                startActivity(intent);

            }
        });

        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/place/Shopping+Piracicaba/@-22.7040081,-47.6498321,15z/data=!4m6!3m5!1s0x94c6317ebcbf4c1f:0x14c46a0ee49c4bce!8m2!3d-22.7040081!4d-47.6498321!16s%2Fg%2F11bydj8bm7?entry=ttu"));
                startActivity(intent);
            }
        });

        return root;
        // inflater.inflate(R.layout.fragment_contato, container, false);
    }
}