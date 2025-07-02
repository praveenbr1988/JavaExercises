package exercises.java;

public class SwapTwoNos {

	public static void usingtemp() {
		int mysalary = 20;
		int prabhusalary=50;
		int temp;		
		System.out.println(mysalary +", " +prabhusalary);
		temp=mysalary;
		mysalary=prabhusalary;
		prabhusalary=temp;
		System.out.println(mysalary +", " +prabhusalary);
		
	}	
	public static void withoutUsingTemp() {


//		a = a + b;  // a = 30
//		b = a - b;  // b = 30 - 20 = 10
//		a = a - b;  // a = 30 - 10 = 20

		int mysalary = 20;
		int prabhusalary=50;				
		/*
		 * System.out.println(mysalary +", " +prabhusalary); mysalary=
		 * mysalary-prabhusalary;//20-50=-30 prabhusalary=mysalary+prabhusalary;
		 * //-30+50=20 mysalary=prabhusalary-mysalary; //20-(-30)=50
		 * System.out.println(mysalary +", " +prabhusalary);
		 */
		System.out.println(mysalary +", " +prabhusalary);
		mysalary= mysalary*prabhusalary;//20-50=-30
		prabhusalary=mysalary/prabhusalary; //-30+50=20
		mysalary=mysalary/prabhusalary; //20-(-30)=50		
		System.out.println(mysalary +", " +prabhusalary);
	}

	public static void usingXOR() {
		int a = 20;
		int b=50;
		System.out.println(a +", " +b);
		a= a^b;
		b= a^b;
		a= a^b;
		System.out.println(a +", " +b);
	}
	
	
	public static void main(String[] args) {
		//usingtemp();
		//withoutUsingTemp();
		usingXOR();
	}

}
