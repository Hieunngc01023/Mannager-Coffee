/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intity;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Chitiethd {
    private String maSp;
    private int soLuong;
    private float thanhTien;
    private String maHd;

    public Chitiethd() {
    }

    public Chitiethd(String maSp, int soLuong, float thanhTien, String maHd) {
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.maHd = maHd;
    }

    public String getMaSp() {
        return maSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
    }
    
}
