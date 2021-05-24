package com.sample.dogfarm;

import com.sample.dogfarm.models.House;
import com.sample.dogfarm.models.ValueConstants;

public class App {

    static void evolve(House house) {
        for (int i = 0; i < 12; i++) {
            if (house.arr[i] < 2) {
                continue;
            }
            house.arr[i] -= 2;
            house.arr[i + 1] += 1;
            house.arr[0] += 1;
            break;
        }
        house.eval();
    }

    static void run(House house) {
        int steps = 0;
        int cost = ValueConstants.costs.get(house.base - 1);
        int original = house.value;
        house.print();

        while (house.value <= original) {
            steps += 1;
            evolve(house);
            System.out.printf("step %3d,\t", steps);
            System.out.printf("diff=%7d\t", (house.value - original));
            house.print();
        }

        System.out.println();
        System.out.printf("needed: %d steps \t cost: %,d \t value increased by %d", steps, steps * cost,
                (house.value - original));
        System.out.println();
    }

    static void run(House house, int n) {
        int steps = 0;
        int original = house.value;
        house.print();

        while (steps < n) {
            steps += 1;
            evolve(house);
            System.out.printf("step %3d,\t", steps);
            System.out.printf("diff=%7d\t", house.value - original);
            house.print();
        }

        System.out.println();
        System.out.println("after " + steps + " steps, value increased by " + (house.value - original));
    }

    public static void main(String[] args) {

        int cost = 17054;
        int data[] = {2, 0, 0, 2, 0, 3, 0, 2, 2, 0, 1};
        House myKennel = new House(17, data);
        myKennel.print();
        System.out.println();

        for (int i = 0; i < 30; i++) {
            System.out.println("i=" + i);
            run(myKennel);
            System.out.println();
        }

//        int data2[] = {1, 1, 1, 1, 1, 1, 2, 0, 2, 1, 1, 0};
        House myKennel2 = new House(17, data);
        int orig = myKennel2.value;
        run(myKennel2, 300);
        System.out.println();

    }
}
