package lamarche_P2;
import java.util.Scanner;
public class Lamarche_P2 
{
	public static void main (String [] args) 
	{
		Scanner sc = new Scanner (System.in);
         
		int weight;
		int height;
		int bMI=0;
		int choice=0;
         
		System.out.print ("\n1. Weight in pounds and height in inches\n ");
		System.out.print ("\n2. Weight in kilograms and height in meters\n ");
         
		System.out.print ("\nEnter choice of formula: ");
		choice = sc.nextInt();
        
		if (choice==1)
		{
			System.out.print ("Enter Your Weight in Pounds: ");
			weight = sc.nextInt();
			System.out.print ("Enter Your Height in Inches: ");
			height = sc.nextInt();
			bMI = (weight * 703) / (height * height);
		}
		if (choice==2)
		{
			System.out.print ("Enter Your Weight in Kilograms: ");
			weight = sc.nextInt();
			System.out.print ("Enter Your Height in Meters: ");
			height = sc.nextInt();
			bMI = (weight * 703) / (height * height);
		}
         
		System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bMI);
         
		System.out.println ("BMI VALUES");
		System.out.println ("Underweight = <18.5");
		System.out.println ("Normal weight = 18.5–24.9");
		System.out.println ("Overweight = 25–29.9");
		System.out.println ("Obesity = BMI of 30 or greater");
			
		sc.close();
	}
}
