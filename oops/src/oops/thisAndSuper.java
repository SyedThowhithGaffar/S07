package oops;

public class thisAndSuper extends superAndThis{

	public static void main(String[] args) {
		thisAndSuper ts= new thisAndSuper();
		ts.try3();
		ts.try4();

	}
	public void try3() {
		System.out.println("Nice");
		super.try1();
		this.try2();

	}
	public void try2() {
		System.out.println("Very Good");
	}
	public void try4(){
		super.try1();
	}
}


