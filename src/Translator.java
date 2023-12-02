import java.util.HashMap;

public class Translator {
    HashMap<Integer, String> numericAlpha = new HashMap<>();

    public Translator (String[] alphabetic, Integer[] numeric){
       for (int i=0;i< numeric.length;i++);
       numericAlpha.put (numeric[0], alphabetic[0] );
    }

}