package assignment1part2;

import java.util.Scanner;

public class Sentence {
	public static void main(String args[]) {
		String str,str1="",fin="";
	Scanner ip=new Scanner(System.in);
	str=ip.nextLine();
	for(int i=0;i<str.length()-1;i++)
	{
		if((str.charAt(i)==str.charAt(i+1))&&(str.charAt(i)==' '));
		else {
			str1+=str.charAt(i);
		}
	}
	str1+=str.charAt(str.length()-1);
	System.out.println(str1);
	String words[]=str1.split(" ");
	System.out.println("Enter the word to be deleted");
	System.out.println("enter position of word");
	String b=ip.nextLine();
	int a=ip.nextInt(),k=words.length;
	ip.close();
	for(int i=a-1;i<words.length-1;i++)
	{
		if(b.equals(words[a-1]))
			words[i]=words[i+1];
		k--;
}
	for(int j=0;j<words.length-1;j++) {
		fin+=words[j]+" ";
		
	}System.out.println(fin);
	}
}
