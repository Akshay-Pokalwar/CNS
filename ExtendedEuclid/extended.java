import java.util.*;

public class extended
{

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter b=");
		int b = s.nextInt();
		System.out.print("Enter Message m=");
		int m = s.nextInt();
		System.out.println("Multiplicative inverse of "+b+" modulo "+ m + " = " +  euclid(b,m));
	}
	
	
	

	static int gcdof (int a, int b)
	{
		if(a==0)
			return b;
		else if(b==0)
			return a;
		else {
			while(a!=b)
			{
				if(a>b)
					a= a-b;
				else 
					b = b - a;
			}
			return a;
		
		}
	
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
			if(B3==0)
			{
				A3= gcdof(m,b);
				System.out.println("Multiplicative inverse does not exist");
				return A3;
			}
		
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
		if(B2<0)
		{
			while(B2<0)
				B2 = B2 + m;
		}
		B3 = gcdof(m,b);
		System.out.println("GCD("+m+","+b+") "+B3);
		return B2;
		
	}
}
