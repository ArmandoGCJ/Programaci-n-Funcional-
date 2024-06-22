package view;


import interfaces.IDrawable;

import java.awt.*;

public class Cuadrado implements IDrawable {
    private int centerX, centerY, size;

    public Cuadrado(int centerX, int centerY, int size) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.size = size;
    }

    @Override
    public void draw(Graphics2D g) {
        int x = centerX - size / 2;
        int y = centerY - size / 2;
        g.setColor(Color.GREEN);
        g.fillRect(x, y, size, size);
    }
}
