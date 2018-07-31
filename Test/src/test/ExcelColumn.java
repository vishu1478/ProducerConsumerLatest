package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExcelColumn {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		// int n1 = n;
		int rem;
		ArrayList<Character> al=new ArrayList<Character>();
		
		while(n>0) {
			rem=n%26;
			if(rem==0) {
				//System.out.println((char) 90);
			al.add((char) 90);
				n--;}
			else {
			//System.out.println((char) (rem+64));
				al.add((char) (rem+64));
			}
			n=n/26;
			
			
		}
		Collections.reverse(al);
		System.out.println(al);
		sc.close();
	}

}
