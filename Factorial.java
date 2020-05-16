package lesson4;

public class Factorial {


	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.factorial(6);
	}
	int factorial(int n) {
		System.out.println("Entering factorial with n = "+n);
		if(n == 0 || n == 1) {
			return 1;
		}
		int retVal = n * factorial(n-1);
		System.out.println("Returning val "+retVal+" of factorial("+n+")");
		return retVal;
	}


}
