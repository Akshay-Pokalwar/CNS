import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
public class rabin
{
	public static void main(String args[])
	{	
		Scanner x=new Scanner(System.in);
		System.out.println("enter value of p");
		BigInteger p=x.nextBigInteger();
		System.out.println("enter value of q");
		BigInteger q=x.nextBigInteger();
		System.out.println("enter value of n");
		BigInteger n=x.nextBigInteger();
		System.out.println("enter value of m");
		BigInteger m=x.nextBigInteger();
		BigInteger c=(m.multiply(m)).mod(n);
		System.out.println("value of c:"+c);
		BigInteger temp1=((p.add(new BigInteger("1"))).divide(new BigInteger("4")));
		BigInteger a1=c.modPow(temp1,p);
		System.out.println("value of a1:"+a1);
		BigInteger b1=(c.modPow(temp1,q));
		System.out.println("value of b1:"+b1);

	}
}


/* output without CRT implmentation
mgm@lab3-15:~/Desktop/rabin$ javac rabin.java 
mgm@lab3-15:~/Desktop/rabin$ java rabin
enter value of p
23
enter value of q
7
enter value of n
161
enter value of m
24
value of c:93
value of a1:1
*/
