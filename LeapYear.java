public class LeapYear{
	public static boolean isLeapYear (int n){
		if ((n % 4 ==0 && n % 100 !=0)|| n % 400 == 0 ){
			
			return true;
		}
		return false;		
	}

	public static void main(String[] args) {

		for (String value : args){

		int year= Integer.parseInt(value); 

		if (isLeapYear(year)){
			System.out.println(year + " is a leap year!" );
			
		}else {
		System.out.println(year + " is not a leap year!" );
		} 
}


	}

}
