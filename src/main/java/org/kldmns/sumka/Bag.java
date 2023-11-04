package org.kldmns.sumka;

public class Bag {
    public int items;
    private int[] weight;
    private int[] price;
    private int bagWeight;

    public Bag(int items, int[] weight, int[] price, int bagWeight) {
        this.items = items;
        this.weight = weight;
        this.price = price;
        this.bagWeight = bagWeight;
    }

    public int knapsackDP() {
        if (items <= 0 || bagWeight <= 0) {
            return 0;
        }

        int[][] m = new int[items + 1][bagWeight + 1];
        for (int j = 0; j <= bagWeight; j++) {
            m[0][j] = 0;
        }

        for (int i = 1; i <= items; i++) {
            for (int j = 1; j <= bagWeight; j++) {
                if (weight[i - 1] > j) {
                    m[i][j] = m[i - 1][j];
                } else {
                    m[i][j] = Math.max(
                            m[i - 1][j],
                            m[i - 1][j - weight[i - 1]] + price[i - 1]);
                }
            }
        }
        return m[items][bagWeight];

    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int[] getWeight() {
        return weight;
    }

    public void setWeight(int[] weight) {
        this.weight = weight;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public int getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(int bagWeight) {
        this.bagWeight = bagWeight;
    }
}
