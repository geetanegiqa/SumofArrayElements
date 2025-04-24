package day7;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,5,4,5,6};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of Number in Array is: "+sum);
		
	}

}
