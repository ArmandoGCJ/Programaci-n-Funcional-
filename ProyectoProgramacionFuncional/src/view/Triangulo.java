package view;



import interfaces.IDrawable;

import java.awt.*;

public class Triangulo implements IDrawable {
    private int centerX, centerY, size;

    public Triangulo(int centerX, int centerY, int size) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.size = size;
    }

    @Override
    public void draw(Graphics2D g) {
        int[] xPoints = {centerX, centerX + size / 2, centerX - size / 2};
        int[] yPoints = {centerY - size / 2, centerY + size / 2, centerY + size / 2};
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
