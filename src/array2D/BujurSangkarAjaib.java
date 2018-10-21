package array2D;

/**
 * Case bil 1, 2, 3, ..n^a yang muncul tepat sekali bahwa penjumlahan
 * masing masing kolom, baris, dan diagonal adalah sama.
 **/

/**
 * Bujur sangkar ajaib 5x5 dimana semua elemen 
 **/

public class BujurSangkarAjaib {
	
	static final int ADJUST = 1;
	
	private int side;
	private int[][] kotak;
	
	private boolean fValid  = false;
	
	public BujurSangkarAjaib(int side) {
		if (side % 2 ==1) {
			this.fValid = true;
			this.side = side;
			kotak = new int[side][side];
			makeMagic();
		}
	}
	
	static void test01() {
		BujurSangkarAjaib t = new BujurSangkarAjaib(5);
		if (t.isValid()) t.printKotak();
		else System.out.println("Nilai sisi dimasukkan tidak sah!");
		System.out.println("");
	}
	
	static void test03() {
		BujurSangkarAjaib t = new BujurSangkarAjaib(6);
		if (t.isValid()) t.printKotak();
		else System.out.println("Nilai sisi dimasukkan tidak sah!");
		System.out.println("");
	}
	
	static void test02() {
		BujurSangkarAjaib t = new BujurSangkarAjaib(5);
		if (t.isValid()) t.printKotak();
		else System.out.println("Nilai sisi dimasukkan tidak sah!");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		test01();
		test02();
		test03();
	}
	
	public boolean isValid() {
		return fValid;
	}
	
	public void makeMagic() {
		// Preconditior : side % 2==1;
		int row = 1-ADJUST;
		int col = side/2;
		kotak[row][col] = 1;
		for (int i = 2; i <= (side*side); i++) {
			int oldRow = row;
			int oldCol = col;
			
			row -= 1;
			col += 1;
			
			if (row < 0) row = side-ADJUST;
			if (col >side-ADJUST) col = 1-ADJUST;
			if (kotak[row][col]==0) kotak[row][col] = i;
			else {
				row = oldRow + 1;
				col = oldCol;
				kotak[row][col] = i;
			}
		}
	}
	
	public void printKotak() {
		// Precondition : isValid() == true
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
//				if (kotak[i][j]<10) {
//					System.out.print(" ");
//				}
				System.out.print(kotak[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public String toString() {
		// Precondition : isValid() == true
		String str = "";
		
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				str += kotak[i][j]+"\t";
			}
			str += "\n";
		}
		return str;
	}
}
