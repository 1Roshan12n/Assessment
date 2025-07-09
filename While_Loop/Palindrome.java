package While_Loop;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int ori =num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}if(ori==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
