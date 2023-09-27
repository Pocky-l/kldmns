package org.kldmns;

import java.util.Scanner;

/**
 * Маленький Петя очень любит подарки. Недавно мама подарила ему новый ноутбук на Новый Год. Он тут же решил передарить его кому-то еще, ведь что может быть приятнее, чем дарить кому-то подарок. По этому случаю он организовал новогоднюю вечеринку у себя дома и пригласил туда n своих друзей.
 *
 * Больше чем самому дарить подарки Петя любит только смотреть, как другие дарят подарки кому-либо. Так что ноутбук он припрятал до следующего Нового Года, а сам решил понаблюдать за процессом обмена подарками между своими друзьями, оставаясь в стороне. Он пронумеровал всех своих друзей целыми числами от 1 до n. Петя запомнил, что друг с номером i подарил подарок другу с номером pi. Он также запомнил, что каждому из его друзей достался ровно один подарок.
 *
 * Теперь для каждого друга i Петя хочет узнать номер друга, который подарил ему подарок.
 *
 * Входные данные
 * В первой строке записано одно целое число n (1 ≤ n ≤ 100) — количество приглашенных на вечеринку друзей Пети. Во второй строке записаны n целых чисел через пробел: i-ое число задает pi — номер друга, которому подарил подарок друг с номером i. Гарантируется, что каждый друг получил ровно один подарок. Возможно, что некоторые друзья не разделяют мнения Пети о приятности дарения подарков другим, а поэтому подарили подарок сами себе.
 *
 * Выходные данные
 * Выведите n целых чисел, разделенных пробелом: i-ое число должно быть равно номеру друга, от которого получил подарок друг с номером i.
 */
public class DПодарки {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] giftGivers = new int[n];

        for (int i = 0; i < n; i++) {
            int receiver = scanner.nextInt();
            giftGivers[receiver - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(giftGivers[i] + " ");
        }
    }
}
