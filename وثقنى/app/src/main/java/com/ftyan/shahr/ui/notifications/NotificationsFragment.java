package com.ftyan.shahr.ui.notifications;

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

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
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
        return root;
    }
}