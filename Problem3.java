/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg3;

import java.util.Scanner;

/**
 *
 * @author huawei
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
     public static int arraySum(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }
        return values[index] + arraySum(values, index + 1);
    }

    public static int findMaximum(int[] values, int index) {
        if (index == values.length - 1) {
            return values[index];
        }
        int maxOfRemaining = findMaximum(values, index + 1);
        if (values[index] > maxOfRemaining) {
            return values[index];
        } else {
            return maxOfRemaining;
        }
    }

    public static int countEven(int[] values, int index) {
        if (index == values.length) {
            return 0;
        }
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            return countEven(values, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = {12, 7, 4, 19, 6, 10};

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Please enter at least one element.");
            input.close();
            return;
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            values[i] = input.nextInt();
        }

        System.out.println("\nArray Sum: " +
                arraySum(values, 0));

        System.out.println("Largest Element: " +
                findMaximum(values, 0));

        System.out.println("Number of Even Elements: " +
                countEven(values, 0));
    }
}
