package array2D;

public class Box {
	private double width = 0;
	private double lenght = 0;
	private double height = 0;
	
	public Box() {
		
	}
	
	public Box(double lenght, double width, double height) {
		this.lenght = lenght;
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getLenght() {
		return lenght;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double calcArea() {
		return 2 * ((width * lenght) + (width * height) + (lenght+height));
	}
	
	public double calcVolume() {
		return width * lenght * height;
	}
	
	public String toString() {
		String str = "Balok" + "\n"
				+ "Panjang = " + lenght + "\n"
				+ "Lebar = " + width + "\n"
				+ "Tinggi = " + height + "\n"
				+ "Luas = " + calcArea() + "\n"
				+ "Volume = " + calcVolume() + "\n";
		
		return str;
	}
	
	static void test() {
		Box b = new Box(10,20, 50);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		test();
	}
}
