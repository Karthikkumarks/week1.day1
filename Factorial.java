package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5,fact=1,i;
		for (i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " + num + " is "+ fact);

	}

}
