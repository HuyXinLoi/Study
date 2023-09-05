package qlynvien;

import java.util.*;

public class DSHOCSINH {
		   private HOCSINH ds[];
		   private int sl;
		   Scanner x=new Scanner(System.in);
		   public DSHOCSINH() {
		        // constructor to initialize the ds array
		        ds = new HOCSINH[100]; // set the initial size of the array to 100
		    }
		   public void nhapds(){
		       System.out.print("Nhap So Luong Hoc Sinh: ");
		       sl = x.nextInt();
		       for(int i =0; i<sl; i++)
		       {
		    	   System.out.printf("\nNhap Sinh Vien Thu %d\n", i+1);
		           ds[i] = new HOCSINH();
		           ds[i].inPut();
		       }
		   }
		   public void xuatds()
		   {
			   
		       for(int i =0; i<sl; i++)
		       {	   
		           System.out.printf("\nSinh Vien Thu %d La:" , i+1);
		           ds[i].outPut();
		       }
		   }
		   public void sapxepgiam()
		   {
		       
		       for(int i =0; i<sl-1; i++)
		       {
		           for(int j= i + 1 ; j<sl;j++)
		           {
		               if(ds[i].getDTB() < ds[j].getDTB())
		               {
		                   HOCSINH temp = ds[i];
		                   ds[i] = ds[j];
		                   ds[j] = temp;                    
		               }
		           }
		       }
		       System.out.println("\nSinh Vien Sau Khi Sap Xep La:");
		       xuatds();
		   }
		}

