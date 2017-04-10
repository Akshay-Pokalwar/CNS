/*
 *	Aim : Implementation of General Cesar Cipher
 * 	Name: Aman Vishnani
 *	Class : BE CSE - 1
 *
  */
import java.util.*;

public class generalCesarCipher {
    public static void main (String args[])
    {
        int ch,Key;
        String Text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Encrypt\n2.Decrypt");
        ch = scanner.nextInt();
        System.out.println("Enter Text:");
        Text = scanner.next();
        System.out.println("Enter Key:");
        Key = scanner.nextInt();
        if(ch==1)
            System.out.println(encrypt(Text, Key));
        else
            System.out.println(decrypt(Text, Key));
    }

    public static String encrypt(String plainText, int key)
    {
        char cipher[] = new char[plainText.length()];
        int x;
        for(int i=0; i<plainText.length(); i++)
        {
            x = (int) plainText.charAt(i);
            x = x+key;
            if(x>122)
            {
                x = x - 122;
                x=x%26;
                x = 97+x;
            }
            else if(x>90 && x<97)
            {
                x = x - 90;
                x=x%26;
                x = 65+x;
            }
            else
            {
                //do Nothing
            }
            cipher[i] = (char) x;
        }
        return new String(cipher);
    }


    public static String decrypt(String cipherText, int key)
    {
        char newPlainText[] = new char[cipherText.length()];
        int x;
        for(int i=0; i<cipherText.length(); i++)
        {
            x = (int) cipherText.charAt(i);
            x = x-key;
            if(x<97 && x>90)
            {
                //x = x - 122;
                //x=x%26;
                x = 26+x;
            }
            else if(x<65)
            {
                x = 26+x;
            }
            else
            {
                //do Nothing
            }
            newPlainText[i] = (char) x;
        }
        return new String(newPlainText);
    }
}


/*
mgm@lab3-5:~/Desktop$ java generalCesarCipher
1. Encrypt
2.Decrypt
1
Enter Text:
aman
Enter Key:
5
frfs
mgm@lab3-5:~/Desktop$ java generalCesarCipher
1. Encrypt
2.Decrypt
2
Enter Text:
frfs
Enter Key:
5
aman
mgm@lab3-5:~/Desktop$ java generalCesarCipher
1. Encrypt
2.Decrypt
1
Enter Text:
AMAN
Enter Key:
5
FRFS
mgm@lab3-5:~/Desktop$ java generalCesarCipher
1. Encrypt
2.Decrypt
2
Enter Text:
FRFS
Enter Key:
5
AMAN



*/
