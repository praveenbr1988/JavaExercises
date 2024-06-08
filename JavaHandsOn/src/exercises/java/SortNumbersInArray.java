package exercises.java;

public class SortNumbersInArray {

	public static void main(String[] args) {

		int[] input= new int[]{2,6,23,98,24,35,78};
		System.out.print("Original Order Is: ");
		for(int i=0;i<input.length;i++)
			System.out.print(" "+input[i]);
		int temp;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]<input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}

		System.out.println();
		System.out.print("Descending Sorted Order Is: ");
		for(int i=0;i<input.length;i++)
			System.out.print(" "+input[i]);
		
	}
}
