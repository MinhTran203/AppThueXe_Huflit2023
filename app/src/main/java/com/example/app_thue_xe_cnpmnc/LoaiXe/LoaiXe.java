package com.example.app_thue_xe_cnpmnc.LoaiXe;

public class LoaiXe {
    public String getLoaiXeID() {
        return LoaiXeID;
    }

    public void setLoaiXeID(String loaiXeID) {
        LoaiXeID = loaiXeID;
    }

    public String getTenLoaiXe() {
        return TenLoaiXe;
    }

    public void setTenLoaiXe(String tenLoaiXe) {
        TenLoaiXe = tenLoaiXe;
    }

    public String LoaiXeID;
    public String TenLoaiXe;
    public LoaiXe(String loaiXeID, String tenLoaiXe) {
        LoaiXeID = loaiXeID;
        TenLoaiXe = tenLoaiXe;
    }


}
