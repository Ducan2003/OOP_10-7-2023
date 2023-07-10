package Bai4;

import java.time.LocalDate;

public class GiaoDichDat extends QuanLyDanhSach {
	private String loaiDat;
	public GiaoDichDat(int maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.loaiDat = loaiDat;
	}
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	
	double thanhtien() {
		double thanhTien= 0;
		if (getLoaiDat()== "B" && getLoaiDat() == "C")
			thanhTien = getDienTich() * getDonGia();
		if (getLoaiDat() == "C")
			thanhTien = getDienTich() * getDonGia() * 1.5;
		System.out.println(thanhTien);
		return thanhTien;
	}
}
