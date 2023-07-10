package Bai5;

import java.util.ArrayList;

public class DanhsachKHVN {
	ArrayList<KHVietNam> danhsachvn;

	public DanhsachKHVN() {
		super();
		this.danhsachvn = new ArrayList<>();
	}
	
	public void Add(KHVietNam vn) {
		this.danhsachvn.add(vn);
	}
	public void Count() {
		int temp = 0;
		for (KHVietNam khVietNam : danhsachvn) {
			if (khVietNam instanceof KHVietNam )
			temp++;
		}System.out.println("Tong so luong khach hang VN: " +temp);
	}

	@Override
	public String toString() {
		return "Danh sach thong tin day du\n"  + danhsachvn ;
	}
	
	
}
