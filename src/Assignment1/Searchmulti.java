package Assignment1;

import java.util.*;

public class Searchmulti {
	public static void main(String args[]) {
		int s1,s2,flag=0;
		int[][] num= {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be searched in an array format for 2 dimensional array");
		s1=Integer.parseInt(scanner.next());
		s2=Integer.parseInt(scanner.next());
		scanner.close();
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				if(s2==num[i][j])
					flag=1;
				
			}
		}
		if(flag==1)
			System.out.println("Element is found");
		else
			System.out.println("Element not found");
		
	}

}
