package Bai3;

import java.util.ArrayList;
public class DanhsachGD {
	private ArrayList<GiaoDichTienTe> ds;

	public DanhsachGD() {
		this.ds = new ArrayList<>();
	}
	
	public void addDS(GiaoDichTienTe b) {
		this.ds.add(b);
	}
	
	public void count() {
		int temp = 0;
		for (GiaoDichTienTe giaoDichTienTe : ds) {
			if (giaoDichTienTe instanceof GiaoDichTienTe)
				temp++;
		System.out.println("Tong so luong" +temp);
		}
	}
	
	public double tinhTBC() {
		double total = 0, TBC=0;
		int dem=0;
		for (GiaoDichTienTe giaoDichTienTe : ds) {
			if (giaoDichTienTe instanceof GiaoDichTienTe)
				dem++;
				total += giaoDichTienTe.tinhThanhTien();
				TBC = total/dem;
		}System.out.println("Trung binh cong: " +TBC);
		return TBC;
	}
}
