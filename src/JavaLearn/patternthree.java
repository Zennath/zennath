package JavaLearn;

import java.util.Scanner;

public class patternthree {

	public static void main(String[] args) {
		int a=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  no");
		int no=sc.nextInt();
		for(int i=0;i<=no;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a+  "  ");
				a=a+1;
				}
			System.out.println();
		}

	}

}
