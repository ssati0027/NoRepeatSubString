package test;

import java.util.Scanner;

public class RepeatedDelete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		String s1="";
		System.out.println(s);

		char a[]=s.toCharArray();

		for(int i=0;i<s.length();i++){

			for(int j=i+1;j<s.length();j++){
				if(a[i]==a[j]){
					a[j]='0';

				}
			}
			if(a[i]!='0'){
				s1=s1+a[i];
			}

		}
		System.out.println();
		System.out.print(s1);
	}
} 

