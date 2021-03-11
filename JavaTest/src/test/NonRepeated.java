package test;
import java.util.Scanner;
public class NonRepeated 
{
	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		while(true)
		{
			System.out.println("Enter String");
			String s=sc.next();
			char []a=s.toCharArray();


			for(int i=0;i<a.length;i++)
			{
				int count=0;
				if(Character.toLowerCase(a[i])=='a'
						||Character.toLowerCase(a[i])=='e'
						||Character.toLowerCase(a[i])=='i'
						||Character.toLowerCase(a[i])=='o'
						||Character.toLowerCase(a[i])=='u')
				{
					for(int j=0;j<a.length;j++)
					{
						if(i==j){
							continue;} 
						if(Character.toLowerCase(a[j])==Character.toLowerCase(a[i]))               
						{
							count++;
						}
					}
					if(count==0)
					{
						System.out.println(a[i]);
						break;
					}

				}
			}

		}
	}
}
