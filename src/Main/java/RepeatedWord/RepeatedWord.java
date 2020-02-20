package RepeatedWord;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {

    public static void repeatedword(String[] words) {
        Map<String,String> wordMap = new HashMap<String,String>();
        Map<String,String> printedMap = new HashMap<String,String>();

        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase();
            if(wordMap.get(word)!=null) {
                if(printedMap.get(word)==null) {
                    printedMap.put(word, word);
                }
            }else {
                wordMap.put(word, word);
            }
        }
    }
}
