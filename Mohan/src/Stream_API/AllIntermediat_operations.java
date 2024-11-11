package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class AllIntermediat_operations {

	public static void main(String[] args) {
		// Intial list of numbers
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		// 1.Map()---> Multiple each number by 2
		List<Integer>doubled = numbers.stream()
				.map(n->n*2)
				.collect(Collectors.toList());
		System.out.println("Doubled "+ doubled);
		
		
		//2. filter()---> keeping the even numbers
		List<Integer> evens=numbers.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println("Even :" +evens);
		
		
		//3. distent()---> printing the unique numbers
		List<Integer> uniqueNumbers = numbers.stream()
	            .distinct() 
	            .collect(Collectors.toList());
	    System.out.println("Unique Numbers: " + uniqueNumbers);
	    
	    List<Integer> SortedNumbers = numbers.stream()
	          .sorted() 
	          .collect(Collectors.toList());
	    System.out.println("Sorted  Numbers: " +SortedNumbers);
	    
	    
	    
	    List<Integer> limitedNumbers = numbers.stream()
	            .limit(5) // Limits the result to the first 5 elements
	            .collect(Collectors.toList());
	    System.out.println("Limited Numbers: " + limitedNumbers);

			
	    
	    
	    List<Integer> skippedNumbers = numbers.stream()
	            .skip(3) 
	            .collect(Collectors.toList());
	System.out.println("Skipped First 3 Numbers: " + skippedNumbers);

	}

}
