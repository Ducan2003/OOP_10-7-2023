package Bai1;

public class XeNoiThanh extends Xe {
	private int soTuyen;
	private double soKm;
	public XeNoiThanh(int maSoChuyen, String hoTen, int soXe, double doanhThu, int soTuyen, double soKm) {
		super(maSoChuyen, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKm() {
		return soKm;
	}
	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}
	
	public double Tongdoanhthuxenoithanh(double doanhThu) {
		double Sum;
		return Sum = doanhThu + doanhThu;
		
	}
}
