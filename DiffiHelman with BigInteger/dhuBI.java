import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
public class dhuBI
{
	public static void main(String args[])
	{	
		Scanner x=new Scanner(System.in);
		System.out.println("enter value of q");
		BigInteger q=x.nextBigInteger();
		System.out.println("enter value of a(alpha)");
		BigInteger a=x.nextBigInteger();
		System.out.println("enter value of X(a)");
		BigInteger xa=x.nextBigInteger();
		System.out.println("enter value of X(b)");
		BigInteger xb=x.nextBigInteger();
		BigInteger ya=a.modPow(xa,q);
		System.out.println("public key of A:"+ya);	
		BigInteger yb=a.modPow(xb,q);
		System.out.println("public key of B:"+yb);
		BigInteger k1,k2;
		k1=ya.modPow(xb,q);
		System.out.println("secret key 1:"+k1);
		k2=yb.modPow(xa,q);
		System.out.println("secret key 2:"+k2);
		if(k1.equals(k2))
			{
				System.out.println("secret keys are equal");
			}
		else
			{
				System.out.println("secret keys are not equal");
			}


	}
}