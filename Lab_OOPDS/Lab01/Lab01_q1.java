package Lab_OOPDS;

import java.util.Scanner;

public class Lab01_q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = input.next();

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

/*------------------------Below are the tutor's answer----------------------------

public class Lab01_q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = input.next();

        String output = "";
        for(int i=0; i < phoneNumber.length(); i++){
            char ch = phoneNumber.charAt(i);
            if(Character.isLetter(ch))
                output += getNumber(ch);
            else
                output += ch;
        }
        System.out.print(output);
    }

    public static int getNumber(char letter){
        int num = 0;
        letter = Character.toLowerCase(letter);
        switch(letter){
            case 'a':
            case 'b':
            case 'c': num = 2; break;
            case 'd':
            case 'e':
            case 'f': num = 3; break;
            case 'g':
            case 'h':
            case 'i': num = 4; break;
            case 'j':
            case 'k':
            case 'l': num = 5; break;
            case 'm':
            case 'n':
            case 'o': num = 6; break;
            case 'p':
            case 'q':
            case 'r':
            case 's': num = 7; break;
            case 't':
            case 'u':
            case 'v': num = 8; break;
            case 'w':
            case 'x':
            case 'y':
            case 'z': num = 9; break;
        }
        return num;
    }
}
*/