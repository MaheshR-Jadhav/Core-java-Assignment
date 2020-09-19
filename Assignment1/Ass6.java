import java.util.Scanner;
class Ass6{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the radious of circle:");
	int rad = sc.nextInt();
	float pi = 3.14f;
	double Area = pi*rad*rad;
	double cir =2*pi*red;
	//System.out.println("value of circuference="+cir);
	//System.out.println("value of radius="+Area);
	System.out.printf("value of radius %.3f",Area); //for taking output upto 3 decimal
	System.out.printf("value of circumference= %.3f",cir );
	}
}

/*import java.util.Scanner; class Ass6{ public static void main(String args[]){ Scanner sc = new Scanner (System.in); System.out.println("Enter the radius of the circle ="); int rad = sc.nextInt(); float pi = 3.14F; double Area = pi*rad*rad; double cir = 2*pi*rad; System.out.printf("value of circumference = % .3f\n" ,cir); System.out.printf("Value of Radius = %.3f" ,Area); // for taking output into 3 decimal places } } */
