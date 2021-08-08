package week1.day1;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1634;
		int length=0,i,quotient,reminder=0,a=num,multi=1;
		int calculator=0,fin=num;
		
		while (a>0)
		{
			a=a/10;
			length=length+1;
		}
		while (num>0)
		{
			quotient=num/10;
			reminder=(num%10);
			for(i=0;i<length;i++)
			{
				multi=multi*reminder;
						
			}
			calculator=calculator+multi;
			multi=1;
			num=quotient;
			
		}
		if (calculator==fin)
		{
			System.out.println("ARMStrong Number");
		}
		else
		{
			System.out.println("Not an ARMStrong Number");
		}
		
	}

}
