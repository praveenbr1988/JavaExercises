package exercises.java;


public class TripletsSum {

	public static void main(String[] args) {

		int[] arr = {0,1,2,3,4,5};
		int sum = 6;
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length-1; j++){
				for(int k=j+1; k<arr.length-1; k++){
					if(arr[i]+arr[j]+arr[k]==sum){
						System.out.println("(" + arr[i]+","+ arr[j] +","+ arr[k]+")");
			 }
			}
			}
			}
		
		
}
}
