package Lab_OOPDS.Lab01;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab01_q3 {
    public static void main (String[] args){
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("Enter a word (0 to end): ");
        do{
            word = input.next();
            if (word.equals("0"))
                break;
            words.add(word);
        } while (!word.equals("0"));

        removeDuplicate(words);

        System.out.println("The distinct words: " + words);
    }

    public static void removeDuplicate(ArrayList<String> list){
        ArrayList<String> tempList = new ArrayList<>();
        String index;
        for(int i=0; i<list.size();i++){
            index = list.get(i);
            if(!tempList.contains(index))
                tempList.add(index);
        }

        list.clear();
        
        for(int i=0; i<tempList.size(); i++){
            index = tempList.get(i);
            list.add(index);
        }
    }
}

/*------------------------Below are the tutor's answer----------------------------

public class Lab01_q3 {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("Enter words (0 to finish): ");
        while(true){
            word = input.next();
            if(word.equals("0"))
                break;
            else
                list.add(word);
        }

        removeDuplicate(list);

        System.out.println("The distinct words: " + list);
    }

    public static void removeDuplicate(ArrayList<String> list){
        ArrayList<String> temp = new ArrayList<>();

        for(String word : list)
            if(!temp.contains(word))
                temp.add(word);

        list.clear();
        
        for(String word : temp)
            list.add(word);
    }
}
*/