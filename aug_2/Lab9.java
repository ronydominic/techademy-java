package aug2.pack1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scan.nextLine();
		
		System.out.println(addToItself(s));
		System.out.println(replaceOdd(s));
		System.out.println(removeDuplicate(s));
		System.out.println(replaceOddtoUpper(s));

	}
	
	public static String addToItself(String s) {
		return s + s;
	}
	
	public static String replaceOdd(String s) {
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0;i < sb.length(); i+=2) {
			sb.setCharAt(i, '#');;
		}
		return sb.toString();
	}
	
	public static String removeDuplicate(String s) {
		
		Set<Character> se = new HashSet<Character>();
		
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0; i< sb.length(); i++) {
			if(se.contains(sb.charAt(i))) {
				sb.deleteCharAt(i);
				i--;
			
		} else {
			se.add(sb.charAt(i));
		}
		
	}
		return sb.toString();

}
	
	public static String replaceOddtoUpper(String s) {
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0;i < sb.length(); i+=2) {
			sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		}
		return sb.toString();
	}
	}
