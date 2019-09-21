package com.reyes.exer2_adrian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void validate(View v){
        String schoolSP = sp.getString("school",null);
        /*String school2SP = sp.getString("school2",null);
        String school3SP = sp.getString("school3",null);
        String school4SP = sp.getString("school4",null);
        String school5SP = sp.getString("school5",null);
        String school6SP = sp.getString("school6",null);
        String school7SP = sp.getString("school7",null);
        String school8SP = sp.getString("school8",null);*/
        String school1 = etSchool1.getText().toString();
        String school2 = etSchool2.getText().toString();
        String school3 = etSchool3.getText().toString();
        String school4 = etSchool4.getText().toString();
        String school5 = etSchool5.getText().toString();
        String school6 = etSchool6.getText().toString();
        String school7 = etSchool7.getText().toString();
        String school8 = etSchool8.getText().toString();

        if(schoolSP.equals(school1) || schoolSP.equals(school2) || schoolSP.equals(school3) || schoolSP.equals(school4) || schoolSP.equals(school5) || schoolSP.equals(school6) || schoolSP.equals(school7) || schoolSP.equals(school8)) {
            Toast.makeText(this, "School is valid.", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "School is not valid.", Toast.LENGTH_LONG).show();
        }
    }
}
