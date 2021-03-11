package test;

public class RoatateArray {
	public static void main(String[] args) {
		int [][]a={{1,2,3},
					{4,5,6},
					{7,8,9}};
		int y[][]=a;
		for(int i=0;i<a.length;i++){
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}

