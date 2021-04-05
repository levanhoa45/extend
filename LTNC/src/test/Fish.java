package test;

public class Fish extends animal{
	String kieuVay;
	String loaiNuoc;
	
	public Fish(String tenGoi, int cannang, String kieuVay, String loaiNuoc) {
		super(tenGoi,cannang);
		this.kieuVay=kieuVay;
		this.loaiNuoc=loaiNuoc;
	}
}
