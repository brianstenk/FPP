
/*     1.  Readstring()  -- reads in a string from the terminal.  (Definitely do for the final.)
     2.  Writestring(LinkedList) -- writes a LinkedList to the terminal.  (Definitely do for the final.)
     3.  Clear(LinkedList) -- initializes a LinkedList to null (empty). 
     4.  Len(LinkedList) -- returns the length of a LinkedList.  Use an Iterator for this method.
     5.  Equal(LinkedList, LinkedList) -- tests whether or not two LinkedLists are equal.  
         (Do for the final.)  Use two Iterators for this method, one for each list.  
 */

package submission;

//import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_Read_Write_Equal_length {

	static LinkedList<Character> A = new LinkedList<Character>();
	static LinkedList<Character> B = new LinkedList<Character>();
	static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char cmd, strName;

		boolean ans = true;
		while (ans) {
			menu();
			cmd = sc.nextLine().charAt(0);
			switch (cmd) {

			case 'R':
			case 'r':
				System.out.println("Enter the string name A/B\n");
				strName = sc.nextLine().charAt(0);

				if (strName == ('A')) {
					System.out.println("Enter text: ");
					String str1 = sc.nextLine();
					readstring(str1, A);
					System.out.println(str1);

				} else if (strName == 'B') {
					System.out.println("Enter text: ");
					String str2 = sc.nextLine();
					readstring(str2, B);

					System.out.println("Enter Q to Quit or Enter to continue");
					// menu();
					String q = sc.nextLine();
					if (q.equalsIgnoreCase("Q")) {
						System.exit(0);
					} else {
						System.out.println("MENU: ");

					}

				} else {
					System.out.println("Do Again");
					// menu();
				}

				break;

			case 'W':
			case 'w':
				System.out.println("Which String do you want to read to have Displayed? A/B");

				String strD = sc.nextLine();

				if (strD.equalsIgnoreCase("A")) {
					Writestring(A);
				} else if (strD.equalsIgnoreCase("B")) {
					Writestring(B);
				} else
					System.out.println("Not correct input, please enter A or B");

				break;

			case 'C':
			case 'c': {
				System.out.println("Enter the String you want to clear: A/B");
				String strC = sc.nextLine();
				if (strC.equalsIgnoreCase("A")) {
					clear(A);
				} else if (strC.equalsIgnoreCase("B")) {
					clear(B);
				} else {
					System.out.println("Do Again");

				}
			}
				break;

			case 'T':
			case 't':
				System.out.println("Enter the 'target' String: A/B");
				String strT = sc.nextLine();
				// char strT = sc.next().charAt(0);
				if (strT.equalsIgnoreCase("A")) {
					Writestring(Concatenate(A, B));
				} else if (strT.equalsIgnoreCase("B")) {
					Writestring(Concatenate(B, A));
				} else
					System.out.println("Not correct input, please enter A or B");

				break;

			case 'S':
			case 's':

				if (compare(A, B))
					System.out.println("\"The results of two strings" + A + " and " + B + " are EQUAL");
				else
					System.out.println("The two Strings are NOT equal");
				System.out.println();

				break;

			case 'Q':
			case 'q':
				System.out.println("Are you sure you want to exit(Y/N)");

				String chkVal = sc.nextLine();
				ans = chkVal.equalsIgnoreCase("Y") ? false : true;

				System.out.println("Thanks ");

				break;

			default: {
				break;

			}
			}

		}
	}

	// capture input from user
	public static void readstring(String S1, List<Character> ml) {
		// List<Character> ml = new LinkedList<Character>();
		S1 = S1.trim();

		for (int i = 0; i < S1.length(); i++) {
			ml.add(S1.charAt(i));
		}

		System.out.println("Done Converting String " + "*** " + S1 + " ***");

	}

	// Display the input if user chooses
	public static void Writestring(LinkedList<Character> myl1) {
		if (myl1 == null)
			System.out.println("There is no List to show");
		Iterator<Character> itr = myl1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

		System.out.println();

	}

	// clear input
	public static void clear(LinkedList<Character> myl1) {

		if (myl1.isEmpty())
			System.out.println("Aleady Empty");
		else {
			// wrdlist.clear();
			myl1.clear();
			System.out.println("The words list" + myl1 + " has been cleared");

		}

	}

	// compare
	public static boolean compare(List<Character> myl3, List<Character> myl4) {

		char temp1 = '\0', temp2 = '\0';
		Iterator<Character> itrCompare = myl3.iterator();
		Iterator<Character> itr2Compare = myl4.iterator();

		if (myl3 == null && myl4 == null)
			return true;

		if (myl3 == null || myl4 == null)
			return false;
		if (myl3.size() != myl4.size())
			return false;

		while (itrCompare.hasNext()) {

			if (!itrCompare.next().equals(itr2Compare.next())) 
				return false;

		}

		return true;
	}

	public static LinkedList<Character> Concatenate(LinkedList<Character> myl1, LinkedList<Character> myl2) {

		// all user at the main to enter the target and Array List
		LinkedList<Character> newList = new LinkedList<Character>();
		newList.addAll(myl1);
		newList.addAll(myl2);
		return newList;

	}

	public static void menu() {

		System.out.println("Choose any of the following to contine: \n" + "R - to capture your string input\n"
				+ "S - To see whether two strings are equal\n" + "T - to Combine the strings\n"
				+ "W - to Display the strings\n" + "C - to clear what you have entered already\n"

				+ "Q - to Quit");


	}

}