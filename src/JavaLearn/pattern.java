package JavaLearn;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  no");
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			for(int k=no-i;k>=1;k--) {
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
