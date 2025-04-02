
import java.lang.String;
public class DuplicateCharacters{

     public static void main(String []args){
        String str = "madam";
        int count = 0;
        char[] a = str.toCharArray();
        
        System.out.println("duplicate characters ");
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println(a[i] );
                   
                    count++;
                    
                    break;
                     
                }
                
            }
        }
        
     }
}
