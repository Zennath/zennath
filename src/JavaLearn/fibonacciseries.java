package JavaLearn;

public class fibonacciseries {

	public static void main(String[] args) {
		int a=1,b=5;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			c=a;
		}

	}

}
