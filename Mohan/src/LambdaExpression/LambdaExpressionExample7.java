package LambdaExpression;
import java.util.*;  
public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Mohan");  
        list.add("Vicky");  
        list.add("Surya");  
        list.add("Eswar");  
          
        list.forEach(  
            (m)->System.out.println(m)  
        );  
    }  
}  

