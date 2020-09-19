class Ass3{
	public static void main(String args[]){
	int x =2;
	int y = x*x+3*x-7;
	System.out.println("value of y ="+y);
	y= x++ + ++x; 
	System.out.println("value of y ="+y);
	System.out.println("value of y ="+x);
	int z = x++ - --y - --x + x++;
	System.out.println("value of y ="+x);
	System.out.println("value of y ="+y);
	System.out.println("value of y ="+z);

	boolean b1 = true;
	boolean b2 = false;
	boolean z1 = b1 && b2 || !(b1 || b2);
	System.out.println("value of z1 ="+z1);
	}
}
