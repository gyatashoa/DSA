import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

//    Given two strings ransomNote and magazine, return true if ransomNote can be
//    constructed by using the letters from magazine and false otherwise.
//    Each letter in magazine can only be used once in ransomNote.

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> letters = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char x = magazine.charAt(i);
            if(letters.containsKey(x)){
                letters.put(x,letters.get(x)+1);
                continue;
            }
            letters.put(x,1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char x = ransomNote.charAt(i);
            if(!letters.containsKey(x)|| letters.get(x) == 0)return false;
            letters.put(x,letters.get(x) - 1);
        }
        return true;
    }
}
