package LambdaExpression;

import java.util.function.*;

public class SPC_Demo { 
	public static void main(String[]args) 
	{
		// 	supplier : no input and it gives an value
		Supplier<String>Supplier =()->"This is Mohan";
		String supplierValue = Supplier.get();
		System.out.println(supplierValue);  
		
		// Pridicatr : Takes onre input and gives boolean Value
		Predicate<Integer> isEven = number ->number%2==0;
		int number = 20;
		if(isEven.test(number))
		{
			System.out.println(number+ " is Even ");
		}
		else
		{
			System.out.println(number+ " is Odd ");
		}
		
		// Consumer : takes input and return Nothing
		Consumer < String> consumer = message->System.out.println("Consumer Resived  " + message);
		consumer.accept("This is test message ");
	}
}