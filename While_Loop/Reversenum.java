package While_Loop;

public class Reversenum {
	public static void main(String[] args) {
		int num=12345;
		int rem=0;
		while(num!=0) {
			int rev=num%10;
			rem=rem*10+rev;
			num=num/10;
		}
		System.out.println(rem);
		
	}
}
