import java.util.*;
import java.io.*;
class hill1
{
public static void main (String args[])
{
Scanner s = new Scanner(System.in);
int p[][] = new int[1][2];
int k[][] = new int[2][2];
int c[][] = new int[1][2];
int i,j,k1;
System.out.println("\n enter the value of 1st matrix : ");
for(i=0;i<1;i++)
{
for(j=0;j<2;j++)
{
//p[i][j] = s.nextInt();
p[i][j] = (int)s.next().charAt(0);
p[i][j] = p[i][j]-65;
}
}
System.out.println("\n enter the value of 2nd matrix : ");
 for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
k[i][j] = s.nextInt();
}
}

System.out.println("\n 1st matrix elements are : ");
for(i=0;i<1;i++)
{
for(j=0;j<2;j++)
{
System.out.println(p[i][j]);

}
}
System.out.println("\n 2nd matrix elements are : ");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.println(k[i][j]);

}
}

for(i=0;i<1;i++)
{
for(j=0;j<2;j++)
{
int sum=0;
for(k1=0;k1<2;k1++)
{
sum = sum+p[i][k1]*k[k1][j];
c[i][j]=sum;
}
}
}
System.out.println("\n matrix : ");
for(i=0;i<1;i++)
{
for(j=0;j<2;j++)
{
c[i][j] =(c[i][j]%26)+65;
char y=(char)c[i][j];
System.out.println(y);
}

}
}
}
/************** output **************/
/*
lab3-6@lab36-ThinkCentre-M90:~$ cd Desktop
lab3-6@lab36-ThinkCentre-M90:~/Desktop$ javac hill1.java
lab3-6@lab36-ThinkCentre-M90:~/Desktop$ java hill1

 enter the value of 1st matrix : 
B
C

 enter the value of 2nd matrix : 
1   
2
3
4

 1st matrix elements are : 
1
2

 2nd matrix elements are : 
1
2
3
4

 matrix : 
H
K
lab3-6@lab36-ThinkCentre-M90:~/Desktop$ javac hill1.java
lab3-6@lab36-ThinkCentre-M90:~/Desktop$ 
*/
