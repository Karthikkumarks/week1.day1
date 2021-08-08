package week1.day1;

public class AssignmentDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=349;
		int quotient;
		int reminder=0;
		
		while (num>0)
		{
			quotient=num/10;
			reminder=reminder+(num%10);
			num=quotient;
			
		}
		System.out.println(reminder);

	}

}
