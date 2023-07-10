package Bai4;

import java.time.LocalDate;

public class Test4 {
	public static void main(String[] args) {
		GiaoDichDat gdd = new GiaoDichDat(21102991, LocalDate.of(2023, 12, 9), 50.000000, 4.5, "C");
		GiaoDichDat gdd1 = new GiaoDichDat(21102654, LocalDate.of(2021, 06, 07), 200.000000, 5, "B");
		GiaoDichDat gdd2 = new GiaoDichDat(12102544, LocalDate.of(2012, 01, 11), 200.000000, 3, "A");
		gdd.thanhtien();
		gdd1.thanhtien();
		gdd2.thanhtien();
		Danhsach danhsach = new Danhsach();
		danhsach.add(gdd);
		danhsach.add(gdd1);
		danhsach.add(gdd2);
		danhsach.Inmang();
		danhsach.count();
		danhsach.tinhTB();
	}
}
