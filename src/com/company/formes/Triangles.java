package com.company.formes;

public class Triangles extends Formes{
    private float hauteur;
    private float base;

    public Triangles(float hauteur, float base) {
        this.hauteur = hauteur;
        this.base = base;
    }

    @Override
    public float Aire() {
        return (base * hauteur) / 2;
    }
}
