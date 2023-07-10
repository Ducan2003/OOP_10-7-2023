package Bai5;

import java.util.ArrayList;

public class DanhSachKHNN {
	ArrayList<KHNuocNgoai> danhsachnn;

	public DanhSachKHNN(ArrayList<KHNuocNgoai> danhsachnn) {
		this.danhsachnn = new ArrayList<>();
	}
	
	public void Add(KHNuocNgoai nn) {
		this.danhsachnn.add(nn);
	}
	public int Count() {
		int temp = 0;
		for (KHNuocNgoai khNuocNgoai : danhsachnn) {
			if (khNuocNgoai instanceof KHNuocNgoai)
				temp++;
		}
			System.out.println("Tong so luong khach hang nuoc ngoai: " +temp);
			return temp;
	}
	
	public double tinhTBC() {
		double TBC, Total = 0;
		int dem = 0;
		for (KHNuocNgoai khNuocNgoai : danhsachnn) {
			if (khNuocNgoai instanceof KHNuocNgoai)
				dem++;
			Total += khNuocNgoai.tinhThanhTien();
		}return TBC = Total / dem;
	}
}

