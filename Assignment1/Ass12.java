import java.util.Scanner;
class empsalary
{
	public static void main(String args[])
	{
		float basic_salary,da,hra,da1,hra1,GrossPayment;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basic Salary Of Employee :");
		basic_salary = sc.nextFloat();
		
		System.out.println("Enter DA of Employee :");
		da1 = sc.nextFloat();
		
		System.out.println("Enter Basic HRA of Employee :");
		hra1 = sc.nextFloat();
		
		da = (da1 * basic_salary) /100;
		hra = (hra1 * basic_salary) /100;

		GrossPayment = basic_salary + da +hra;
		System.out.println("Gross Salary of Employee: "+GrossPayment);
	}
}
