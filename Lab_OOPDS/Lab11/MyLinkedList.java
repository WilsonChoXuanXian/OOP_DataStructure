package Lab_OOPDS.Lab11;

import java.util.*;

class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
    }
}

public class MyLinkedList<E> {
    private Node<E> head, tail;
    private int size = 0;   // number of elements in the list

    /** Override toString() to return elements in the list */
    public String toString() {
        if (head == null) 
            return "[]";

        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            
            if (current != null)
                result.append(", ");    // Seperate two elements with a comma
            else
                result.append("]");     // Insert the closing ] in the string
        }

        return result.toString();
    }

    /** Add an element to the beginning of the list */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);    // Create a new node for element added
        newNode.next = head;    // Link the new node before the head
        head = newNode;     //Head points to the new node
        size++;     // Increment list size

        if (tail == null)   // The new node is the only node in the list
            tail = head;
    }

    /** Add an element to the end of the list */
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);    // Create a new node for element added

        if (tail == null)
            head = tail = newNode;      // The new node is the only node in the list
        else {
            tail.next = newNode;        // Link the new node with the last node in the list
            tail = newNode;             // tail now points to the last node
        }

        size++;     // Increment the size
    }

    /** Add a new element at the specified index */
    public void add(int index, E e) {
        if (index == 0)
            addFirst(e);
        else if (index >= size)
            addLast(e);
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++)
                current = current.next;

            Node<E> newNode = new Node<>(e);
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public E getFirst() {
        if (size == 0)
            return null;
        else
            return head.element;
    }

    public E getLast() {
        if (size == 0)
                return null;
        else
            return tail.element;
    }

    public E get(int index) {
        if (index < 0 || index > size - 1)
            return null;
        
        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        
        return current.element;
    }

    public E removeFirst() {
        if (size == 0)
            return null;
        else {
            E temp = head.element;
            head = head.next;
            size--;
            if (head == null)
                tail = null;
            return temp;
        }
    }

    public E removeLast() {
        if (size == 0)
            return null;
        else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++)
                current = current.next;
            E temp = tail.element;
            tail = current;
            current.next = null;
            size--;
            return temp;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {
            Node<E> previous = head;

            for (int i = 0; i < index - 1; i++)
                previous = previous.next;
            
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;

            return current.element;
        }
    }

    public void clear() {
        size = 0;
        head = tail = null;
    }

    public boolean contains(Object o) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(o))
                return true;
            current = current.next;
        }

        return false;
    }

    public int indexOf(Object o) {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(o))
                return i;
            current = current.next;
        }

        return -1;
    }

    public E set(int index, E e) {
        if (index < 0 || index > size - 1)
            return null;

        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;

        E temp = current.element;
        current.element = e;

        return temp;
    }

    public boolean remove(Object e) {
        if (indexOf((E)e) >= 0) {
            remove(indexOf((E)e));
            return true;
        }
        else
            return false;
    }
}

class TestMyArrayList {
    public static void main(String args[]) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int choice, index, number;
        
        do {
            System.out.println("\n MyLinkedList: " + list);
            System.out.println(" 1 - Add random integer as first");
            System.out.println(" 2 - Add random integer as last");
            System.out.println(" 3 - Add random integer at specified index");
            System.out.println(" 4 - Get first integer");
            System.out.println(" 5 - Get last integer");
            System.out.println(" 6 - Remove first integer");
            System.out.println(" 7 - Remove last integer");
            System.out.println(" 8 - Remove integer at specified index");
            System.out.println(" 9 - Clear list");
            System.out.println("10 - Contain specified integer?");
            System.out.println("11 - Index of specified integer");
            System.out.println("12 - Get integer at specified index");
            System.out.println("13 - Set new random integer at specified index");
            System.out.println("14 - Remove specified integer");
            System.out.println(" 0 - Exit");
            System.out.print("Command > ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    list.addFirst(r.nextInt(100));
                    break;
                case 2:
                    index = input.nextInt();
                    list.add(index, r.nextInt(100));
                    break;
                case 3:
                    index = input.nextInt();
                    System.out.println(list.get(index));
                    break;
                case 4:
                    number = input.nextInt();
                    System.out.println(list.indexOf(number));
                    break;
                case 5:
                    index = input.nextInt();
                    list.remove(index);
                    break;
                case 6:
                    number = input.nextInt();
                    list.remove(Integer.valueOf(number));
                    break;
                case 7:
                    list.clear();
                case 8:
                    number = input.nextInt();
                    System.out.println(list.contains(number));
                    break;
                case 9:
                    index = input.nextInt();
                    list.set(index, r.nextInt(100));
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
            }
        } while (choice != 0);
    }
}