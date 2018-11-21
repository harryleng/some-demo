package com.example.springboot.jfarme;

import com.sun.awt.AWTUtilities;

import javax.swing.*;
import java.io.Serializable;

/**
 * @author Administrator
 */
public class Frame extends JFrame implements Serializable
{

    private static final long serialVersionUID = 2203916711218088347L;
    public Frame() {
        setTitle("PNG透明窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(666, 666);
        setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        setContentPane(new Panel(this));
        addMouseListener(new MoveWindow(this));
    }

    public static void main(String[] args) {
        //System.out.println(Frame.class.getClassLoader().getResource("jfarme/test.txt"));
        System.out.println(ClassLoader.getSystemResource("jfarme/test.txt"));
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Frame().setVisible(true);
//            }
//        });
    }
}
