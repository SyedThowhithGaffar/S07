package collectionTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int a=0;
		int b=0;
		int c=0;
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=0;
			c=a/b;
		}
		catch(ArithmeticException f ) {
			System.out.println(f +   "Please retry");
		}
		catch(InputMismatchException f) {
			 System.out.println(f+"MISMATCH");
			}
			
		}
	}

