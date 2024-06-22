package view;

import interfaces.IDrawable;

import java.awt.*;

public class Circulo implements IDrawable {
    private int centerX, centerY, radius;

    public Circulo(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D g) {
        int x = centerX - radius;
        int y = centerY - radius;
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }
}
