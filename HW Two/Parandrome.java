import java.util.Scanner;

/*         1)  Write an application that determines if an input word is a palindrome.  A palindrome is a string 
               that reads the same forward and backward, for example, noon  and  madam.  
               Ignore the case of the letter.   (Definitely do for the midterm.)
 */
public class Parandrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the word to check whether it is a Palindrome: ");
		String word = sc.nextLine();

		boolean isPalindrome = false;
		for(int i = 0; i < word.length(); i++ ) {
			String temp = word;
			/*Go through all characters of word and temp which is word but from its end and compare the character 
    	 at the respective indices */
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(0) == temp.charAt(word.length()-1)) {
					isPalindrome = true;

				}
				else isPalindrome = false;

			}

		}
		if(isPalindrome) { 
			System.out.println("The word " +word + " is a Palindrome");
		}
		else {
			System.out.println("The word " +word + " is not a Palindrome");
		}
		sc.close();
	}

}
