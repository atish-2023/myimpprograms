import java.util.lang.String;

public class palindromString{

     public static void main(String []args){
        String a = "madam";
        String b  = "";
        for(int i = a.length()-1;i>=0;i--)
        {
             b += a.charAt(i);
        }
        System.out.println(b);
        
        if(a.equals(b))
        {
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("it is not palindrome");
        }
     }
}
