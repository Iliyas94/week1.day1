package week1.day1;

public class LearnArmStorngNumber {

	public static void main(String[] args) {

  int number=153;
  
   int calculated=0,remainder,originalNumber;
   originalNumber=number;
   while (153>0) {
	   remainder=153%10;
	   originalNumber/=10;
	   calculated=calculated +(remainder^3);
	if (calculated==originalNumber) {
		System.out.println(number+ " " +"AmrStrongNUmber");
		
	}else
	{
		System.out.println(number+" "+"Not ArmStrongNumber");
		
}
		
	}

}
}