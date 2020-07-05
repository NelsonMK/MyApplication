package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    private void ShowDialogCool(String cool, String ctv1, String ctv2) {
        Button back;
        TextView tv1, tv2;
        ImageView status;

        Context context;
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.cool);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER);
        window.getAttributes().windowAnimations = R.style.DialogAimation;

        back = dialog.findViewById(R.id.back);
        tv1 = dialog.findViewById(R.id.ctv1);
        tv2 = dialog.findViewById(R.id.ctv2);
        status = dialog.findViewById(R.id.status);

        tv1.setText(ctv1);
        tv2.setText(ctv2);

        if (yes.equals("laugh")){
            status.setImageResource(R.drawable.cool);
            tv1.setTextColor(getResources().getColor(R.color.red));
            back.setBackgroundResource(R.drawable.red);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(false);
        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }
}