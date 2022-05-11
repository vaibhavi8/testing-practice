package hw5;



public class Functions{
	public Boolean isPrime(int x) {
		boolean val = true;

		for(int i = 2; i <x;i++) {
			if(x%i==0) {
				val = false;
			}
		}
		if(x==1 || x==2) {
			val=true;
		}
		return val;
	}

}