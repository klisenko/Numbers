package cp120.assignments.assignment003;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		compare("Zebra", "Aardvark");
		compare("Zulu", "anteater");
		compare("market", "Market");
		compare("200", "30");
		compare("100", "-100");
		
		

	}
	
	public static void compare(String one, String two) {
		int order = one.compareTo(two);
		if ( order < 0 )
			System.out.println( one + " is less than " + two );
		else if ( order == 0 )
			System.out.println( one + " is equal to " + two );
		else if ( order > 0 )
			System.out.println( one + " is greater than " + two );
		else
			;
	}

}
