package Bai4;

import java.time.LocalDate;

public class GiaoDichNha extends QuanLyDanhSach {
	private String loaiNha;
	public GiaoDichNha(int maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiNha = loaiNha;
	}
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	
	public void tinhthanhtien() {
		double thanhTien = 0;
		if (getLoaiNha() == "caocap")
			thanhTien = getDienTich() * getDonGia();
		if (getLoaiNha() == "thuong")
			thanhTien = getDienTich() * getDonGia() * 0.9;
		System.out.println(thanhTien);
	}
}