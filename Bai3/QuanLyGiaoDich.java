package Bai3;

import java.time.LocalDate;
public class QuanLyGiaoDich {
	private int maGiaoDich, soLuong;
	private LocalDate ngayGiaoDich;
	private double donGia;
	
	public QuanLyGiaoDich(int maGiaoDich, int soLuong, LocalDate ngayGiaoDich, double donGia) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.soLuong = soLuong;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
	}

	public QuanLyGiaoDich() {
		// TODO Auto-generated constructor stub
	}

	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "QuanLyGiaoDich [maGiaoDich=" + maGiaoDich + ", soLuong=" + soLuong + ", ngayGiaoDich=" + ngayGiaoDich
				+ ", donGia=" + donGia + "]";
	}
}
