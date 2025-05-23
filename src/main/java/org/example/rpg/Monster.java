package org.example.rpg;

public abstract class Monster implements Posionable, Bleedable{
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double posion() {
        return getDamage()*0.3;
    }

    public double attack() {
        return getDamage() + bleed() + posion();
    }
}
