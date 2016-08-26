public class LeapYear{
	public static void isLeapYear (int n){
		if ((n % 4 ==0 && n % 100 !=0)|| n % 400 == 0 ){
			System.out.println(n + " is a leap year!" );
			return;
		}
			System.out.println(n + " is not a leap year!" ); 
	}

	public static void main(String[] args) {
		
		// will pass
		isLeapYear(2000);
		isLeapYear(2004);

		// wiil fail
		isLeapYear(1900);
		isLeapYear(2003);
		isLeapYear(2100);

	}

}
