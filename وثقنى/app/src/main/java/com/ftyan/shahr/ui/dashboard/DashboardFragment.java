package com.ftyan.shahr.ui.dashboard;

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

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final Button  button1   =root.findViewById(R.id.button_1);
        final TextView textView1 = root.findViewById(R.id.textView_1);
        final Button  button2   =root.findViewById(R.id.button_2);
        final TextView textView2 = root.findViewById(R.id.textView_2);
        final Button  button3   =root.findViewById(R.id.button_3);
        final TextView textView3= root.findViewById(R.id.textView_3);
        final Button  button4   =root.findViewById(R.id.button_4);
        final TextView textView4 = root.findViewById(R.id.textView_4);
        final Button  button5   =root.findViewById(R.id.button_5);
        final TextView textView5 = root.findViewById(R.id.textView_5);
        final Button  button6   =root.findViewById(R.id.button_6);
        final TextView textView6 = root.findViewById(R.id.textView_6);
        final Button  button7   =root.findViewById(R.id.button_7);
        final TextView textView7 = root.findViewById(R.id.textView_7);
        final Button  button8   =root.findViewById(R.id.button_8);
        final TextView textView8 = root.findViewById(R.id.textView_8);
        final Button  button9   =root.findViewById(R.id.button_9);
        final TextView textView9 = root.findViewById(R.id.textView_9);
        final Button  button10   =root.findViewById(R.id.button_10);
        final TextView textView10 = root.findViewById(R.id.textView_10);
        final Button  button11   =root.findViewById(R.id.button_11);
        final TextView textView11 = root.findViewById(R.id.textView_11);
        final Button  button12   =root.findViewById(R.id.button_12);
        final TextView textView12 = root.findViewById(R.id.textView_12);
        final Button  button13   =root.findViewById(R.id.button_13);
        final TextView textView13 = root.findViewById(R.id.textView_13);
        final Button  button14   =root.findViewById(R.id.button_14);
        final TextView textView14 = root.findViewById(R.id.textView_14);
        final Button  button15   =root.findViewById(R.id.button_15);
        final TextView textView15 = root.findViewById(R.id.textView_15);
        final Button  button16   =root.findViewById(R.id.button_16);
        final TextView textView16 = root.findViewById(R.id.textView_16);
        final Button  button17   =root.findViewById(R.id.button_17);
        final TextView textView17 = root.findViewById(R.id.textView_17);
        final Button  button18   =root.findViewById(R.id.button_18);
        final TextView textView18 = root.findViewById(R.id.textView_18);
        final Button  button19    =root.findViewById(R.id.button_19);
        final TextView textView19  = root.findViewById(R.id.textView_19);



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
        return root;
    }
}