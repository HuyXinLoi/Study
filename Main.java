package qlynvien;



import java.util.*;

/**
 * 21DTHE1
 * 2180608729
 * @HO PHUC THAI
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSNhanVien ds = new DSNhanVien();
        NhanVien nv;
        byte chon = 0;
        do {
            System.out.println("===============================================");
            System.out.println("CHUC NANG QUAN LY NHAN VIEN");
            System.out.println("1. Nhap thong tin nhan vien them vao danh sach" );
            System.out.println("2. In ra danh sach nhan vien");
            System.out.println("3. Nhan vien co he so luong max");
            System.out.println("4. Sap xep nhan vien giam dan theo luong co ban");
            System.out.println("5. In ra nhan vien co he so luong cao nhat.");
            System.out.println("0. Thoat chuc nang");
            System.out.println("===============================================");
            System.out.print("Moi chon chuc nang: ");
            chon = sc.nextByte();
            switch(chon){
                case 1:{
                    nv = new NhanVien();
                    nv.input();
                    ds.themVaoDSHS(nv);
                    break;
                } 
                case 2: {
                    ds.xuatDSNV();
                    break;
                }
                case 3: {
                    ds.maxHSL();
                    break;
                }
                case 4:
                    ds.SORT();
                    ds.xuatDSNV();
                    break;
                case 5:
                	ds.MAXHSL();
                    break;
                default: {
                    chon = 0;
                    break;
                }
            }
        } while (chon!=0);
    }
         
}
