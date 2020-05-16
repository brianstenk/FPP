import java.util.Scanner;

public class Star_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s = '*';

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of lines you want to print: ");
		int num = sc.nextInt();
		
		/*
		 * Print the symbol for only the specified conditions 
		 * else print spaces 
		 */
		for (int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				if (j == 0 || j == i || i == num - 1)
					System.out.print(s);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
					
		sc.close();

	}

}
