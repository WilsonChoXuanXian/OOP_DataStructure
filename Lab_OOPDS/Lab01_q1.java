package Lab_OOPDS;

import java.util.Scanner;

public class Lab01_q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();

        int size = phoneNumber.length();
        char[] character = new char[size];
        for(int i=0; i<size; i++){
            character[i] = phoneNumber.charAt(i);
            if(Character.isLetter(character[i]))
                character[i] = (char)getNumber(character[i]);
        }
        for(int i=0; i<size; i++){
            System.out.print(character[i]);
        }
    }

    public static int getNumber(char letter){
        int number = 0;
        letter = Character.toLowerCase(letter);

        if(letter =='a' || letter == 'b'|| letter == 'c')
            number = 50;
        else if(letter =='d' || letter == 'e'|| letter == 'f')
            number = 51;
        else if(letter =='g' || letter == 'h'|| letter == 'i')
            number = 52;
        else if(letter =='j' || letter == 'k'|| letter == 'l')
            number = 53;
        else if(letter =='m' || letter == 'n'|| letter == 'o')
            number = 54;
        else if(letter =='p' || letter == 'q'|| letter == 'r' || letter == 's')
            number = 55;
        else if(letter =='t' || letter == 'u'|| letter == 'v')
            number = 56;
        else if(letter =='w' || letter == 'x'|| letter == 'y' || letter == 'z')
            number = 57;

        return number;
    }
}
