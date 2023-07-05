package Bai2;

import java.time.LocalDate;
public class Test2 {
	public static void main(String[] args) {
		SachGiaoKhoa sgk = new SachGiaoKhoa(21102991, 50, LocalDate.of(2023, 07, 8), 23000, "Kim Dong", true);
		sgk.Giaban(50, 23000);
		SachGiaoKhoa sgk1 = new SachGiaoKhoa(1188981, 13, LocalDate.of(2023, 12, 12), 50000, "Nha Giao", false);
		sgk.Giaban(13, 50000);
		System.out.println("Thong tin:\n" +sgk.toString());
		System.out.println("Thong tin:\n" +sgk1.toString());
		SachThamKhao stk = new SachThamKhao(2338765, 234, LocalDate.of(2022, 06, 05), 45000, "Thieu Nhi", 3.5);
		stk.TinhThue(234, 45000, 3.5);
		stk.TimTBC(45000);
		System.out.println(stk.toString());
	}
}
