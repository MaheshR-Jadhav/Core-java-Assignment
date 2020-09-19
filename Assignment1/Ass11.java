import java.util.Scanner;
class swap
{
	public static void main(String args[])
	{
		int x,y;
		System.out.println("Enter the value of X and Y :");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping Numbers :" +x+ " " +y);
		x = x + y;
		y = x - y;
		x = x - y;
  		System.out.println("After Swapping: " +x+" "+y);
	}
}
