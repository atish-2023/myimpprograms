
import java.lang.String;
import java.util.Arrays;
public class factorial{

     public static void main(String []args){
        int num=5 , fact=1;
        
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
           
        }
        System.out.println("factorial is " + fact);
        
   
  }
}
