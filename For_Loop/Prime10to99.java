package For_Loop;

public class Prime10to99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=10;n<=99;n++) {
		boolean isprime=true;
		if(n<=1) {
			isprime=false;
			break;
		}else {
			for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime =false;
				break;
			}
		}
		}
		if(isprime) {
			System.out.println(n);
		}
		
	}

}
}
