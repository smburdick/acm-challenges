public class Solution1 {
	public static void main (String[]args) {
		try{
			final int m = Integer.parseInt(args[0]); // multiplicand
			final int n = Integer.parseInt(args[1]); // multiplier

			System.out.println(minProduct(m,n));

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("bad input");
		}	
	}

	private static int minProduct(int m, int n) {
		int bigger = m < n ? n : m;
		int smaller = m < n ? m : n;
		return minProductHelper(smaller,bigger);
	}

	private static int minProductHelper(int smaller, int bigger) {
		if(smaller==0) {
			return 0;
		} else if (smaller==1) {
			return bigger;
		}

		int s = smaller >> 1; //shift bits right. div by 2
		int side1 = minProductHelper(s, bigger);
		int side2 = side1;
		if (smaller%2==1) { //odd
			side2 = minProductHelper(smaller - s, bigger);
		}	

		return side1 + side2;
	}
}