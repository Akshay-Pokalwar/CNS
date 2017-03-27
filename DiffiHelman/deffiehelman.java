import java.io.*;
import java.util.Scanner;
public class deffiehelman
{
	public static void main(String args[])
	{	
		Scanner x=new Scanner(System.in);
		System.out.println("enter value of q");
		int q=x.nextInt();
		System.out.println("enter value of a(alpha)");
		int a=x.nextInt();
		System.out.println("enter value of X(a)");
		int xa=x.nextInt();
		System.out.println("enter value of X(b)");
		int ya=0,xb=x.nextInt(),yb,k1,k2;
		ya=(int)Math.pow(a,xa)%q;
		System.out.println("public key of A:"+ya);
		yb=(int)Math.pow(a,xb)%q;
		System.out.println("public key of B:"+yb);
		k1=(int)Math.pow(ya,xb)%q;
		System.out.println("secret key 1:"+k1);	
		k2=(int)Math.pow(yb,xa)%q;
		System.out.println("secret key 2:"+k2);
		if(k1==k2)
			{
				System.out.println("secret keys are equal");
			}
		else
			{
				System.out.println("secret keys are not equal");
			}
	}
}