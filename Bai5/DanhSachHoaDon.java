package Bai5;

import java.time.LocalDate;
public class DanhSachHoaDon {
	private int maKhachHang;
	private String hoTen;
	private LocalDate ngayLapHD;
	private double donGia, soKW;
	
	public DanhSachHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DanhSachHoaDon(int maKhachHang, String hoTen, LocalDate ngayLapHD, double donGia, double soKW) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayLapHD = ngayLapHD;
		this.donGia = donGia;
		this.soKW = soKW;
	}
	public int getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}
	@Override
	public String toString() {
		return "Ma Khach Hang: " + maKhachHang + 
				"Ho va ten: " + hoTen 
				+ "Ngay lap hoa don: " + ngayLapHD
				+ "Don Gia: " + donGia 
				+ "soKW:" + soKW;
	}
}
