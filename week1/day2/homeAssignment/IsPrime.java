package week1.day2.homeAssignment;

public class IsPrime {

	public static void main(String[] args) 
	{
		int num=0;
		
		int Count=0;
		
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					Count++;
				}
			}
				if(Count==2)
				{
					System.out.println(num  + "is a Prime number");
				}
				else
				{
					System.out.println(num  +  "is not a Prime number");
				}
			}
          
		}
		
	}


