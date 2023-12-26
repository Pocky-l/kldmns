package org.kldmns.sumka;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Книга", 4, 6 );
        Item item2 = new Item("Лаптоп", 3, 8);
        Item item3 = new Item("Журнал",5, 3);

        Backpack backpack = new Backpack(11);

        backpack.addItem(item1);
        backpack.addItem(item2);
        backpack.addItem(item3);

        System.out.println("Текущий вес рюкзака: " + backpack.getCurrentWeight());
        System.out.println("Текущая стоимость рюкзака: " + backpack.getCurrentValue());
    }
}
