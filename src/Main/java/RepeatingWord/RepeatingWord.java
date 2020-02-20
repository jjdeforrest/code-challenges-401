package RepeatingWord;

import java.util.HashSet;

public class RepeatingWord {

    public static String repeatingWord(String input){
        HashSet hashSet = new HashSet();
        int joker = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' ' || input.charAt(i) == '!' || input.charAt(i) == '.'){
                String bane = input.substring(joker, i);
                if(hashSet.contains(bane)){
                    return bane;
                } else {
                    hashSet.add(bane.toLowerCase());
                    joker = i + 1;
                }
            }
        }
        return null;
    }
}


