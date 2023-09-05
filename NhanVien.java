package qlynvien;


import java.util.*;

/**
 * 21DTHE1
 * 2180608729
 * @HO PHUC THAI
 */
public class NhanVien {

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    private String maSo, hoTen;
    private int luongCoBan, heSoLuong;

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap MSNV: ");
        maSo = sc.nextLine();
        System.out.print("Nhap ho ten nv: ");
        hoTen = sc.nextLine();
        System.out.print("Luong co ban: ");
        luongCoBan = sc.nextInt();
        System.out.print("He So Luong: ");
        heSoLuong = sc.nextInt();
    }

    public void output(){
        System.out.print("MSNV: " + maSo + "  HoTen: " + hoTen + "  LuongCoBan: " + luongCoBan +"  HeSoLuong: " + heSoLuong+ "\n");
    }
    
    
}
