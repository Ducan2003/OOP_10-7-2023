package Bai2;

import java.time.LocalDate;
public class Sach {
	private int maSach, soLuong;
	private LocalDate ngayNhap;
	private double donGia;
	private String nhaXuatBan;
	
	public Sach(int maSach, int soLuong, LocalDate ngayNhap, double donGia, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.soLuong = soLuong;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getMaSach() {
		return maSach;
	}

	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	@Override
	public String toString() {
		return "[Ma Sach:" + maSach + ", So Luong" + soLuong + ", Ngay Nhap: " + ngayNhap + ", Don Gia:" + donGia
				+ ", Nha Xuat Ban:" + nhaXuatBan + "]";
	}
}
