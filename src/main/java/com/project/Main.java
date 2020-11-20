package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter array dimension:");
            int size = scanner.nextInt();
            List<Integer> array = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array.add(random.nextInt(1000));
            }
            System.out.println("Original array:");
            for (int elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println("\nEnter sorting type:\n" +
                    "1 - increasing by value\n" +
                    "2 - decreasing by value\n" +
                    "3 - increasing by length\n" +
                    "4 - decreasing by length.");
            int sortingType = scanner.nextInt();
            Sort sort = new Sort(sortingType, array);
            sort.join();
            sort.start();
            System.out.println("Sorted array:");
            for (int elem : array) {
                System.out.print(elem + " ");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
