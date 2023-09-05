package qlynvien;

import java.util.*;

/**
 * 21DTHE1
 * 2180608729
 * @HO PHUC THAI
 */

public class DSNhanVien {
    ArrayList<NhanVien> dsnv;
    public DSNhanVien(){
        dsnv = new ArrayList<NhanVien>();
    }
    public void themVaoDSHS (NhanVien nv){
        dsnv.add(nv);
    }
    public void xuatDSNV(){
        for (int i = 0; i < dsnv.size(); i++) {
            dsnv.get(i).output();
        }
    }
    public void maxHSL(){
        String ten = " ";
        int max = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            max = dsnv.get(i).getHeSoLuong();
            ten = dsnv.get(i).getHoTen();
            for (int j = i+1; j < dsnv.size(); j++) {
                if(max < dsnv.get(j).getHeSoLuong()){
                    max = dsnv.get(j).getHeSoLuong();
                    ten = dsnv.get(j).getHoTen();
                }
            }
        }
        System.out.println("Ten nhan vien co luong cao nhat la: " + ten);
    }
    public void SORT(){
        for (int i = 0; i < dsnv.size()-1; i++) {
            for (int j = i+1; j < dsnv.size(); j++) {
                if(dsnv.get(i).getLuongCoBan()< dsnv.get(j).getLuongCoBan()){
                    NhanVien temp = dsnv.get(i);
                    dsnv.set(i, dsnv.get(j));
                    dsnv.set(j, temp);
                }
            }
        }
    }
    public void MAXHSL(){
        float max = 0;
        String hoten = "",ms = "";
        float lcb = 0;
        
        for(int i=0; i<dsnv.size();i++){
            if(dsnv.get(i).getHeSoLuong() > max){
                max = dsnv.get(i).getHeSoLuong();
                hoten = dsnv.get(i).getHoTen();
                ms = dsnv.get(i).getMaSo();
                lcb = dsnv.get(i).getLuongCoBan();
            }
        }
        System.out.println("Ms:" + ms + "\tHoten:" + hoten + "\tLCB:" + lcb + "\tHSL:" + max);
    }
    
}
