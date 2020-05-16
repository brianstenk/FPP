package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class power {

	public static void main(String[] args) {
	system.out.println(computePower(7, 5));
	}

	public static double computePower(double x, double n){
		//base case
		if(n==0){
			return 1;
		}else if(n>0){   //recursive condition for postive power
			return x*computePower(x, n-1);
		}else if(n<0){  //recursive condition for negative power
			return (1/x)*computePower(x, n+1);
		}else{ 
			return -1;
		}
	}



}
