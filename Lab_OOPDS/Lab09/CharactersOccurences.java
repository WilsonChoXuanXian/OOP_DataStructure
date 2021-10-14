package Lab_OOPDS.Lab09;

import java.util.*;

public class CharactersOccurences {
    public static void main (String[] args) {
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            Character key = sentence.charAt(i);

            if (linkedHashMap.get(key) != null){
                // key already exists in map
                int count = linkedHashMap.get(key);
                linkedHashMap.put(key, ++count);
            } else {
                // key not exists in map
                linkedHashMap.put(key, 1);
            }
        }

        System.out.println("Letter occurence in original order");
        // for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
        for (var entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        TreeMap<Character, Integer> treeMap = new TreeMap<>(linkedHashMap);
        System.out.println("Letter occurence in ascending order");
        // for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
        for (var entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
