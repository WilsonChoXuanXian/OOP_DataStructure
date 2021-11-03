package Lab_OOPDS.Lab13;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class GenericQueueComposition<E> {
    // data field
    private LinkedList<E> list = new LinkedList<>();

    // add e to end of queue
    public void enqueue (E e) {
        list.add(e);
    }

    // remove from the beginning of queue
    public E dequeue() {
        if (list.isEmpty())
            return null;
        else
            return list.remove (0);
    }

    public void clear() {
        list.clear();
    }

    public String toString() {
        return list.toString();
    }
}

class TestGenericQueueComposition {
    public static void main (String[] args) {
        GenericQueueComposition<Integer> queue = new GenericQueueComposition<>();
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int user_choice;
        do {
            System.out.println ("\nQueue: " + queue);
            System.out.println ("1 - Enqueue a random integer (0-100) into queue");
            System.out.println ("2 - Dequeue queue");
            System.out.println ("3 - Clear queue");
            System.out.println ("0 - Exit");
            System.out.print   ("Command > ");
            user_choice = input.nextInt();

            switch (user_choice) {
                case 1: queue.enqueue (r.nextInt(100));
                        break;
                case 2: System.out.println (queue.dequeue());
                        break;
                case 3: queue.clear();
                        break;
            }
        } while (user_choice != 0);
    }
}

