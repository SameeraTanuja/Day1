package Assignment1;
import java.util.Scanner;

public class Result{

	  private static Scanner sc;

	public static void main(String[] args) {
	  int mat, sci, eng;
	  sc = new Scanner(System.in);
	  System.out.println("Enter score for mat: ");
	  mat = sc.nextInt();
	  System.out.println("Enter score sci: ");
	  sci = sc.nextInt();
	  System.out.println("Enter score eng: ");
	  eng = sc.nextInt();
	  if(mat>60 && sci>60 && eng>60)
		  System.out.println("Pass");
	  else if((mat>60 && sci>60)||(sci>60 && eng>60)||(mat>60 && eng>60))
		  System.out.println("Promoted");
	  else
		  System.out.println("Fail");
	  }
}
	  

