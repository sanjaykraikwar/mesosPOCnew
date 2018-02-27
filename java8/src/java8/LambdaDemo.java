package java8;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
	
		FileFilter ff =  (File file) -> file.getName().equals("sanjay");
		
		
		Runnable r= ()->System.out.println("helloworld");
		
		Thread t1=new Thread(r);
		
		t1.start();
		
		
		Comparator<String> compare= (s1,s2)-> s1.compareTo(s2);
		
		List<String> sList=Arrays.asList("sanjay","ajay");
		
		Collections.sort(sList,(s1,s2)-> Integer.compare(s1.length(), s2.length()));
		
		sList.forEach(System.out::println);;
		
		
		sList.add("ABC");
		
		
	}

}


interface FileFilter{
	boolean accept(File file);
}

