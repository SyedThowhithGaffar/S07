package array;

public class prac {

	public static void main(String[] args) {
//		mulLit();
		mulDim();
		
	}
	public static void mulLit() {
//		array (literal array type)
		int[] psy= {10,20,30,40};
		int sye=psy.length;
		System.out.println(sye);
//      for loop for literal array type
		for(int i=0;i<sye;i++) {
			System.out.println(psy[i]);
		}}
		public static void mulDim() {
//	 non-literal array type
			int[][] tg= new int[2][2];
			tg[0][0]=1;
			tg[0][1]=2;
			tg[1][0]=3;
			tg[1][1]=4;
	

			for (int as[]:tg) {
				for(int bs:as) {
					System.out.println(bs);
					
//					int[][]  ps= {{1,2},{3,4}};	{
//					for (int i=1;i<=ps.length;i++) {
//						for (int j=1;j<=ps.length;j++) {
//							System.out.println(ps[i][j]);
//							
//						}
						
					}
					

				}}}
			
		
		        

	
	
	
	
	
	
		

	
			
	
			
	
			
	
		
//		
	
