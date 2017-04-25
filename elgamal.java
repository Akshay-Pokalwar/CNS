import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
public class elgamal
{
	public static void main(String args[])
	{	
		Scanner x=new Scanner(System.in);
		System.out.println("enter value of q");
		BigInteger q=x.nextBigInteger();
		System.out.println("enter value of alpha");
		BigInteger a=x.nextBigInteger();
		System.out.println("enter value of X(A)");
		BigInteger xa=x.nextBigInteger();
		BigInteger ya=a.modPow(xa,q);
		System.out.println("value of Y(A):"+ya);
		System.out.println("enter value of M");
		BigInteger m=x.nextBigInteger();
		System.out.println("enter value of K2");
		BigInteger k2=x.nextBigInteger();
		BigInteger k=ya.modPow(k2,q);
		System.out.println("value of K:"+k);
		BigInteger c1=a.modPow(k2,q);
		System.out.println("value of c1:"+c1);
		BigInteger c2=(k.multiply(m)).mod(q);
		System.out.println("value of c2:"+c2);
		BigInteger K=c1.modPow(xa,q);
		System.out.println("value of K:"+K);
		BigInteger M=(c2.multiply(K.modInverse(q)).mod(q));
		System.out.println("value of M:"+M);
		

	}
}


/*output

mgm@lab3-15:~/Desktop/elgamal$ javac elgamal.java 
mgm@lab3-15:~/Desktop/elgamal$ java elgamal
enter value of q
19
enter value of alpha
10
enter value of X(A)
5
value of Y(A):3
enter value of M
17
enter value of K2
6
value of K:7
value of c1:11
value of c2:5
value of K:7
value of M:17

*/
