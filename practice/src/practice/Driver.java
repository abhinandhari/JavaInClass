package practice;
import java.util.Scanner;

public class Driver {
	
	public static boolean isPalindrome(String arg) {
		if(arg.length()==1||arg.length()==0)
			return true;
		if(arg.charAt(0)==arg.charAt(arg.length()-1)) {
				String g = arg.substring(1,arg.length()-1);
				//System.out.println(g);
				//System.out.println(arg.charAt(0)+" "+arg.charAt(arg.length()-1));
				return isPalindrome(g);
				
		}
		else {
				System.out.println(arg.charAt(0)+" "+arg.charAt(arg.length()-1));
				return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String P = sc.nextLine();
		P=P.replace(" ","");
		P=P.toLowerCase();
		//System.out.println(P);
		int i=0;
		boolean A = true;
		A=isPalindrome(P);
		if(A==true)
			System.out.println("Yes, palindrome");
		else
			System.out.println("Nope");
	}
}
