package com.example.app_thue_xe_cnpmnc.Sever;

public class Sever {
    public static String localhost = "192.168.10.130"; //172.16.40.76 wifi Huflit-GV 10.21.249.88
    //192.168.10.134 wifi nhà
    //Lấy dữ liệu
    public static String getloaixe = "http://" + localhost + "/sever/getloaixe.php";
    public static String gettknhanvien = "http://" + localhost + "/sever/gettknhanvien.php";
    public static String getsoxe = "http://" + localhost + "/sever/getsoxe.php";
    public static String getdatxe = "http://" + localhost + "/sever/getsodatxe.php";

    //Thêm
    public static String themloaixe = "http://" + localhost + "/sever/themloaixe.php";
    public static String dangkytk = "http://" + localhost + "/sever/dangkytk.php";
    //Sửa
    public static String sualoaixe = "http://" + localhost + "/sever/updateloaixe.php";
    //Xóa
    public static String xoaloaixe = "http://" + localhost + "/sever/xoaloaixe.php";
}
