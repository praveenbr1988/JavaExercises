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
	
	
	public static void main(String[] args) {
		//usingtemp();
		withoutUsingTemp();
	}

}
