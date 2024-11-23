package oops;

public class staticVariable {
	int rollNum;
	String Name;
	static String classTeacher;

	public static void main(String[] args) {
		staticVariable sv = new staticVariable();
		sv.rollNum=1891951;
		sv.Name="Thowhith";
		sv.classTeacher="Bhuvan";

		staticVariable sv1 = new staticVariable();
		sv1.rollNum=822068;
		sv1.Name="Balaji";
		sv1.classTeacher="Bucky";
		System.out.println("Roll number is "+sv.rollNum+" Name of the Student is "+sv.Name+" Respective Class teacher of the student is "+sv.classTeacher);
		System.out.println("Roll number is "+sv1.rollNum+" Name of the Student is "+sv1.Name+" Respective Class teacher of the student is "+sv1.classTeacher);
	}

}
