package JavaLearn;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
				System.out.println("enter no");
				n=sc.nextInt();
				boolean flag = true;
				for(int i=2;i<=n/2;i++) {
					if(n%i==0) {
						flag = false;
						break;
						}
					}
				System.out.println(n);
			if(flag) {
				System.out.println("prime");	
			}else {
			System.out.println("not prime");
			     }
			
			   }
			}