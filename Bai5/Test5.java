package Bai5;

import java.time.LocalDate;

public class Test5 {
	public static void main(String[] args) {
		KHVietNam vn1 = new KHVietNam(21102991, "Pham Van A", LocalDate.of(2023, 07, 23), 2000, 15, "sinh hoat", 20);
		KHVietNam vn2 = new KHVietNam(20198654, "Nguyen Van B", LocalDate.of(2020, 03, 30), 20000 , 50, "sanxuat", 200);
		KHVietNam vn3 = new KHVietNam(20188521, "Luong Van C", LocalDate.of(2020, 11, 11), 20000 , 25, "sanxuat", 20);
		vn1.tinhsovuotmuc();
		vn1.Xetdieukien();
		//System.out.println(vn1.toString());
		vn1.tinhThanhTien();
	
		vn2.tinhsovuotmuc();
		vn2.Xetdieukien();
		System.out.println(vn2.toString());
		vn2.tinhThanhTien();
	
		vn3.tinhsovuotmuc();
		vn3.Xetdieukien();
		System.out.println(vn3.toString());
		vn3.tinhThanhTien();
		
		DanhsachKHVN dsvn = new DanhsachKHVN();
		dsvn.Add(vn1);
		dsvn.Add(vn2);
		dsvn.Add(vn3); 
		dsvn.Count();
		System.out.println(dsvn.toString());
	}
}
