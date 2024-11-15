package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllTerminalOperations {

	public static void main(String[] args) 
	{
		//Creating The Collection Of Elements
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//foreach()----> printing the each number
		System.out.println("Numbers Printing the Usig foreach ()");
		numbers.stream().forEach(n->System.out.println(n+" "));
		System.out.println();
		
		//Integer
		Integer[] array = numbers.parallelStream().toArray(Integer[]::new);
		System.out.println("Array "+Arrays.toString(array));
		
		
		//System.out.println()
		int sum1 = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of numbers "+sum1); 
		
		
		// collect----> collect the 
		List<Integer>uniquenumbers = numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		// 
		//Optional<Integer> min1 = numbers.stream().min(Integer::compareTo);
	
	}

}
