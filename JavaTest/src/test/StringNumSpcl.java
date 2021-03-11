package test;
import java.util.*;
public class StringNumSpcl {
	public static void main(String[] args) {
		String s="S$3@t@0i5";
		String s1="",s2="",s3="",f2="";;

		System.out.println(s);
		System.out.println();
		char temp;
		char a[]=s.toCharArray();

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{   
				if(Character.toLowerCase(a[j])>Character.toLowerCase(a[j+1]))
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(a[i]))
			{
				s1=s1+a[i];
			}
			else if(Character.isDigit(a[i])){
				s2=s2+a[i];
			}
			else 
				s3=s3+a[i];
		}
		char[] a2=s2.toCharArray();
		Arrays.sort(a2);
		
		for(int i=a2.length-1;i>=0;i--){
			f2=f2+a2[i];
		}
		System.out.println(s1+f2+s3);
	}
}

