package controller;

import interfaces.IDrawable;
import view.Circulo;

import javax.swing.*;
import java.awt.*;


public class Container extends JPanel {
    private IDrawable currentDrawable;

    public Container() {

        setDrawable(new Circulo(300, 300, 100));
    }

    public void setDrawable(IDrawable drawable) {
        this.currentDrawable = drawable;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if (currentDrawable != null) {
            currentDrawable.draw(g2d);
        }
    }
}
