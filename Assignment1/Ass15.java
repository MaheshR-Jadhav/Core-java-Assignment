import java.util.Scanner;
 
class gender
{
    public static void main(String args[])  throws Exception
    {
        String gender;
        int age;
      
         
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Enter Gender (Male/Female): ");
        gender=SC.next();
 
        System.out.print("Enter age: ");
        age=SC.nextInt();
 	

	System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
	
	if(age >= 25){
		System.out.println("Eligible for marriage");
	}else{
		System.out.println("Not Eligible for Marriage");
	}
                                  
    }
}
