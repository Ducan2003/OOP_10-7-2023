package Bai1;

public class Test1 {
	public static void main(String[] args) {
		XeNoiThanh xnt1 = new XeNoiThanh(21102921, "Nguyen Van A", 51, 500.000000, 5, 40.0 );
		XeNoiThanh xnt2 = new XeNoiThanh(2119998, "Nguyen Van B", 62, 400.000000, 7, 70.0 );
		XeNgoaiThanh xngt1 = new XeNgoaiThanh(21199978, "Nguyen Van C", 89, 700.000000, "BR-VT", 1);
		XeNgoaiThanh xngt2 = new XeNgoaiThanh(21187867, "Nguyen Van D", 43, 600.000000, "Nha Trang", 1 );
		xnt1.TinhTong();
		xnt2.TinhTong();
		xngt1.TinhTong();
		xngt2.TinhTong();
		xnt1.Tongdoanhthuxenoithanh(500.000000);
		xnt2.Tongdoanhthuxenoithanh(400.000000);
		xngt1.Tongdoanhthuxengthanh(700.000000);
		xngt2.Tongdoanhthuxengthanh(600.000000);
		System.out.println("Xe noi thanh:");
		System.out.println(xnt1);
		System.out.println(xnt2);
		System.out.println("====================================================\n");
		System.out.println("Xe ngoai thanh:");
		System.out.println(xngt1);
		System.out.println(xngt2);
	}
}
