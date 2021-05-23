package com.sample.dogfarm.models;

public class House {
    public int base;
    public int[] arr;
    public int value;

    public House(int base, int[] arr) {
        this.base = base;
        this.arr = arr;
        eval();
    }

    public int eval(){
        this.value=0;
        for(int i=0; i<11; i++) {
            this.value += arr[i]* ValueConstants.values.get(i+base-1);
        }
        return this.value;
    }

    public void print() {
        System.out.print("base=L" + base + ";  ");
        System.out.print("value=" + eval() + ";  ");
        for (int i = 0; i < 11; i++) {
            System.out.print("L" + (i + base) + "=" + arr[i] + "  ");
        }
        System.out.println();
    }
}
