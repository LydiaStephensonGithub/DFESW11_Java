package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		names.stream().forEach(x -> System.out.println("Hello " + x));
		
		List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12);
		int reduce = numbers.stream().reduce((a,b) -> a*b).get();
		System.out.println(reduce);
		
		int min = numbers.stream().reduce((a,b) -> Integer.min(a, b)).get();
		System.out.println(min);
		
		int max = numbers.stream().reduce((a,b) -> Integer.max(a, b)).get();
		System.out.println(max);
		
		List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		even.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		List<Integer> odd = numbers.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
		odd.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		int sum = numbers.stream().reduce((a,b) -> a+b).get();
		System.out.println(sum);
		
		int oddSquare = numbers.stream().map(x -> x*x).filter(x -> x % 2 == 1).reduce((a,b) -> Integer.min(a, b)).get();
		System.out.println(oddSquare);
	}
}
