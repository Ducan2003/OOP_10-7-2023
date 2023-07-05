package Bai2;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang ;

	public SachGiaoKhoa(int maSach, int soLuong, LocalDate ngayNhap, double donGia, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, soLuong, ngayNhap, donGia, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}
	public boolean getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public boolean xettinhTrang() {
		if (tinhTrang = "moi" != null)
			return true;
		else
			return false;
	}
	@SuppressWarnings("unused")
	public void Giaban(int soLuong, double donGia) {
		double thanhTien = 0;
		if (true )
			thanhTien= soLuong * donGia;
		if (false )
			thanhTien= soLuong * donGia * 0.5;
		System.out.println(thanhTien);
	}
}
