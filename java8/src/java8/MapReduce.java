package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduce {
	
	public static void main(String ar[]) {
		
		
		List<Person> list=new ArrayList();
		list.add(new Person("sanjay",29));
		list.add(new Person("Vikash",32));
		list.add(new Person("sandeep",18));
		list.add(new Person("Vinay",30));
		list.add(new Person("Saurabh",30));
		
		System.out.println(list.stream().filter(a->a.getAge()>20).count());
		
		Consumer<Integer> consumer= System.out::print;
		
		Consumer<Integer> consumer1= i->System.out.print(i);
		
	list.stream().map(q->q.getAge()).filter(a->a>20).forEach(consumer1);
	
	//BinaryOperator<Integer>
	
	//ToIntFunction<? super Integer> mapper = a->;
	
System.out.println(list.stream().map(q->q.getAge()).filter(a->a>20).collect(Collectors.averagingInt(Integer::new)).intValue());
	
System.out.println(list.stream().map(q->q.getAge()).filter(a->a>20).reduce(10,Integer::sum));


System.out.println(list.stream().map(q->q.getAge()).filter(a->a>20).reduce(10,Integer::sum));

Predicate<Person> ps= (Person p) -> p.getAge()<30;

Function<Person,String> mapper= p->p.getName()+"raikwar";

Function<Person,String> mapper1= Person::getName;


//Collector<String,String,String> c= Collectors.joining(",");

String names= list.stream().filter(ps).map(mapper1).collect(Collectors.joining(","));

System.out.println(names);


Predicate<Person> predicate= p->p.getAge()>18;

Consumer<Person>consumerPerson = System.out::println;

list.stream().filter(predicate).forEach(consumerPerson);

Map<Integer,List<Person>> map =list.stream().filter(predicate).collect(Collectors.groupingBy(Person::getAge));

System.out.println(map);



Map<Integer,List<String>> map2 =list.stream().filter(predicate).collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));

System.out.println(map2);

Map<Integer,List<String>> map3 =list.stream().filter(predicate).collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));

System.out.println(map3);


Map<Integer,Long> map1 =list.stream().filter(predicate).collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));

System.out.println(map1);


Comparator<Person> c= (p1,p2)-> p1.getAge().compareTo(p2.getAge()) ;

//Comparator<Person> c= (p1,p2)-> p1.getAge().compareTo(p2.getAge()) ;

Person minage=list.stream().min(Comparator.comparing(Person::getAge)).get();

System.out.println(minage);

Stream<String> stream=Stream.of("one","two","three","four");
	
	Predicate<String> p1 = Predicate.isEqual("two");
	
	Predicate<String> p2 = Predicate.isEqual("three");
	
	//stream.filter(p1.or(p2)).forEach(System.out::print);
	
	BinaryOperator<Integer> bo= Integer::sum;
	
    Integer arrSum = Stream.of(10,20,22,12,14).reduce(1000,bo );
    System.out.println(arrSum);
	
		
	}
}
