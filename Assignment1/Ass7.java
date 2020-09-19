import java.util.Scanner;
class Ass7{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of 5 Subject:");
	int s1 = sc.nextInt();
	int s2 = sc.nextInt();
	int s3 = sc.nextInt();
	int s4 = sc.nextInt();
	int s5 = sc.nextInt();	
	//int sum = s1+s2+s3+s4+s5;
	/*System.out.println("the sum of subject mks is:"+sum);
	int per = sum/500;
	System.out.println("percentage is:"+per);*/
	/*double percentage = (double)((s1+s2+s3+s4+s5)/500);
	System.out.println("sum = " +percentage);*/
	double sum = s1+s2+s3+s4+s5;
	System.out.println("Sum="+sum);
	double percentage = (sum*100)/500;
	System.out.println("percentage marks="+percentage+"%");
	}
}
	
