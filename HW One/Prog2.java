/*
 * )  Create a class Prog2. Inside its main method, create float variables to store each of the
               following numbers:    1.27, 3.881, 9.6
              Output to the console the following two values:
              a. the sum of the floats as an integer, obtained by casting the sum to type int
              b. the sum of the floats as an integer, obtained by rounding the sum to the nearest
                  integer, using the Math.round function

 */
public class Prog2 {
	public static void main(String [] args) {
		float var1 = 1.27f, var2 = 3.881f, var3 = 9.6f;
		float sum;
		sum = var1 + var2 + var3;
		// the sum of the floats as an integer
		System.out.println((int)sum);
		
		//using the Math.round function
		System.out.println(Math.round(sum));
		
	}

}
