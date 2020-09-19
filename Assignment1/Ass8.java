import java.util.Scanner;
class Simple_interest
{
	public static void main(String args[])
	{

		float si,p, r, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle :");
		p = sc.nextFloat();
		System.out.println("Enter the Interest rate :");
		r = sc.nextFloat();
		System.out.println("Enter the Time :");
		t = sc.nextFloat();
		
 		si =(r * t * p) / 100;
		System.out.println("The simple interest is :" +si);
	}
}

