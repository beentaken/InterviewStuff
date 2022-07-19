package solution;

public class ACCENTURETest2 {
	public static void a(String s) {
		char[] words = s.toCharArray();
	    StringBuilder strb = new StringBuilder();
	    for (int i = s.length()-1; i >= 0; --i) { 
	    	 strb.append(s.charAt(i));
	    }
	    System.out.println(strb);
	}
	
	public static void b(int r) {
		  int k = 0;
		    for (int i = 1; i <= r; ++i, k = 0) {
		      for (int s = 1; s <= r - i; ++s) {
		        System.out.print("  ");
		      }
		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }
		      System.out.println();
		    }
		
	}
	public static void main(String[] args) {
		a("ACCENTURE");
		b(5);
	}
	
}

