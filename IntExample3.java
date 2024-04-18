package com.pg;
public class IntExample3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
                for (int i = 20; i <= 25; i++) {
                    System.out.print(i + " ");
                }
                for (int i = 10; i <= 80; i += 10) {
                    System.out.print(i + " ");
                }    for (int i = 0; i >= -10; i--) {
                    System.out.print(i + " ");
                }
                for (int i = 1; i <= 10; i++) {
                    int square = i * i;
                    System.out.print(square + " ");
                }
                for (int i = 1; i <= 8; i++) {
                    if (i % 3 == 0) {
                        System.out.print("? ");
                    } else {
                        System.out.print(i + " ");
                    }
                } 
        System.out.println();
    }
}
