package Lab_OOPDS.Lab10;

import java.util.*;

public class MyArrayList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    public boolean add(E e) {
        add(size(), e);
        return true;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ensureCapacity();

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData; 
        }
    }

    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }

        data[size - 1] = null;  
        size--;
        return e;
    }

    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        }
        else
            return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return i;
            }
        }

        return -1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }

        return result.toString() + "]";
    }

    public void clear() {
        data = (E[]) new Object [INITIAL_CAPACITY];
        size = 0;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;

        return false;
    }

    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }
}

class TestMyArrayList {
    public static void main(String args[]) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int choice, index, number;
        
        do {
            System.out.println("\n MyArrayList: " + list);
            System.out.println("1 - Add random integer");
            System.out.println("2 - Add random integer at specified index");
            System.out.println("3 - Get integer at specified index");
            System.out.println("4 - Get index of specified integer");
            System.out.println("5 - Remove the integer at specified index");
            System.out.println("6 - Remove specified integer");
            System.out.println("7 - Clear list");
            System.out.println("8 - Contain specified integer?");
            System.out.println("9 - Set new random integer at specified index");
            System.out.println("0 - Exit");
            System.out.print("Command > ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    list.add(r.nextInt(100));
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
            }
        } while (choice != 0);
    } 
}