package Bai4;

import java.util.ArrayList;
public class Danhsach {
	private ArrayList<GiaoDichDat> ds;

	public Danhsach() {
		this.ds = new ArrayList<>();
	}
	public void add(GiaoDichDat a) {
		this.ds.add(a);
	}
	public void Inmang() {
		for (GiaoDichDat giaoDichDat : ds) {
			System.out.println(giaoDichDat);
		}
	}
	
	public void count() {
		int temp = 0, temp1= 0;
		for (GiaoDichDat giaoDichDat : ds) {
			if(giaoDichDat instanceof GiaoDichDat)
				temp++;
			else 
				temp1++;
		}
		System.out.printf("Tong so luong" ,temp, temp1);
	}
	public double tinhTB() {
		double tong=0, TBC=0;
		int dem=0;
		for (GiaoDichDat giaoDichDat : ds) {
			if(giaoDichDat instanceof GiaoDichDat){
				dem++;
				tong+=giaoDichDat.thanhtien();
				TBC=tong/dem;
			}System.out.println("Trung binh cong: " +TBC);	
		}return TBC;
	}
}
