package Assignment1;
import java.util.Scanner;

public class Billdiscount {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float item=sc.nextFloat();
		sc.close();
		float disc=(float)(item * 0.35);
		float newprice=item-disc;
		System.out.println("disc = "+disc+"new price="+newprice);
		}
}
