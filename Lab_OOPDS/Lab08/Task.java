package Lab_OOPDS.Lab08;

import java.util.*; 

public class Task implements Comparable<Task> {
    private int priority;
    private String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int compareTo(Task o) {
        return this.priority - o.priority;
    }

    public String toString() {
        return "Task <priority=" + priority + " name=" + name + ">";
    }
}

class TestQueues {
    public static void main (String[] args) {
        PriorityQueue<Task> taskPQ = new PriorityQueue<>(Collections.reverseOrder());
        taskPQ.add(new Task(3, "Eat"));
        taskPQ.add(new Task(8, "Sleep"));
        taskPQ.add(new Task(1, "Study"));
        while (!taskPQ.isEmpty())
            System.out.println ("Removed from Queue<Task>: " + taskPQ.poll());

        Queue<Task> taskQ = new LinkedList<>();
        taskQ.add(new Task(3, "Eat"));
        taskQ.add(new Task(8, "Sleep"));
        taskQ.add(new Task(1, "Study"));
        while (!taskQ.isEmpty())
            System.out.println ("Removed from Queue<Task>: " + taskQ.poll());

        PriorityQueue<Integer> intPQ = new PriorityQueue<>(Collections.reverseOrder());
        intPQ.add (40);
        intPQ.add (60);
        intPQ.add (20);
        while (!intPQ.isEmpty())
            System.out.println ("Removed from PriorityQueue<Integer>: " + intPQ.poll());
    }
}
