package com.example.app_thue_xe_cnpmnc.DatXe;

public class DatXe {
    private String DatXeID;
    private String KhachHangID;
    private String LoaiXeID;
    private String NgayDat;
    private String NgayNhanXe;
    private String NgayTraXe;
    private String TrangThai;

    public String getDatXeID() {
        return DatXeID;
    }

    public void setDatXeID(String datXeID) {
        DatXeID = datXeID;
    }

    public String getKhachHangID() {
        return KhachHangID;
    }

    public void setKhachHangID(String khachHangID) {
        KhachHangID = khachHangID;
    }

    public String getLoaiXeID() {
        return LoaiXeID;
    }

    public void setLoaiXeID(String loaiXeID) {
        LoaiXeID = loaiXeID;
    }

    public String getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(String ngayDat) {
        NgayDat = ngayDat;
    }

    public String getNgayNhanXe() {
        return NgayNhanXe;
    }

    public void setNgayNhanXe(String ngayNhanXe) {
        NgayNhanXe = ngayNhanXe;
    }

    public String getNgayTraXe() {
        return NgayTraXe;
    }

    public void setNgayTraXe(String ngayTraXe) {
        NgayTraXe = ngayTraXe;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public DatXe(String datXeID, String khachHangID, String loaiXeID, String ngayDat, String ngayNhanXe, String ngayTraXe, String trangThai) {
        DatXeID = datXeID;
        KhachHangID = khachHangID;
        LoaiXeID = loaiXeID;
        NgayDat = ngayDat;
        NgayNhanXe = ngayNhanXe;
        NgayTraXe = ngayTraXe;
        TrangThai = trangThai;
    }
}

