package LambdaExpression;
	interface Inter1
	{  
	    public String say(String name);  
	}  
	public class LambdaExpressionExample4
	{  
	    public static void main(String[] args) 
	    {  
	        // Lambda expression with single parameter.  
	    	Inter1 s1=(name)->{  
	            return "Hello, "+name+ ".........!";  
	        };  
	        System.out.println(s1.say("Mohan"));    
	        // You can omit function parentheses    
	        Inter1 s2= name ->{  
	            return "This Is "+name;  
	        };  
	        System.out.println(s2.say("Madhu"));  
	    }  
	}  

