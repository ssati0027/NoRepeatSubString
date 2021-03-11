package test;
import java.util.Scanner;
public class Result {
	public static int getMinDeletions(String s){
		int count=0;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]&&a[j]!='@'){
					count++;
					a[j]='@';
				}
			}
		}  
		return count;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		System.out.println(getMinDeletions(s));
	}
}
