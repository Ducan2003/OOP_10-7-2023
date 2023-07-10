package Bai5;

import java.time.LocalDate;

public class KHNuocNgoai extends DanhSachHoaDon {
	private String quocTich;

	public KHNuocNgoai(int maKhachHang, String hoTen, LocalDate ngayLapHD, double donGia, double soKW,
			String quocTich) {
		super(maKhachHang, hoTen, ngayLapHD, donGia, soKW);
		this.setQuocTich(quocTich);
	}
	
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	
	public double tinhThanhTien() {
		double thanhTien = getSoKW() * getDonGia();
		System.out.println("So tien phai tra: " +thanhTien);
		return thanhTien;
	}
}

