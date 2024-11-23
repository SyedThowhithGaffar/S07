package opcond;

public class method_ovrloading {
	public static void main (String[] args) {
	method_ovrloading sre=new method_ovrloading();
	sre.addition(5, 10);
	sre.addition(1, 12,24);
	sre.addition("Syed", 07);
	sre.addition("Syed", "Thowhith");
	}
	public void addition(int x,int y) {
		
	
		System.out.println(x+y);
	}
	public void addition(int x,int y,int z) {
	
		System.out.println(y-z);
	}
	public void addition(String s, int y) {
		System.out.println(s+" "+y);
	}
	public static void addition(String q, String l) {
		System.out.println(q+" "+l);
	}
}
