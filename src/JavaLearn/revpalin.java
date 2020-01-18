package JavaLearn;

import java.util.Scanner;

public class revpalin {

	public static void main(String[] args) {
		int n,a,i=0,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		n=sc.nextInt();
	a=n;
		
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
if(n==j){
	System.out.println("palindrome");
}
else {
System.out.println("not palindrome");
}
	}

}
