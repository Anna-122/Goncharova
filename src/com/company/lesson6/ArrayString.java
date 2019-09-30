package com.company.lesson6;

public class ArrayString {
    public static void main(String[] args) {
        char sym='a';
        String[][] array = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j]=sym + "" +(j+1);
                System.out.print(array[i][j] + " ");
            }
            sym++;
            System.out.println();
        }

    }
}
