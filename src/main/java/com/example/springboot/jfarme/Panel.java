package com.example.springboot.jfarme;

import com.sun.awt.AWTUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

/**
 * @auterAdministratorharryleng
 * @Date:2018/8/16
 */
public class Panel extends JPanel
{
    private Image background;
    JFrame frame = null;
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public Panel(JFrame frame){
        this.frame = frame;
        try {
            //      background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\window.png"));
            //      background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\b.jpg"));
            URL url=Panel.class.getResource("c.jpg");
            ImageIcon icon = new ImageIcon(url);
            background = icon.getImage() ;
            //      background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\b.jpg"));
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    new FadeOut(Panel.this.frame).start();

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class FadeOut extends Thread {
        private JFrame wnd;
        public FadeOut(JFrame wnd) {
            this.wnd = wnd;
        }
        @Override public void run() {
            try {
                for (int i = 50; i > 0; i--) {
                    Thread.sleep(50);
                    AWTUtilities.setWindowOpacity(wnd, i / 50f);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            wnd.setVisible(false);
            wnd.dispose();
            new ShowFrame();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background,0,0,666,666,null);
    }
}
