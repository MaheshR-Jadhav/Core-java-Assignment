import java.util.Scanner;
class year_week_day
{
	public static void main(String args[])
	{
		int m, year, week, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of days :");
		m = sc.nextInt();
		year = m / 365;
		m = m % 365;
		System.out.println("No of years :"+year);
		week = m / 7;
 		m = m % 7;
		System.out.println("No of weeks :"+week);
		day = m;
		System.out.println("No of days :"+day);
	}
}
