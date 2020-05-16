import java.util.Scanner;

/*
 * Prompt the user for a string.  Save it in a StringBuffer object.
a)	Append  “bye”  to the above.  Print it out.
b)	Make all lowercase letters uppercase, and uppercase letters lowercase.  Print the new string.
      (For lowercase you can use something like 
                           if  ((char1 >= ‘a’)  &&  (char1 <= ‘z’)) …
                    Also check out the Character class!)

 */
public class StringBuffer_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: "); 
		StringBuffer sb = new StringBuffer(); 
		sb.append(sc.nextLine()); 
		sb.append(" bye"); 
		String input = sb.toString();

				System.out.println("String entered and bye appended is: " + input); 
				sb = new StringBuffer(); 
				// clear the old buffer sb to allow appending the characters
				//that have been converted

				for (int i = 0; i < input.length(); i++) { 
					if (input.charAt(i) <= 'z' && input.charAt(i) >= 'a') {
						sb.append(Character.toString(input.charAt(i)).toUpperCase()); 
					} else 
					{
						sb.append(Character.toString(input.charAt(i)).toLowerCase()); 
					} 
				}
				System.out.println();

				System.out.println("The String entered with letters changed cases is: "+sb);
				
				String test = "TestWithoutBuffer";
				String rev = "";
				int l = test.length();
				
				if (test == null || l == 0) System.out.println("The String is empty");
				
				else {
				
				for (int i = 0; i< l; i++) {
					rev = rev+test.charAt(l-1-i);
				}
				
				System.out.println("The reverse String is: "+rev);
				
				}
				
				sc.close();




	}

}
