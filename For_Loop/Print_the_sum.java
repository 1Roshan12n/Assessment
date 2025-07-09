package For_Loop;
import java.util.*;
public class Print_the_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int sum=0;
		
		for(;a!=0;a=a/10) {
			int rem=a%10;
			sum+=rem;
		
		}	
		System.out.print(sum);

	}

}
