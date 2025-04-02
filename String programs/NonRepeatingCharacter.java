
import java.lang.String;
import java.util.Arrays;
public class HelloWorld{

     public static void NonRepeatingCharacter(String []args){
        String a = "ssilseent";
        
        System.out.println("non repeating characters ");
        for(char c : a.toCharArray())
        {
            if(a.indexOf(c) == a.lastIndexOf(c))
            {
                System.out.println(c);
            }
        }
     }
}
