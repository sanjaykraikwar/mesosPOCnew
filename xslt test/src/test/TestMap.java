package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {

	private static List<String> header = Arrays.asList("h1", "h2", "h3");

	public static void main(String[] args) {
		

	
	
	String data[][]= {{"A1","B1","C1"},{"A2","B2","C2"}};
	
	Map<String,String> myMap= new HashMap<String,String>();


	 Stream<String[]> temp = Arrays.stream(data);
	 
	 Stream<String> stream = temp.flatMap(x -> Arrays.stream(x));
	
	

	 List<String> names = new ArrayList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
			
		// Getting Spliterator
		Spliterator<String> namesSpliterator = names.spliterator();
			
		// Traversing elements
		namesSpliterator.tryAdvance(System.out::println);
		
		
		int sum=Arrays.asList(10,20,26,30).stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		
		System.out.println(sum);
	 
	}

	private static Map<String, String> getDataMap(String[] row, int index) {
		Map<String, String> dataMap = new HashMap<>();
		Stream.of(row).parallel().forEach(element -> {
			dataMap.put("key?", element);
		});
		return dataMap;
	}

}
