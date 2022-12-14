package com.hb.recetaappfinal.ui.guatemala;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hb.recetaappfinal.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menuguatemala#newInstance} factory method to
 * create an instance of this fragment.
 */
public class menuguatemala extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public menuguatemala() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menuguatemala.
     */
    // TODO: Rename and change types and number of parameters
    public static menuguatemala newInstance(String param1, String param2) {
        menuguatemala fragment = new menuguatemala();
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
        View view = inflater.inflate(R.layout.fragment_menuguatemala, container, false);
        Button btng1Activit = (Button) view.findViewById(R.id.btng1);
        Button btng2Activit = (Button) view.findViewById(R.id.btng2);
        Button btng3Activit = (Button) view.findViewById(R.id.btng3);

        btng1Activit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitypostreg.class);
                startActivity(intent);
            }
        });

        btng2Activit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitybebidasg.class);
                startActivity(intent);
            }
        });

        btng3Activit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivityplatofg.class);
                startActivity(intent);
            }
        });

        return view;
    }
}