package cp120.assignments.assignment003;

public class Exercise1 {

	public static void main(String[] args) {
		int inx = 200;
		int jnx = 7;
		int knx = inx % jnx;
		System.out.println( "1. knx = " + knx);
		
		inx = 200;
		jnx = 7;
		knx = inx / jnx;
		System.out.println( "2. knx = " + knx);
		
		inx = 6;
		jnx = 7;
		knx = ++inx * jnx;
		System.out.println( "3. knx = " + knx);
		System.out.println( "3. inx = " + inx);
		System.out.println( "3. jnx = " + jnx);
		
		inx = 6;
		jnx = 7;
		knx = inx + jnx--;
		System.out.println( "4. knx = " + knx);
		System.out.println( "4. inx = " + inx);
		System.out.println( "4. jnx = " + jnx);
		
		
		
		
		

	}

}
