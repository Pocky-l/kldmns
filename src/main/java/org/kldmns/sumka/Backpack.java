package org.kldmns.sumka;

import java.util.ArrayList;
import java.util.List;
class Backpack {
    private int capacity;
    private List<Item> items;
    public Backpack(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        if (item.getWeight() <= capacity) {
            items.add(item);
            capacity -= item.getWeight();
            System.out.println(item.getName() + " добавлен в рюкзак");
        } else {
            System.out.println(item.getName() + " не помещается в рюкзак");
        }
    }
    public int getCurrentWeight() {
        int currentWeight = 0;
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    public int getCurrentValue() {
        int currentValue = 0;
        for (Item item : items) {
            currentValue += item.getValue();
        }
        return currentValue;
    }
}