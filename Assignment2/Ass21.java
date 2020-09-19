import java.util.Scanner;
class arrayclass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int total =0;
		float average=0;
		System.out.println("Enter number of elements:");
		num = sc.nextInt();

		int[] myarray = new int[num];
		System.out.println("Enter value:");
		for(int i=0; i<num; i++)
		{
			
			myarray[i] = sc.nextInt();
			total = total + myarray[i];
		}
		System.out.println("Sum is : "+total);
		average = (float) total / num;
		System.out.println("Avg is : "+average);
	}
}
