package Bai3;

import java.time.LocalDate;
public class GiaoDichTienTe extends QuanLyGiaoDich {
	private double tiGia;
	private String loai;
	private double thanhTien;
	public GiaoDichTienTe(int maGiaoDich, int soLuong, LocalDate ngayGiaoDich, double donGia, double tiGia, String loai) {
		super(maGiaoDich, soLuong, ngayGiaoDich, donGia);
		this.tiGia = tiGia;
		this.loai = loai;
	}
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = "VND";
		this.loai = "USD";
		this.loai = "EURO";
	}
	
	public double tinhThanhTien() {
		if (getLoai() == "USD" && getLoai() == "EURO")
			thanhTien = getDonGia() * getSoLuong() * tiGia;
		if (getLoai()  == "VND")
			thanhTien = getSoLuong() * getDonGia();
		System.out.println(thanhTien);
		return thanhTien;
	}	
}



