import java.util.HashSet;
import java.util.Set;

/*
 * 3)  Write a program (called Prog6) that accepts String arguments (stored in args) from the
             main method, removes all duplicates, and outputs these arguments (without duplicates) in
             a comma-separated format. For example, if the input into the main method is
     ["horse", "dog", "cat", "horse","dog"]
            then the output would be
     "horse","dog","cat"

           Typical output:
      Original list: [ horse dog cat horse dog horse cat horse ]
      List without duplicates: [ horse dog cat ]

 */
public class Prog6 {

	//private static final double PI = 3.142;

	public static void main(String[] args) {
		
		Set<String> outputList = new HashSet<String>();
		int len = args.length;
		
		//Through the entire args length, add args' members to outputList without allowing any duplicate 
		for(int i=0; i< len; i++) {
			outputList.add(args[i]);
		}
		
		System.out.println(outputList);
		
		int r = 6;
		System.out.println(Math.PI*r*r);
		
	}
}



