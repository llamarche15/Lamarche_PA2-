package lamarche_P1;
import java.util.Scanner;
public class Lamarche_P1 
{
	public static int []Encrypt(int P[])
	{
		int c=P.length;
		int C[]=new int[P.length];
		for(int i=0; i<P.length; i++)
		{
			C[i]=P[i];
		}
		for(int i=0; i<c; i++)
		{
			C[i]=(C[i]+7)%10;		
		}
		//reversing 1st with 3rd didgit
		int temp;
		temp=C[0];
		C[0]=C[2];
		C[2]=temp;
		//reversing 2nd with 4th digit
		temp=C[1];
		C[1]=C[3];
		C[3]=temp;
		return C;
	}
	public static int []Decrypt(int P[])
	{
		int C[]=new int[P.length];
		for(int i=0; i<P.length; i++)
		{
			C[i]=P[i];
		}
		int c=P.length;
		for(int i=0; i<c; i++)
		{
			if((C[i]-7)<=0)
			C[i]=C[i]+10;
		}
		for(int i=0; i<4; i++)
		{
			C[i]=(C[i]-7)%10;
		}
		//reversing 1st with 3rd didgit
		int temp;
		temp=C[0];
		C[0]=C[2];
		C[2]=temp;
		//reversing 2nd with 4th digit
		temp=C[1];
		C[1]=C[3];
		C[3]=temp;
		return C;
	}
	public static String Print(int P[])
	{
		for(int i=0; i<4; i++)
		{
			System.out.print(P[i]);
		}
		System.out.println();
		return "";
	}
	  
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input four-digit integer: ");
		int C=Integer.parseInt(sc.nextLine());
		int P[]=new int[4];
		for(int i=0; i<4; i++)
		{
			P[3-i]=C%10;
			C=C/10;
		}
		Print(P);
		System.out.println("Encrypted integer is:");
		Print(Encrypt(P));
		System.out.println("Decrypted integer is: ");
		Print(Decrypt(Encrypt(P)));
		sc.close();
	}
}
