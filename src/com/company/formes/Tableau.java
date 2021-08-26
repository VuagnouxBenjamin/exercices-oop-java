package com.company.formes;

public class Tableau {
    public static void main(String[] args) {
        Formes[] tableau = {
                new Triangles(12, 14),
                new Triangles(22, 33),
                new Triangles(23, 77)
        };

        int count = 1;
        for(Formes fo : tableau) {
            System.out.println(count + " --> " + fo.Aire());
            count++;
        }
    }
}
