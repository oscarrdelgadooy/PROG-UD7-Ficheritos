package net.salesianos.actividades.actividadcuatro;

import java.io.Serializable;

public class Mesa implements Serializable {
    private String color;
    private int legs;

    public Mesa(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "ActividadMesa [color=" + color + ", legs=" + legs + "]";
    }
}
