
import java.lang.String;
import java.util.Arrays;
public class convertCase{

     public static void main(String []args){
        String a = "sseet";
        
       StringBuilder result = new StringBuilder();
       
       for(char c: a.toCharArray())
       {
           if(c >= 65 && c<=90)
           {
               result.append( (char) (c + 32));
           }
           else if(c >= 97 && c<= 122){
               result.append( (char) (c - 32));
           }
           else{
               System.out.println("invalid");
           }
       }
       
       System.out.println("converted result : " + result);
     }
}
