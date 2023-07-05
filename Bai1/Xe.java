package Bai1;

public class Xe {
	private int maSoChuyen;
	private String hoTen;
	private int soXe;
	private double doanhThu;
	public Xe(int maSoChuyen, String hoTen, int soXe, double doanhThu) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	public int getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(int maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public double TinhTong() {
		double Sum;
		return Sum = doanhThu + doanhThu;
	}
	@Override
	public String toString() {
		return "Xe [maSoChuyen=" + maSoChuyen + ", hoTen=" + hoTen + ", soXe=" + soXe + ", doanhThu=" + doanhThu 
				+ "Tong doanh thu: "+TinhTong();
	}
	
}
