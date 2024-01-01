package com.example.coffeeapp.ui.sobre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.coffeeapp.databinding.FragmentSobreBinding;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        String descricao = "Criada em 1974 por Marco Antonio,nossa loja oferece a experiência de se deliciar ao apreciar música de qualidade . ";

        return new AboutPage(getActivity())



                .setDescription(descricao)


               // .setImage(R.drawable.dummy_image)
               // .addItem(versionElement)
                //.addItem(adsElement)
                .addGroup("Connect with us")
                .addEmail("elmehdi.sakout@gmail.com")
                .addWebsite("https://mehdisakout.com/")
                .addFacebook("the.medy")
                .addTwitter("medyo80")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addGitHub("medyo")
                .addInstagram("medyo80")
                .create();
    }
}