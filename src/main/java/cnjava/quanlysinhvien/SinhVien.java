/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cnjava.quanlysinhvien;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author THIEN
 */
public class SinhVien implements Serializable {
    String MSSV;
    String Ten;
    String NgaySinh;
    
    public SinhVien (String mssv, String ten, String ngaysinh) {
        this.MSSV = mssv;
        this.Ten = ten;
        this.NgaySinh = ngaysinh;
    }
    
    public String getMSSV() {
        return this.MSSV;
    }
    
    public String getTen () {
        return this.Ten;
    }
    
    public String getNgaySinh () {
        return this.NgaySinh;
    }
}
