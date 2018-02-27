package java8;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joiner=new StringJoiner(",","{","}") ;
		
		joiner.add("sanjay").add("kumar").add("raikwar").add("epam");
		
		System.out.println(joiner.toString());

	}

}
