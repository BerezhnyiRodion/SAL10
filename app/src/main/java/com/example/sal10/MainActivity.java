package com.example.sal10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity //implements OnClickListener
                                                    {

    TextView TvOut;
    Button BtnOk;
    Button BtnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TvOut = (TextView) findViewById(R.id.tvOut);
        BtnOk = (Button) findViewById(R.id.btnOk);
        BtnCancel = (Button) findViewById(R.id.btnCancel);
//          -----------------------2way-----------------
//        BtnOk.setOnClickListener(this);
//        BtnCancel.setOnClickListener(this);
//                 ---------------- 1Way ----------------
//        OnClickListener OclButton = new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()){
//                    case R.id.btnOk:
//                        TvOut.setText("OK button pressed");
//                        break;
//                        case R.id.btnCancel:
//                            TvOut.setText("Cancel button pressed");
//                            break;
//
//                }
//            }
//        };
//
//        BtnOk.setOnClickListener(OclButton);
//        BtnCancel.setOnClickListener(OclButton);


    }
//                  --------------------2way------------------
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btnOk:
//                TvOut.setText("OK button pressed");
//                break;
//            case R.id.btnCancel:
//                TvOut.setText("Cancel button pressed");
//                break;
//        }
//    }
        public void onClickOk(View v) {
    TvOut.setText("OK button pressed");
}
        public void onClickCancel(View v) {
        TvOut.setText("Cancel button pressed");
        }
}