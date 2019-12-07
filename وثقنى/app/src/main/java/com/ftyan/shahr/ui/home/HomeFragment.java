package com.ftyan.shahr.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ftyan.shahr.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final Button button1   =root.findViewById(R.id.button1);
        final TextView textView1 = root.findViewById(R.id.textView1);
        final Button  button2   =root.findViewById(R.id.button2);
        final TextView textView2 = root.findViewById(R.id.textView2);
        final Button  button3   =root.findViewById(R.id.button3);
        final TextView textView3= root.findViewById(R.id.textView3);
        final Button  button4   =root.findViewById(R.id.button4);
        final TextView textView4 = root.findViewById(R.id.textView4);
        final Button  button5   =root.findViewById(R.id.button5);
        final TextView textView5 = root.findViewById(R.id.textView5);
        final Button  button6   =root.findViewById(R.id.button6);
        final TextView textView6 = root.findViewById(R.id.textView6);
        final Button  button7   =root.findViewById(R.id.button7);
        final TextView textView7 = root.findViewById(R.id.textView7);
        final Button  button8   =root.findViewById(R.id.button8);
        final TextView textView8 = root.findViewById(R.id.textView8);
        final Button  button9   =root.findViewById(R.id.button9);
        final TextView textView9 = root.findViewById(R.id.textView9);
        final Button  button10   =root.findViewById(R.id.button10);
        final TextView textView10 = root.findViewById(R.id.textView10);
        final Button  button11   =root.findViewById(R.id.button11);
        final TextView textView11 = root.findViewById(R.id.textView11);
        final Button  button12   =root.findViewById(R.id.button12);
        final TextView textView12 = root.findViewById(R.id.textView12);
        final Button  button13   =root.findViewById(R.id.button13);
        final TextView textView13 = root.findViewById(R.id.textView13);
        final Button  button14   =root.findViewById(R.id.button14);
        final TextView textView14 = root.findViewById(R.id.textView14);
        final Button  button15   =root.findViewById(R.id.button15);
        final TextView textView15 = root.findViewById(R.id.textView15);
        final Button  button16   =root.findViewById(R.id.button16);
        final TextView textView16 = root.findViewById(R.id.textView16);
        final Button  button17   =root.findViewById(R.id.button17);
        final TextView textView17 = root.findViewById(R.id.textView17);
        final Button  button18   =root.findViewById(R.id.button18);
        final TextView textView18 = root.findViewById(R.id.textView18);
        final Button  button19    =root.findViewById(R.id.button19);
        final TextView textView19  = root.findViewById(R.id.textView19);
        final Button  button20    =root.findViewById(R.id.button20);
        final TextView textView20  = root.findViewById(R.id.textView20);
        final Button  button21    =root.findViewById(R.id.button21);
        final TextView textView21  = root.findViewById(R.id.textView21);
        final Button  button22    =root.findViewById(R.id.button22);
        final TextView textView22  = root.findViewById(R.id.textView22);
        final Button  button23    =root.findViewById(R.id.button23);
        final TextView textView23  = root.findViewById(R.id.textView23);
        final Button  button24   =root.findViewById(R.id.button24);
        final TextView textView24  = root.findViewById(R.id.textView24);
        final Button  button25    =root.findViewById(R.id.button25);
        final TextView textView25  = root.findViewById(R.id.textView25);
        final Button  button26   =root.findViewById(R.id.button26);
        final TextView textView26  = root.findViewById(R.id.textView26);


        button1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView1.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView2.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView3.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView4.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView5.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView6.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView6.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView7.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView8.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView9.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView10.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView11.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView12.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView13.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView14.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView15.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView16.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView17.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView18.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView19.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });


        button20.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView20.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView21.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView22.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView23.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView24.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView25.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView26.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });




        return root;
    }
}