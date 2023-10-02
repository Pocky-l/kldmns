package org.kldmns.first;

import java.util.Scanner;

/**
 * Есть такая игра под названием «I Wanna Be the Guy», в ней n уровней. Little X и его друг Little Y подсели на эту игру. Каждый из них хочет пройти игру полностью.
 *
 * Little X может пройти только p уровней этой игры. А Little Y может пройти только q уровней этой игры. Вам даны номера уровней, которые может пройти Little X, и номера уровней, которые может пройти Little Y. Могут ли Little X и Little Y пройти игру полностью, если объединят свои усилия?
 *
 * Входные данные
 * В первой строке записано единственное целое число n (1 ≤  n ≤ 100).
 *
 * В следующей строке сначала записано целое число p (0 ≤ p ≤ n), затем следуют p различных целых чисел a1, a2, ..., ap (1 ≤ ai ≤ n). Эти числа обозначают номера уровней, которые может пройти Little X. В следующей строке содержатся номера уровней, которые может пройти Little Y, в аналогичном формате. Предполагается, что уровни пронумерованы от 1 до n.
 *
 * Выходные данные
 * Если друзья могут пройти все уровни вместе, выведите «I become the guy.». Если это невозможно, выведите «Oh, my keyboard!» (без кавычек).
 */
public class JIWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean[] levels = new boolean[n];

        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            int level = scanner.nextInt();
            levels[level - 1] = true;
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int level = scanner.nextInt();
            levels[level - 1] = true;
        }

        boolean canPassAllLevels = true;
        for (boolean level : levels) {
            if (!level) {
                canPassAllLevels = false;
                break;
            }
        }

        if (canPassAllLevels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
