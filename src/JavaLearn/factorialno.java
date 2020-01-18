package JavaLearn;

import java.util.Scanner;

public class factorialno {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
		num=sc.nextInt();
		int count =1;
		for(int i=1;i<=5;i++) {
			count =count*i;
			
		}
System.out.println(count);
	}

}
