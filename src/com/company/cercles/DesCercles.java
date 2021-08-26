package com.company.cercles;

import com.company.cercles.Cercles;

public class DesCercles {
    public static void main(String[] args) {
        Cercles cercle1 = new Cercles(10);
        Cercles cercle2 = new Cercles(45);

        System.out.println();
        System.out.println("CERCLE 1 --> \nsurface: "+cercle1.calculSurface()+ "\ncirconference: "+cercle1.calculCirconference());
        System.out.println("");
        System.out.println("CERCLE 2 --> \nsurface: "+cercle2.calculSurface()+ "\ncirconference: "+cercle2.calculCirconference());
    }

}
