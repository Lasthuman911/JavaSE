package com.wu.collection;

/**
 * Created by zhiming.wu on 2017/9/14.
 */
public class Baloon {

    private int id;//编号
    private Color color;//颜色

    public Baloon(int id, Color color) {
        this.id = id;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Baloon{" +
                "id=" + id +
                ", color=" + color +
                '}';
    }
}
