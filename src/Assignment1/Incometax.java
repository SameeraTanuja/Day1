package Assignment1;
import java.util.Scanner;
public class Incometax {

	public static void main(String args[]) {
		int a, tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income");
		a=sc.nextInt();
		sc.close();
		if(a >= 0 && a <=180000) {
			System.out.println("You are not under tax");
		}
		else if(a >= 181001 && a<= 300000) {
			tax = (a*10)/100;
			System.out.println("You have to pay :" +tax);
		}
		else if(a >= 300001 && a<=500000) {
			tax = (a*20)/100;
			System.out.println("You have to pay :" +tax);
		}
		else if(a >= 500001 && a<=1000000) {
			tax = (a*30)/100;
			System.out.println("You have to pay :" +tax);
		}
	}

}
