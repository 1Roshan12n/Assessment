package For_Loop;
import java.util.*;
public class Pattern_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<i;j++) {
				count+=1;
				System.out.print(count+" ");
			}System.out.println(" ");
		}
		

	}

}
