package com.hb.recetaappfinal.ui.panama;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.nicaragua.MainActivitybebidasn;
import com.hb.recetaappfinal.ui.nicaragua.MainActivityplatofn;
import com.hb.recetaappfinal.ui.nicaragua.MainActivitypostresn;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menupanama#newInstance} factory method to
 * create an instance of this fragment.
 */
public class menupanama extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public menupanama() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menupanama.
     */
    // TODO: Rename and change types and number of parameters
    public static menupanama newInstance(String param1, String param2) {
        menupanama fragment = new menupanama();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menupanama, container, false);
        Button btnp1Activit = (Button) view.findViewById(R.id.btnp1);
        Button btnp2Activit = (Button) view.findViewById(R.id.btnp2);
        Button btnp3Activit = (Button) view.findViewById(R.id.btnp3);

        btnp1Activit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitypostrep.class);
                startActivity(intent);
            }
        });

        btnp2Activit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitybebidap.class);
                startActivity(intent);
            }
        });

        btnp3Activit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivityplatofp.class);
                startActivity(intent);
            }
        });

        return view;
    }
}