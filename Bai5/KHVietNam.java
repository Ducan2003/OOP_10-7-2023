package Bai5;

import java.time.LocalDate;

public class KHVietNam extends DanhSachHoaDon {
	private String doiTuong;
	private double dinhMuc;
	
	public KHVietNam(int maKhachHang, String hoTen, LocalDate ngayLapHD, double donGia, double soKW, String doiTuong,
			double dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHD, donGia, soKW);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}

	public double getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	public double tinhsovuotmuc() {
		double soKWvuot = getSoKW() - dinhMuc;
			return soKWvuot; 
	}
	
	public boolean Xetdieukien() {
		if (getSoKW() <= dinhMuc)
			return true;
		return false;
	}
	@SuppressWarnings("unused")
	public void tinhThanhTien() {
		double thanhtien=0;
		if(true)
			thanhtien = getSoKW() * getDonGia();
		else
			thanhtien = (getSoKW() * getDonGia() * getDinhMuc()) + (tinhsovuotmuc() * getDonGia() * 2.5);
		System.out.println("Tong so tien phai tra: " +thanhtien);
	}

	@Override
	public String toString() {
		return  "Bang thong tin:\n "
				+"========================================================\n"
				+ "Muc dich tieu dung: \n" + doiTuong 
				+ "Dinh Muc: \n" + dinhMuc 
				+ "So KW vuot muc: \n" + tinhsovuotmuc();	
	}
	
	
}
