package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// Task 1
        int[] rentRoom = new int[3];
        double[] codeRoom = {1.57, 7.654, 9.986};
        char[] descriptionRoom = {'a', 'b', 'c'};

    //Task 2
        System.out.println(" Task 2. Answers.");
          rentRoom[0] = 1;
          rentRoom[1] = 2;
          rentRoom[2] = 3;
        System.out.println("Array 1");
            System.out.print(rentRoom[0] + ", " + rentRoom[1] + ", " + rentRoom[2]);
        System.out.println();
        System.out.println("Array 2");
            System.out.print(codeRoom[0] + ", " + codeRoom[1] + ", " + codeRoom[2]);
        System.out.println();
        System.out.println("Array 3");
            System.out.println(descriptionRoom[0] + ", " + descriptionRoom[1] + ", " +  descriptionRoom[2]);

// Task 3
    System.out.println("__________________");
    System.out.println(" Task 3. Answers.");
              System.out.println("Array 1. Reverse.");
                 System.out.print(rentRoom[2] + ", " + rentRoom[1] + ", " + rentRoom[0]);
        System.out.println();
              System.out.println("Array 2. Reverse.");
                 System.out.print(codeRoom[2] + ", " + codeRoom[1] + ", " + codeRoom[0]);
        System.out.println();
              System.out.println("Array 3. Reverse.");
                 System.out.println(descriptionRoom[2] + ", " + descriptionRoom[1] + ", " +  descriptionRoom[0]);
// Task 4
    System.out.println("__________________");
    System.out.println(" Task 4. Answers.");
        for (int i = 0; i < 3; i++) {
            if ( rentRoom[i] % 2 == 1) {
                rentRoom[i] = rentRoom[i] + 1;
            }
            System.out.print(rentRoom[i] + "  ");

        }

    }
}
