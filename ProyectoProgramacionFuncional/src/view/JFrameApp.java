package view;

import controller.Container;
import interfaces.IDrawable;

import javax.swing.*;
import java.awt.*;

public class JFrameApp {
    private static Container container;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dibujar Figuras");
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            container = new Container();

            IDrawable circle = new Circulo(300, 300, 100);
            IDrawable triangle = new Triangulo(300, 300, 200);
            IDrawable square = new Cuadrado(300, 300, 150);


            JButton btn1 = new JButton("Círculo");
            btn1.addActionListener(e -> container.setDrawable(circle));

            JButton btn2 = new JButton("Triángulo");
            btn2.addActionListener(e -> container.setDrawable(triangle));

            JButton btn3 = new JButton("Cuadrado");
            btn3.addActionListener(e -> container.setDrawable(square));

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(btn1);
            buttonPanel.add(btn2);
            buttonPanel.add(btn3);

            frame.add(container, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
