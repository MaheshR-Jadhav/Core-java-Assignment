import java.util.Scanner;
class cal
{
	public static void main(String args[])
	{
		sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No to Check whether No is Prime or Not :");
		int no = sc.nextInt();
		for(int i=12;i<no;i++)
		{
			System.out.println(i);
			if(i<no-1)
			{
				System.out.println("+");
				sum=sum + i;
			}
			
		}
		System.out.println("sum is :", sum);
	
	}
}
