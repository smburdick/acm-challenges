public class Solution2 {
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

		int memo[] = new int[smaller + 1];

		return minProductHelper(smaller,bigger,memo);
	}

	private static int minProductHelper(int smaller, int bigger, int[] memo) {
		if(smaller==0) {
			return 0;
		} else if (smaller==1) {
			return bigger;
		} else if(memo[smaller] > 0) {
			return memo[smaller];
		}

		int s = smaller >> 1; //shift bits right. div by 2
		int side1 = minProductHelper(s, bigger, memo);
		int side2 = side1;
		if (smaller%2==1) { //odd
			side2 = minProductHelper(smaller - s, bigger, memo);
		}	

		memo[smaller] = side1 + side2;
		return memo[smaller];
	}
}