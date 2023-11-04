package org.kldmns.sumka;

public class Sumka {

    public static void main(String[] args) {
        Bag bag = new Bag(5, new int[]{6, 4, 3, 2, 5}, new int[]{5, 3, 1, 3, 6}, 15);
        System.out.println(bag.knapsackDP());

    }
}
