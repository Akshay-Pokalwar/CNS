
import java.util.Scanner;
import java.math.*;

public class CRT {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values for folowing:: ");
		System.out.print("a1 : ");
		int a1 = scanner.nextInt();
		
		System.out.print("m1 : ");
		int m1 = scanner.nextInt();
		
		System.out.print("a2 : ");
		int a2 = scanner.nextInt();
		
		System.out.print("m2 : ");
		int m2 = scanner.nextInt();
		
		System.out.print("a3 : ");
		int a3 = scanner.nextInt();
		
		System.out.print("m3 : ");
		int m3 = scanner.nextInt();
		
		
		int M = m1 * m2 * m3;
		
		int M1 = M / m1;
		int M2 = M / m2;
		int M3 = M / m3;
		
		int m1i = euclid(M1, m1);
		int m2i = euclid(M2, m2);
		int m3i = euclid(M3, m3);
		
		int x = (a1 * m1i * M1) + (a2 * m2i * M2) + (a3 * m3i * M3);
		
		System.out.println("x = " + x);
		
		
	}


	
	public static int euclid(int b, int m)
	{
	
		int A1, A2, A3;
		int B1, B2, B3;
		int T1, T2, T3;
		int Q;
		A1=1; A2=0; A3=m;
		B1=0; B2=1; B3=b;
		
		
		while(B3!=1)
		{
		
		/*
			if(B3==0)
			{
				A3= gcdof(m,b);
				System.out.println("Multiplicative inverse does not exist");
				return A3;
			}
		*/
			Q= (int)(A3/B3);
			T1 = A1-(Q*B1);
			T2 = A2-(Q*B2);
			T3 = A3-(Q*B3);
		
			A1=B1;
			A2=B2;
			A3=B3;
		
			B1=T1;
			B2=T2;
			B3=T3;
		}
		/*
		if(B2<0)
		{
			while(B2<0)
				B2 = B2 + m;
		}
		
		B3 = gcdof(m,b);
		System.out.println("GCD("+m+","+b+") "+B3);*/
		return B2;
		
	}
}
/*        OUTPUT   

guest-ggX5u7@lab3-9:~/Desktop$ javac CRT.java 
guest-ggX5u7@lab3-9:~/Desktop$ java CRT
Enter values for folowing:: 
a1 : 2   
m1 : 3
a2 : 3
m2 : 5
a3 : 2
m3 : 7
x = 23
guest-ggX5u7@lab3-9:~/Desktop$ ^C
guest-ggX5u7@lab3-9:~/Desktop$ 


*/

