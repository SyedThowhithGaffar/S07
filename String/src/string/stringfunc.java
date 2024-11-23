package string;

public class stringfunc {
	public static void main(String[] args){
		//lit_buf();
//		non_buf();
		str_func();
	}
	public static void lit_buf() {
		String t="String";
		System.out.println(t);
		System.out.println(System.identityHashCode(t));
		String g="String";
		System.out.println(g);
		System.out.println(System.identityHashCode(g));
		String sg="syed";
		g=g+"   "+t;
		System.out.println(g);
		System.out.println(System.identityHashCode(g));
	}
	
	public static void non_buf() {
		StringBuilder d=new StringBuilder("BMW");
		System.out.println(d);
		System.out.println(System.identityHashCode(d));
		StringBuilder q=new StringBuilder("BMW");
		System.out.println(q);
		System.out.println(System.identityHashCode(q));
		StringBuffer e=new StringBuffer("AUDI");
		System.out.println(e);
		System.out.println(System.identityHashCode(e));
		e=e.append(q);		
		System.out.println(System.identityHashCode(e));
	}
	public static void str_func() {
		String q1="Syed";
		String q2="Thowhith";
		String q3="Gaffar";
		String q4="  Go , od , cool   ";
		System.out.println(q2.length());
		boolean re= q1.equals(q2);
		System.out.println(re);
		boolean er1=q1.equalsIgnoreCase(q2);
		System.out.println(er1);
		String up = q1.toUpperCase();
		System.out.println(up);
		String low = q1.toLowerCase();
		System.out.println(low);
		char ch = q1.charAt(1);
		System.out.println(ch);
		boolean start = q2.startsWith("Tho");
		System.out.println(start);
		boolean end = q3.endsWith("ar");
		System.out.println(end);
		String repl = q1.replace('d','R');
		System.out.println(repl);
		boolean cont= q2.contains("w");
		System.out.println(cont);
		String sub = q2.substring(4);
		System.out.println(sub);
		String  tr = q4.trim();
		System.out.println(tr);
		String  conc = q3.concat(q4);
		System.out.println(conc);
	    boolean emp = q1.isEmpty();
	    System.out.println(emp);
		int ind = q2.indexOf('o');
		System.out.println(ind);
		String[] st=q4.split(",");
		for(String sy:st){
		System.out.print(sy);
		}
		
	}
}
