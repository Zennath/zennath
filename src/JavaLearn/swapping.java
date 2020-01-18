package JavaLearn;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("the no");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapping");
		System.out.println(a);
		System.out.println(b);
		}

}
