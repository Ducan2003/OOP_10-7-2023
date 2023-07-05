package Bai1;

public class XeNgoaiThanh extends Xe {
	private String noiDen;
	private int soNgayDi;
	
	public XeNgoaiThanh(int maSoChuyen, String hoTen, int soXe, double doanhThu, String noiDen, int soNgayDi) {
		super(maSoChuyen, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDi = soNgayDi;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDi() {
		return soNgayDi;
	}
	public void setSoNgayDi(int soNgayDi) {
		this.soNgayDi = soNgayDi;
	}
	
	public double Tongdoanhthuxengthanh(double doanhThu) {
		double Sum;
		return Sum = doanhThu + doanhThu;
		
	}
}
