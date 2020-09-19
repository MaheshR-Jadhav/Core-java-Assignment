import java.util.Arrays;
class arraysort
{
	public static void main(String args[])
	{
		int arr[] = {60,20,30,40,50};
		System.out.println("Before Sorting");
		for(int a : arr)
		{
			System.out.println(a);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting");
		for(int a : arr)
		{
			System.out.println(a);
		}
	}
}
