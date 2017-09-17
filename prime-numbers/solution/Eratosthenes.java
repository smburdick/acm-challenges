public class Eratosthenes {
	public static void main (String[] args) {
		try {
			final int n = Integer.parseInt(args[0]); // must provide an integer as a command line argument
			boolean[] areNonPrimes = new boolean[n+1];
			for (int k = 1; k <= n; k++) {
				final int index = k + 1;
				for (int i = index; i <= n; i += index) {
					if (i != index) areNonPrimes[i] = true;
				}
			}
			for (int j = 2; j <= n; j++) {
				if (!areNonPrimes[j]) System.out.print(j + " ");
			}
			System.out.println();
				
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Please provide correct arguments");
		}

	}
}