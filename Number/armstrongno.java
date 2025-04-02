
import java.lang.String;
import java.util.Arrays;
public class HelloWorld{

     public static void armstrongno(String []args){
        int num=163;
        int sum=0,temp=num;
        
        while(temp >0)
        {
            int rem = temp%10;
            sum = sum + rem *rem * rem;
            temp = temp/10;
        }
        System.out.println("sum of cube : " + sum);
        
        if(sum == num)
        {
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }
        
     
     
     
  }
}
