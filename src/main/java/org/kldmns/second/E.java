package org.kldmns.second;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int edges = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (s.equals("Tetrahedron")) edges += 4;
            else if (s.equals("Cube")) edges += 6;
            else if (s.equals("Octahedron")) edges += 8;
            else if (s.equals("Dodecahedron")) edges += 12;
            else if (s.equals("Icosahedron")) edges += 20;
        }
        System.out.println(edges);

    }
}
