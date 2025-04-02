
import java.lang.String;
import java.util.Arrays;
public class Primeno{

     public static void main(String []args){
        int num=76;
       boolean isprime = false;
        
     if(num >1 )
     {
         isprime = true;
         for(int i=2;i<num;i++)
         {
             if(num%i==0)
             {
                 isprime =false;
                 break;
             }
         }
     }
     
     if(isprime)
     {
         System.out.println(num + "prime");
     }
     else{
         System.out.println(num + " not prime");
     }
  }
}
