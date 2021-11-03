package Lab_OOPDS.Lab13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GenericStackInheritance<E> extends ArrayList<E> {

    public void push (E e) {
        add (e); // ArrayList.add(e), super.add(e);
    }

    // no need to implement toString(), just use superclass' one.
    //public String toString() {
    //    return super.toString();
    //}

    public E peek() {
        if (isEmpty())
            return null;
        else
            return get (size()-1);
    }

    public E pop() {
        if (isEmpty())
            return null;
        else
            return remove (size()-1);
    }
}

class TestGenericStackInheritance {
    public static void main (String[] args) {
        GenericStackInheritance<Integer> stack = new GenericStackInheritance<>();
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


