package com.sample.dogfarm.models;

public class Dog {
    String name;
    int level;
    int value;
    int cost;

    public Dog(String name, int level, int value, int cost) {
        this.name = name;
        this.level = level;
        this.value = value;
        this.cost = cost;
    }

    void print() {
        System.out.print("name = " + name + "  ");
        System.out.print("level = " + level + "  ");
        System.out.print("value = " + value + "  ");
        System.out.print("cost = " + cost);
        System.out.println();
    }
}
