package exercises.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZeroesTOEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] array1 = {1,0,3,0,7,0,8};
//		int temp=0;
//		for(int i=0;i<array1.length;i++){
//			for(int j=0;j<array1.length-1;j++){
//				if(array1[j]==0){
//					temp=array1[j];
//					array1[j]=array1[j+1];
//					array1[j+1]=temp;
//				}
//			}
//		}
//		for(int i : array1){
//			System.out.println(i);
//		}


		//Using Streams
		int[] array2 = {1,0,3,0,7,0,8};
		List<Integer> list = Arrays.asList(1,0,3,0,7,0,8);
		List<Integer> result = list.stream().filter(x->x!=0).collect(Collectors.toList());
		result.stream().forEach(System.out::println);

		while(result.size()<array2.length){
			result.add(0);
		}

		result.stream().forEach(System.out::println);

	}
}
