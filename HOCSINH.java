package qlynvien;

import java.util.*;

 public class HOCSINH {
	    private int maso;
	    private String hoten;
	    private float dtb;
	    Scanner x=new Scanner(System.in);
	 public int getMaso()
	 {
	     return maso;
	 }
	 public void setMaso(int ms)
	 {
	     maso=ms;
	 }
	 public String getHoten()
	 {
	       return hoten;      
	 }
	public void setHoten(String ht)
	{
	    hoten=ht;
	}
	public float getDTB()
	{
	    return dtb;
	 
	}
	public void setDTB(float Dtb)
	{
	    dtb=Dtb;
	}
	public void inPut()
	{
	    System.out.print("Nhap ho ten: ");
	    hoten=x.nextLine();
	    System.out.print("Nhap ma so sinh vien:");
	    maso=x.nextInt();
	    System.out.print("Nhap DTB: ");
	    dtb=x.nextFloat();
	}
	public void outPut()
	{
	    System.out.print("\n"+"Ho ten: "+hoten);
	    System.out.print("\n"+"MSSV: "+maso);
	    System.out.print("\n"+"DTB: "+dtb);
	}

	}

