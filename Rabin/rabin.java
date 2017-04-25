
import java.util.Scanner;
import java.math.*;

public class rabin 
{
public static double crt(double a1, double a2, int m1, int m2)
 {
			
		int M = m1 * m2;
		
		int M1 = M / m1;
		int M2 = M / m2;
		
		int m1i = euclid(M1, m1);
		int m2i = euclid(M2, m2);
		
		double x = (a1 * m1i * M1) + (a2 * m2i * M2);
		
		//System.out.println("x =\n " + x);
		return x;
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
		//System.out.print("\nInverse : "+B2);
		return B2;
		
	}
	public static void main(String... args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values for folowing:: ");
		System.out.print("p : ");
		int p = scanner.nextInt();
		
		System.out.print("q : ");
		int q = scanner.nextInt();
		
		System.out.print("Plain : ");
		int plain = scanner.nextInt();
		
		
		int n = p*q;
		
		int c = (plain * plain) % n;
		
		int raised = (p+1)/4;
		
		double a11 = Math.pow(c, raised);
		double a1  = a11 % p;
		double a2 =  - a1;
		
		int raisedB = (q+1)/4;
		
		double b11 = Math.pow(c, raisedB) ;
		double b1  = b11 % q;
		double b2 =  - b1;
		
		
		double P1=crt(a1,b1,p,q);
		double P11=P1%n;
		System.out.print("\nPlain1 : "+P11);
		
		double P2=crt(a2,b1,p,q);
		double P22=P2%n;
		System.out.print("\nPlain2 : "+P22);
		
		double P3=crt(a1,b2,p,q);
		double P33=P3%n;
		System.out.print("\nPlain3 : "+P33);
		
		double P4=crt(a2,b2,p,q);
		double P44=P4%n;
		System.out.print("\nPlain4 : "+P44);
		
		}		
		
		
	}

/*
*******Output**************
lab3-9@lab3-9:~/Desktop$ javac Rabin.java
lab3-9@lab3-9:~/Desktop$ java Rabin
Enter values for folowing:: 
p : 23
q : 7
Plain : 24

Plain1 : -45.0
Plain2 : -24.0
Plain3 : 24.0
lab3-9@lab3-9:~/Desktop$ lab3-9:~*/
