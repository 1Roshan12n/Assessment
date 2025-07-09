package Switch_Statement;
import java.util.*;
public class Color_code {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'R':
			System.out.print("Red");
			break;
		case 'B':
			System.out.print("Blue");
			break;
		case 'G':
			System.out.print("Green");
			break;
		case 'O':
			System.out.print("Orange");
			break;
		case 'Y':
			System.out.print("Yello");
			break;
		case 'W':
			System.out.print("White");
			break;
		default:
			System.out.print("Invalid Code");
		}

	}

}
