package com.example.app_thue_xe_cnpmnc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app_thue_xe_cnpmnc.DangNhap.DangNhapNV;
import com.example.app_thue_xe_cnpmnc.DatXe.DatXe_Activity;
import com.example.app_thue_xe_cnpmnc.LoaiXe.LoaiXe_Activity;
import com.example.app_thue_xe_cnpmnc.SoXe.SoXe_Activity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onlcick_LoaiXe(View view) {
        Intent intent = new Intent(Main2Activity.this, LoaiXe_Activity.class);
        startActivity(intent);
    }

    public void DangNhap(View view) {
        Intent intent = new Intent(Main2Activity.this, DangNhapNV.class);
        startActivity(intent);
    }

    public void SoXe(View view) {
        Intent intent = new Intent(Main2Activity.this, SoXe_Activity.class);
        startActivity(intent);
    }

    public void DatXe(View view) {
        Intent intent = new Intent(Main2Activity.this, DatXe_Activity.class);
        startActivity(intent);
    }
}