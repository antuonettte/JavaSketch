//package com.project.designpatterns;
//
//import javax.swing.*;
//import java.awt.*;
//
//
//
//public class Canvas extends JPanel {
//
//    public static boolean running = false;
//    int xoff = 0;
//    int yoff = (int) (Math.random()*400);
//
//    protected void isRunning(boolean x) {
//        running = x;
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.red);
//
//        if(running){
//            g.drawRect(200,200,200,200);
//            System.out.println("hello");
//
//        }
//    }
//
//}
