package Lab_OOPDS.Lab08;

import java.util.*;

public class E1 {
    public static void main (String[] args) {
        List<Integer> list = createRandomList();

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nRandom list : " + list);
            System.out.println("-----Enter your choice-----");
            System.out.println("1. New random list");
            System.out.println("2. Sort list");
            System.out.println("3. Reverse list");
            System.out.println("4. Shuffle list");
            System.out.println("0. Exit");
            System.out.print("> ");
            choice = input.nextInt();
            switch (choice){
                case 1: list = createRandomList();
                        break;
                case 2: Collections.sort(list);
                        break;
                case 3: Collections.reverse(list);
                        break;
                case 4: Collections.shuffle(list);
            }
        } while (choice != 0);
    }

    static List<Integer> createRandomList() {
        List<Integer> list = new LinkedList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++)
            list.add(r.nextInt(100));
        return list;
    }
}
