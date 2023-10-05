package org.kldmns.second;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем имена гостя и хозяина
        String guestName = scanner.nextLine();
        String hostName = scanner.nextLine();

        // Считываем буквы в кучке
        String letters = scanner.nextLine();

        // Создаем мапы для хранения количества букв в именах
        Map<Character, Integer> guestMap = new HashMap<>();
        Map<Character, Integer> hostMap = new HashMap<>();

        // Заполняем мапы для имен гостя и хозяина
        for (char c : guestName.toCharArray()) {
            guestMap.put(c, guestMap.getOrDefault(c, 0) + 1);
        }

        for (char c : hostName.toCharArray()) {
            hostMap.put(c, hostMap.getOrDefault(c, 0) + 1);
        }

        // Проверяем, можно ли из букв в кучке составить имена
        boolean canArrangeNames = true;

        for (char c : letters.toCharArray()) {
            if (guestMap.containsKey(c)) {
                guestMap.put(c, guestMap.get(c) - 1);
                if (guestMap.get(c) == 0) {
                    guestMap.remove(c);
                }
            } else if (hostMap.containsKey(c)) {
                hostMap.put(c, hostMap.get(c) - 1);
                if (hostMap.get(c) == 0) {
                    hostMap.remove(c);
                }
            } else {
                // Если буква не принадлежит ни гостю, ни хозяину, то нельзя составить имена
                canArrangeNames = false;
                break;
            }
        }

        // Проверяем, что в мапах не остались лишние буквы
        if (!guestMap.isEmpty() || !hostMap.isEmpty()) {
            canArrangeNames = false;
        }

        // Выводим результат
        if (canArrangeNames) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
