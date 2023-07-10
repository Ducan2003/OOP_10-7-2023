package Bai3;

import java.time.LocalDate;

public class GiaoDichVang extends QuanLyGiaoDich {
	private int loaiVang;

	public GiaoDichVang(int maGiaoDich, int soLuong, LocalDate ngayGiaoDich, double donGia, int loaiVang) {
		super(maGiaoDich, soLuong, ngayGiaoDich, donGia);
		this.loaiVang = loaiVang;
	}
	
	public void Tinhtien(int soLuong, double donGia) {
		double thanhTien;
		thanhTien =  soLuong * donGia;
		System.out.println(thanhTien);
	}
	
	
}
