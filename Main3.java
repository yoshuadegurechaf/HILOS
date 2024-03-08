public class Main3 { 

	public static long factorial(int n) {
        	if (n < 0) {
            	throw new IllegalArgumentException("Number must be non-negative");
        	}
        	if (n == 0 || n == 1) {
            	return 1;
        	}
        	return n * factorial(n - 1);
    		}
	}
}