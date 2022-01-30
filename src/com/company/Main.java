package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,1,3,5,7,9,11,13,15,17,18};
        int sum = 0;
        int count = array.length;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        System.out.println("Arithmetic mean of numbers: " + sum/count);
    }
}
