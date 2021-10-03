package week1.day1;

public class LeranPrimeNumber {

	public static void main(String[] args) {
        int num=13;
        boolean flag=false;
        for (int i = 2; i <=13/2; i++) {
			if (num%1==0) {
				flag=true;
				break;
				
			}
		}
        if (!flag) {
			System.out.println(num+" "+"PrimeNmuber");
		} else {
			System.out.println(num+" "+"Not a PrimeNmuber");

		}
	}

}
