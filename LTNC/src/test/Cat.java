package test;

public class Cat extends animal{
	String mauMat;
	String mauLong;
	
	public Cat(String tenGoi, int cannang, String mauMat, String mauLong) {
		super(tenGoi,cannang);
		this.mauMat=mauMat;
		this.mauLong=mauLong;
	}

}
