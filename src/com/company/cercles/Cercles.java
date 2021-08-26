package com.company.cercles;

public class Cercles {

    // nos variables
    private double rayon;

    // les constructeurs
    public Cercles() {
        this.rayon = 1.1;
    }

    public Cercles(double rayon) {
        this.rayon = rayon;
    }

    // nos getters and setters

    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // nos methodes
    public double calculSurface() {
        // pi * rayon au carré
        double surface = Math.PI * rayon * rayon;

        return surface;
    }

    public double calculCirconference() {
        // 2 * pi * rayon
        return 2 * Math.PI * rayon;
    }

}
