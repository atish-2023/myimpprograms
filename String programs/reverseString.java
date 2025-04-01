import java.lang.String;
public class reverseString{

     public static void main(String []args){
        String a = "Atish";
        String b  = "";
        for(int i = a.length()-1;i>=0;i--)
        {
             b += a.charAt(i);
        }
        System.out.println(b);
     }
}
