/* Online Java Compiler and Editor */
import java.lang.String;
import java.util.Arrays;
public class Anagram{

     public static void main(String []args){
        String a = "silent";
        String b = "liste";
        
        if(a.length() != b.length())
        {
            System.out.println("not anagrams");
            return;
        }
        
        char[] ar1 = a.toCharArray();
        char[] ar2 = b.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("angrams");
        }
        else{
            System.out.println("not anagram");
        }
     }
}
