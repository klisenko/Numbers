package cp120.assignments.assignment003;

public class BitMasks {

	public static void main(String[] args) {
		int register    = 0b0110101100011001;
		int countMask   = 0b0000011000000000;
		int countField  = register & countMask;
		System.out.println("Countfield = 0b" + Integer.toBinaryString(countField));
		int countValue = countField >> 1;
		System.out.println("Countfield = 0b" + Integer.toBinaryString(countValue));
		countValue = countValue >> 1;
		System.out.println("Countfield = 0b" + Integer.toBinaryString(countValue));
		

	}

}
