package homework.lecture8;

import java.util.ArrayList;
import java.util.HashSet;

public class WordsArray {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            words.add("Zero");
            words.add("Zero" + i);
        }
        HashSet<String> uniqueWords = new HashSet<>(words);
        System.out.println("There are " + words.size() + " words in the list, but there are only " + uniqueWords.size()  + " unique words!");
    }
}
