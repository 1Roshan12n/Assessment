package While_Loop;

public class First5values235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int count=0;
		while(count<5) {
			if(num%2==0 && num%3==0 && num%5==0) {
				System.out.println(num);
				count++;
				
			}
			num++;
		}

	}

}
