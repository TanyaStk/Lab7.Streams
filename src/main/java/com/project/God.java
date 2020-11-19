package com.project;

import java.util.Scanner;

public class God {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter array dimension:");
            int size = scanner.nextInt();
            System.out.println("Enter sorting type:\n" +
                    "1 - increasing by value\n" +
                    "2 - decreasing by value\n" +
                    "3 - increasing by length\n" +
                    "4 - decreasing by length.");
            int sortingType = scanner.nextInt();
            Main main = new Main(size, sortingType);
            main.start();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
