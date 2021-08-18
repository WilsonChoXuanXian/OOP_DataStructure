package Lab_OOPDS.Lab01;

import java.util.Scanner;

public class Lab01_q2 {
    public static void main(String[] args){
        System.out.print("Enter array1: ");
        double[] array1 = createArrayFromInput();

        System.out.print("Enter array2: ");
        double[] array2 = createArrayFromInput();

        double[] array3 = merge(array1, array2);

        System.out.print("array1: ");
        print(array1);
        System.out.print("array2: ");
        print(array2);
        System.out.print("array3: ");
        print(array3);
    }

    public static double[] createArrayFromInput(){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] array = new double[size];
        for(int i=0; i<size; i++)
            array[i] = input.nextDouble();
        
        return array;
    }

    public static void print(double[] array){
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static double[] merge(double[] array1, double[] array2){
        int sizeOfArray1 = array1.length;
        int sizeOfArray2 = array2.length;
        int size = sizeOfArray1 + sizeOfArray2;
        double[] array = new double[size];

        for(int i=0; i<size; i++){
            if(i<sizeOfArray1)
                array[i] = array1[i];
            else
                array[i] = array2[i-sizeOfArray1];
        }

        // for(int i=0; i<sizeOfArray1; i++)
        //     array[i] = array1[i];
        // for(int i=0; i<sizeOfArray2; i++)
        //     array[sizeOfArray1++] = array2[i];
        
        return array;
    }
}

/*------------------------Below are the tutor's answer----------------------------

public class Lab01_q2 {
    public static void main(String[] args){
        System.out.print("Enter array1: ");
        double[] array1 = createArrayFromInput();

        System.out.print("Enter array2: ");
        double[] array2 = createArrayFromInput();

        double[] array3 = merge(array1, array2);
        
        System.out.print("array1: ");
        print(array1);
        System.out.print("array2: ");
        print(array2);
        System.out.print("array3: ");
        print(array3);
    }

    public static double[] createArrayFromInput(){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double[] array = new double[size];
        for(int i=0; i<size; i++)
            array[i] = input.nextDouble();
        
        return array;
    }

    public static void print(double[] array){
        for(double value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    public static double[] merge(double[] array1, double[] array2){
        double[] array3 = new double[array1.length + array2.length];

        for(int i=0; i < array1.length; i++)
            array3[i] = array1[i];

        for(int i=0; i < array2.length; i++)
            array3[array1.length + i] = array2[i];
        
        return array3;
    }
}
*/