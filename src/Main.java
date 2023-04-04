
public class Main {

	public static void main(String[] args) {

		
		//walk(8);	
		//System.out.println(factoryal(4));
		System.out.println(power(2, 3));
	}

	private static int power(int base, int exponent) {
		 
		if(exponent < 1)return 1;
		return base * power(base, exponent - 1);
		
		
		
		
	}

	private static int factoryal(int i) {
	  
		if(i<1)return 1;
		return i * factoryal(i-1);
		
		
	}

	private static void walk(int steps) {
		
		if(steps<1)return;
		System.out.println(" stssdsadsadasadsadsap ");
		System.out.println(" stssdsadsadasadsadsap ");
		System.out.println(" stssdsadsadasadsadsap ");
		steps--;
		walk(steps);
		
		
		
		
	}

}
