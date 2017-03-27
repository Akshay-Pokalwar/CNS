import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
public class rsa
{
	public static void main(String args[])
	{	
		Scanner x=new Scanner(System.in);
		System.out.println("enter value of p");
		BigInteger p=x.nextBigInteger();
		System.out.println("enter value of q");
		BigInteger q=x.nextBigInteger();
		BigInteger n=p.multiply(q);
		System.out.println("enter value of n:"+n);
		BigInteger $n=(p.subtract(new BigInteger("1"))).multiply(q.subtract(new BigInteger("1")));
		System.out.println("value of phy(n):"+$n);
		System.out.println("enter value of e");
		BigInteger e=x.nextBigInteger();
		BigInteger d=e.modInverse($n);
		System.out.println("value of d="+d);
		System.out.println("enter value of message(M)");
		BigInteger m=x.nextBigInteger();
		BigInteger c=m.modPow(e,n);
		System.out.println("value of Cipher:"+c);
		BigInteger m1=c.modPow(d,n);
		System.out.println("value of Message:"+m1);
	}
}