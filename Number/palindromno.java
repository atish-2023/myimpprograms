/* Online Java Compiler and Editor */
import java.lang.String;
import java.util.Arrays;
public class palindromno{

     public static void main(String []args){
        int num=121;
        int rev=0,temp=num;
        
        while(temp >0)
        {
            int rem = temp%10;
            rev = rev *10 + rem ;
            temp = temp/10;
        }
        System.out.println("reverse no : " +rev);
        
        if(rev == num)
        {
            System.out.println("palindrome no");
        }
        else{
            System.out.println("not palindrom no");
        }
        
     
     
     
  }
}
