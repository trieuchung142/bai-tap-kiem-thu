package Triagle_main;

public class Triagle {
	private int a;
	private int b;
	private int c;

	// khoi tao
	public Triagle(int a, int b, int c) throws Exception {
		if (a == 0 && b == 0 && c == 0)
			throw new Exception("Du lieu khong hop le");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// return -1 : Khong la tam giac
	// return 0 : thuong
	// return 1 : can
	// return 2 : deu
	public int CheckTriagle() {
		boolean check = false;
		if(a < b + c && b < c + a && c < a + b)
			check = true;
		if(check == true){
			if(a != b && b != c && c != a)
				return 0;
			else if(a == b && b == c)
				return 2;
			else 
				return 1;
		}
		return -1;
	}

}
