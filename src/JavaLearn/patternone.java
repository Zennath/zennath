package JavaLearn;

import java.util.Scanner;

public class patternone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  no");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+  "  ");
				}
			System.out.println();
		}

	}

}
