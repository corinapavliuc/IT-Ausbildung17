package com.be110723.summary1.arrays;

public class IntArrayDemo {
    public static void main(String[] args) {
      //  int[] ints = new int[10];
        int[] ints = {1,2,3,4,-5,6,-70,8,9,10};

        int min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
        }

        System.out.println("Min = " + min);

    }
}
