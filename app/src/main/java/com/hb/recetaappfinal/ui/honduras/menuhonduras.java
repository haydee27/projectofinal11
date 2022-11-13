package com.hb.recetaappfinal.ui.honduras;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.sv.MainActivitybebidas;
import com.hb.recetaappfinal.ui.sv.MainActivityplatof;
import com.hb.recetaappfinal.ui.sv.MainActivitypostres;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menuhonduras#newInstance} factory method to
 * create an instance of this fragment.
 */
public class menuhonduras extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public menuhonduras() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menuhonduras.
     */
    // TODO: Rename and change types and number of parameters
    public static menuhonduras newInstance(String param1, String param2) {
        menuhonduras fragment = new menuhonduras();
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

        View view =  inflater.inflate(R.layout.fragment_menuhonduras, container, false);
        Button btn1hActivity = (Button) view.findViewById(R.id.btnh1);
        Button btn2hActivity = (Button) view.findViewById(R.id.btnh2);
        Button btn3hActivity = (Button) view.findViewById(R.id.btnh3);

        btn1hActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitypostreh.class);
                startActivity(intent);
            }
        });

        btn2hActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitybebidah.class);
                startActivity(intent);
            }
        });

        btn3hActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivityplatofh.class);
                startActivity(intent);
            }
        });

        return view;
    }
}