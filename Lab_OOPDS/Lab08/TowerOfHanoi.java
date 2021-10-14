package Lab_OOPDS.Lab08;

import java.util.*;

public class TowerOfHanoi {
    Stack<Integer>[] towers = new Stack[3];
    
    public TowerOfHanoi() {
        for (int i = 0; i < towers.length; i++) {
            towers[i] = new Stack<>();
        }
        // push 4 disks into tower 0.
        for (int i = 4; i > 0; i --) {
            towers[0].push(i);
        }
    }

    private void printTowers() {
        for (int i = 0; i < towers.length; i++) {
            System.out.println("Tower " + i + ": " + towers[i]);
        }
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        int source, dest;
        do {
            printTowers();
            System.out.print("Enter source tower and destination tower (-1 to exit): ");
            source = input.nextInt();
            if(source == -1)
                break;
            dest = input.nextInt();
            towers[dest].push(towers[source].pop());
        } while (source != -1);
    }

    public static void main(String[] args) {
        TowerOfHanoi game = new TowerOfHanoi();
        game.play();
    }
}
