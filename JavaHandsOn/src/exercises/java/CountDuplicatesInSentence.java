package exercises.java;

import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicatesInSentence {

	public static void main(String[] args) {
		String gnSentence = "This is a test. This test is simple and it is a test.";
		//approach1(gnSentence);
		//approach2(gnSentence);
		approach3(gnSentence);
	}

	public static void approach1(String gnSentence){
		String[] arr = gnSentence.toLowerCase().split(" ");
		List<String> l = Arrays.asList(arr);
		Set<String> s = new HashSet<>(l);
		int duplicateCount = l.size()-s.size();
		System.out.println("Count of Duplicate Words: "+duplicateCount);
	}

	public static void approach2(String gnSentence){
		String[] arr = gnSentence.toLowerCase().split("\\s+");
		HashMap<String,Integer> wordMap = new HashMap<>();

		for(String word:arr){
			word= word.replaceAll("[^a-z0-9]","");
			if (!word.isEmpty())
				wordMap.put(word,wordMap.getOrDefault(word,0)+1);
		}

		System.out.println("Duplicate Words and their count is: ");
		for(Map.Entry<String,Integer> entry : wordMap.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry.getKey() +" : "+entry.getValue());
			}
		}
	}

	public static void approach3(String gnSentence){
		String[] arr = gnSentence.toLowerCase().split("\\s+");
		Map<String,Long> wordMap = Arrays.stream(arr)
										 .map(word->word.toLowerCase().replaceAll("[^a-z0-9]",""))
										 .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		System.out.println("Duplicate words and their counts:");

		wordMap.entrySet().stream()
				.filter(entry->entry.getValue()>1)
				.forEach(entry-> System.out.println(entry.getKey()+" : "+entry.getValue()));


	}

}
