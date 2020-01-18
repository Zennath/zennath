package JavaLearn;

import java.util.Scanner;

public class patterntwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  no");
		int no=sc.nextInt();
		for(int i=no;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+ "  ");
				}
			System.out.println();
		}

	}

}
