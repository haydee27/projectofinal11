package com.hb.recetaappfinal.ui.sv;

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
 * Use the {@link menu2#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class menu2 extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menu2.
     */
    // TODO: Rename and change types and number of parameters
    public static menu2 newInstance(String param1, String param2) {
        menu2 fragment = new menu2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public menu2() {
        // Required empty public constructor
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
        View view =  inflater.inflate(R.layout.fragment_menu2, container, false);
        Button btn1Activity = (Button) view.findViewById(R.id.btn1);
        Button btn2Activity = (Button) view.findViewById(R.id.btn2);
        Button btn3Activity = (Button) view.findViewById(R.id.btn3);

        btn1Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitypostres.class);
                startActivity(intent);
            }
        });

        btn2Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivitybebidas.class);
                startActivity(intent);
            }
        });

        btn3Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivityplatof.class);
                startActivity(intent);
            }
        });

        return view;
    }
}