package Bai3;

import java.time.LocalDate;
public class Test3 {
	public static void main(String[] args) {
		GiaoDichTienTe gdtt = new GiaoDichTienTe(21102991, 15, LocalDate.of(2022, 12, 12), 5000, 0.5, "VND");
		GiaoDichTienTe gdtt2 = new GiaoDichTienTe(20102901, 2, LocalDate.of(2020, 01, 01), 20.000, 0.55, "USD");
		GiaoDichTienTe gdtt3 = new GiaoDichTienTe(19102901, 10, LocalDate.of(2019, 07, 11), 35.000, 0.55, "EURO");
		gdtt.tinhThanhTien();
		gdtt2.tinhThanhTien();
		gdtt3.tinhThanhTien();
		DanhsachGD dsgd = new DanhsachGD();
		dsgd.addDS(gdtt);
		dsgd.addDS(gdtt2);
		dsgd.addDS(gdtt3);
		dsgd.count();
		dsgd.tinhTBC();
	}
}
