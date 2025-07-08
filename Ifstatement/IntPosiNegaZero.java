package Ifstatement;
import java.util.*;
public class IntPosiNegaZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0) {
			System.out.println("Zero");
		}else if(a<0) {
			System.out.println("Negative Number");
		}else if(a>0) {
			System.out.println("Positive Number");
		}
		

	}

}
