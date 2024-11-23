package opcond;

public class learn {

	public static void main(String[] args) {
		learn ss = new learn();
//		ss.ari();
//		ss.re();
		ss.log();
	}
//for syed
	public void ari() { // arithmetic operators (" + , - , / , * , %)
		int s1 = 7;
		int s2 = 17;
		int s3 = s1 + s2;
		System.out.println(s3);
		System.out.println(s2 - s1);
		System.out.println(s1 + s3);
		System.out.println(s2 * s1);
		System.out.println(s2 / s1);
		System.out.println(s2 % s1);
	}

	public void re() { // Relational operators - ( > , < , <= , >= , != , == )
		int x = 50;
		int y = 100;
		System.out.println(y > x);
		System.out.println(x > y);
		System.out.println(y != x);
		System.out.println(y >= x);
		System.out.println(y <= x);
		System.out.println(y == x);
	}

	public void log() {
			int v1=100;		
			int v2=1000;
			int v3=2000;
			int v4=5000;
		boolean	res=(v1>v4)|(v3>v2);
			System.out.println(res);		
		}
	

}
