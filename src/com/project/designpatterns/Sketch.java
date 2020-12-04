package com.project.designpatterns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class Sketch extends JPanel {

    private static List<List<Point>> curves = new ArrayList<>();

    public Sketch() {
        // Register event listeners on construction of the panel.
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                var newCurve = new ArrayList<Point>();
                newCurve.add(new Point(e.getX(), e.getY()));
                curves.add(newCurve);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                curves.get(curves.size() - 1).add(new Point(e.getX(), e.getY()));
                repaint(0, 0, getWidth(), getHeight());
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (var curve: curves) {
            var previousPoint = curve.get(0);
            for (var point: curve) {
                g.drawLine(previousPoint.x, previousPoint.y, point.x, point.y);
                previousPoint = point;
            }
        }
    }

   public static void draw(int w, int h){

           var frame = new JFrame("Simple Sketching Program");
           frame.getContentPane().add(new Sketch(), BorderLayout.CENTER);
           frame.setLocationRelativeTo(null);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(w, h);
           frame.setVisible(true);

   }
    public static void main(String[] args) {
        draw(600,400);
    }
}
