import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		int rem,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No to Reverse :");
		int no = sc.nextInt();
		while(no != 0)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("reverse of a No is :"+rev);
	}
} 
