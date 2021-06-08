package com.sample.dogfarm.models;

import java.util.ArrayList;

public class House {
    public int base;
    public int[] arr;
    public int value;
    public int equiv;

    public House(int base, int[] arr) {
        this.base = base;
        this.arr = arr;
        eval();
    }

    public int eval() {
        this.value = 0;
        int ct = 1;
        this.equiv = 0;
        for (int i = 0; i < 11; i++) {
            this.equiv += ct * arr[i];
            ct *= 2;
            this.value += arr[i] * ValueConstants.values.get(i + base - 1);
        }
        return this.value;
    }

    public void print() {
        System.out.print("base=L" + base + ";  ");
        System.out.print("value=" + eval() + ";  ");
        System.out.printf("count=%d  %s \t", equiv, Integer.toBinaryString(equiv));
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0)
                System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
