package lesson3.Svitlana.Task1;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.HashMap;
import java.util.Map;

public class Vocabulary {
    String sentence1;

    public static HashMap<Character, Integer> countOfLetters(String sentence1) {
        char[] arrletters = sentence1.toCharArray();
        HashMap<Character, Integer> lettersMap = new HashMap<>();

        for (char c : arrletters) {
            if (lettersMap.containsKey(c)) {
                lettersMap.put(c, lettersMap.get(c) + 1);
            } else lettersMap.put(c, 1);
              }
        return lettersMap;
    }
        public static void main (String[]args){
            String sentence1 = "Hello word";
            HashMap<Character, Integer> letters = countOfLetters(sentence1);
            System.out.println(letters);
            for (Map.Entry<Character, Integer> entry : letters.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

        }
    }
