package com.example.springboot.jfarme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @auterAdministratorharryleng
 * @Date:2018/8/16
 */
public class MoveWindow extends MouseAdapter
{
    private Point last;
    private JFrame frame;

    public MoveWindow(JFrame frame) {
        this.frame = frame;
    }

    @Override public void mousePressed(MouseEvent e) {
        last = e.getLocationOnScreen();
    }

    @Override public void mouseReleased(MouseEvent e) {
        Point point = e.getLocationOnScreen();
        Point fPoint = frame.getLocation();
        frame.setLocation(fPoint.x + point.x - last.x, fPoint.y + point.y
                - last.y);
        last = point;
    }
}
