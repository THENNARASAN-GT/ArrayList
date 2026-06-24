import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx{
    public static void main(String[]gt){
        ArrayList<String> bs=new ArrayList<>();
        bs.add("Encyclopedia");
        bs.add("Dictionary");
        bs.add("Atlas");
        bs.add("Thesaurus");
        //Collections.sort(bs);
         bs.set(1,"Eat that frog");
         bs.get(3);
         bs.remove(2);

         System.out.println(bs.get(3));
         
         System.out.println(bs);

    }
    
}
