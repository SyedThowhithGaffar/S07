package oops;

public class showroom extends abstraction{
	public static void main(String[]args) {

   showroom ss=new showroom();
   ss.model();
   ss.engine();
   ss.mode_of_transportation();
   ss.manufactured_location();
	}
   
   
	@Override
	public void mode_of_transportation() {
	System.out.println("By lorry from Gujarat to Chennai");
		
	}

	@Override
	public void manufactured_location() {
		System.out.println("Gujarat");
		
	
	}
}
