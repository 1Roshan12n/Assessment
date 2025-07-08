package Ifstatement;
import java.util.*;
public class AlphabetChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		if(a<b) {
		System.out.print("If the first character is"+" '"+a+"' "+"and Second character is"+"'"+b+"' "+"then the output should be "+a+","+b);

	}else {
		System.out.print("If the first character is"+" '"+a+"' "+"and Second character is"+"'"+b+"' "+"then the output should be "+b+","+a);
	}

}
}
