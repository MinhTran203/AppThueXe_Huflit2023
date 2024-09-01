package com.example.app_thue_xe_cnpmnc.DatXe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.app_thue_xe_cnpmnc.R;
import com.example.app_thue_xe_cnpmnc.Sever.Sever;
import com.example.app_thue_xe_cnpmnc.SoXe.SoXeAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DatXe_Activity extends AppCompatActivity {
ListView listviewdatxe;
ArrayList<DatXe> arrdatXe;
DatXe datXe;
DatxeAdapter datXeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_xe);
        arrdatXe = new ArrayList<>();

        AnhXa();
        getData();

    }
    private void getData() {
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Sever.getdatxe, new com.android.volley.Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {
                if (response != null) {
                    for (int i = 0; i < response.length(); i++) {
                        try {
                            JSONObject jsonObject = response.getJSONObject(i);

                            String datXeID = jsonObject.getString("DatXeID");
                            String khachHangID = jsonObject.getString("KhachHangID");
                            String loaiXeID = jsonObject.getString("LoaiXeID");
                            String ngayDat = jsonObject.getString("NgayDat");
                            String ngayNhanXe = jsonObject.getString("NgayNhanXe");
                            String ngayTraXe = jsonObject.getString("NgayTraXe");
                            String trangThai = jsonObject.getString("TrangThai");

                            arrdatXe.add(new DatXe(datXeID, khachHangID, loaiXeID, ngayDat, ngayNhanXe, ngayTraXe, trangThai));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    datXeAdapter.notifyDataSetChanged();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DatXe_Activity.this, "Có lỗi xảy ra: " + error.getMessage(), Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }


        });
        requestQueue.add(jsonArrayRequest);
    }


    private void AnhXa() {
        listviewdatxe = findViewById(R.id.listviewdatxe);
        //Listview set up
        datXeAdapter = new DatxeAdapter(getApplicationContext(),arrdatXe);
        listviewdatxe.setAdapter(datXeAdapter);
    }
}