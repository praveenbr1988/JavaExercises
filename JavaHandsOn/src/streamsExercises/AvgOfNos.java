package streamsExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

public class AvgOfNos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5,23,-24,50,6,7);		
		
		double avg = list.stream().mapToInt(e->e).average().getAsDouble();		
		System.out.println("avg of nos in the list is:"+avg);
		
		//Sum of nos
		Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
		System.out.println("Sum of nos in the list is:"+sum.get());
		
		//Square, Filter and Average
		//map function is used to transform each value in the stream. Output is again a stream
		//Filter function is used to filter the streams with a Condition.class Output is again a stream
		double output1 = list.stream().map(a->a*a).filter(a->a>100).mapToInt(a->a).average().getAsDouble();
		System.out.println("output1 is:"+output1);
		
		List<Integer> evenNos = list.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println("Even No list is:"+evenNos);
		
		List<Integer> oddNos = list.stream().filter(a->a%2!=0).collect(Collectors.toList());
		System.out.println("oddNos list is:"+oddNos);
		
		
		//Number starts with some prefix
		List<Integer> prefixedWith2 = list.stream().map(a->String.valueOf(a)).filter(a->(a.startsWith("2")||a.startsWith("-2"))).map(a->Integer.parseInt(a)).collect(Collectors.toList());
		System.out.println("prefixedWith2 list is:"+prefixedWith2);
		
		
		//Max No
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max No is:"+max);
		
		//Min No
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max No is:"+min);
		
		//Sort in Asc
		List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
		System.out.println("ASC order is:"+asc);
		
		//Sort in Desc
		List<Integer> desc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("DESC order is:"+desc);
		
		//Limit - Select top 5 nos
		int sumOffirst5Nos = list.stream().limit(5).reduce((p,q)->p+q).get();
		System.out.println("sumOffirst5Nos is:"+sumOffirst5Nos);
		
		//Slip - Skip top 5 nos
		int exceptfirst5Nos = list.stream().skip(5).reduce((p,q)->p+q).get();
		System.out.println("exceptfirst5Nos is:"+exceptfirst5Nos);
		
		//SecondHighest element
		int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("secondHighest is:"+secondHighest);
				
	}

}
