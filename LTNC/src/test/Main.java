package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("Tom", 10, "xanh", "vang");
		System.out.println("Ten:"+cat.tenGoi);
		System.out.println("can nang: "+cat.cannang);
		System.out.println("mau mat: "+cat.mauMat);
		System.out.println("mau long: "+cat.mauLong);
		cat.An();
		
		System.out.println("================");
		
		Fish fish = new Fish("Ca Map", 1000, "xam", "xanh");
		System.out.println("Ten: "+ fish.tenGoi);
		System.out.println("Can nang: "+fish.cannang);
		System.out.println("kieu Vay: "+fish.kieuVay);
		System.out.println("loai nuoc: "+fish.loaiNuoc);
		cat.An();
	}

}
