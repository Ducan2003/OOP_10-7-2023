package Bai2;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private double thue;

	public SachThamKhao(int maSach, int soLuong, LocalDate ngayNhap, double donGia, String nhaXuatBan, double thue) {
		super(maSach, soLuong, ngayNhap, donGia, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public void TinhThue(int soLuong, double donGia, double thue) {
		double thanhTien = 0;
		thanhTien = soLuong * donGia + thue;
		System.out.println(thanhTien);
	}
	public void TimTBC (double donGia) {
		  double TBC, Total = 0;
		  double [] dongia = new double [3];
		  dongia[0] = donGia;
		  dongia[1] = donGia;
		  dongia[2] = donGia;
		  for (int i = 0; i < dongia.length; i++) {
			  dongia[i] = donGia;
			  Total += dongia[i];
		  } 
		  TBC = Total / dongia.length;
		  System.out.println(TBC);
	 } 
}
	

