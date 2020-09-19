import java.util.Scanner;
class Fehrenheit_Celsius
{
	public static void main(String args[])
	{
		double celsius, fehrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temprature in fehrenheit :");
		fehrenheit = sc.nextDouble();
		celsius = (fehrenheit-32)*(0.5556);
		System.out.println("Temprature in Celsius :"+celsius);
		}
}
