package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int [] numbers;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);

        numbers = new int[size];
        int i = 0;
        while (i< numbers.length){
            System.out.println("Enter element" + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
            i ++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + "\t");
        }

        int max = numbers[0];
        int index = 1;
        for (int j = 0; j < numbers.length; j++) {
            if (max < numbers[index]){
                max = numbers[j];
                index = j + 1;
            };
        }

        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
