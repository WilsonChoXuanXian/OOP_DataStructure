package Lab_OOPDS.Lab13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GenericStackCompostion<E> {
    // data field
    private ArrayList<E> list = new ArrayList<>();
    
    // add new element to the top/end of stack
    public void push (E e) {
        list.add(e);
    }

    public String toString() {
        return list.toString();
    }

    // return the top element
    public E peek() {
        if (list.isEmpty())
            return null;
        else
            return list.get (list.size()-1); // last element in list
    }

    // return and remove top element
    public E pop() {
        if (list.isEmpty())
            return null;
        else
            return list.remove (list.size()-1);
    }

    public void clear() {
        list.clear();
    }
}

class TestGenericStackCompostion {
    public static void main (String[] args) {
        GenericStackCompostion<Integer> stack = new GenericStackCompostion<>();
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int user_choice;
        do {
            System.out.println ("\nStack: " + stack);
            System.out.println ("1 - Push a random integer (0-100) into stack ");
            System.out.println ("2 - Peek stack ");
            System.out.println ("3 - Pop stack ");
            System.out.println ("4 - Clear stack ");
            System.out.println ("0 - Exit ");
            System.out.print   ("Command > ");
            user_choice = input.nextInt();

            switch (user_choice) {
                case 1: stack.push (r.nextInt(100));
                        break;
                case 2: System.out.println (stack.peek());
                        break;
                case 3: System.out.println (stack.pop());
                        break;
                case 4: stack.clear();
                        break;                
            }

        } while (user_choice != 0);
    }
}


