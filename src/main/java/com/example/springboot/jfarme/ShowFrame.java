package com.example.springboot.jfarme;

import com.sun.awt.AWTUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

/**
 * @author Administrator
 */
public class ShowFrame extends JFrame
{
    public ShowFrame(){
        this.setSize(600,500);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        this.setUndecorated(true);
        this.setLocation((screenSize.width-frameSize.width)/2,(screenSize
                .width-frameSize.height)/2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        AWTUtilities.setWindowOpacity(this, 0.01f);
        container.add(new MyPanel(this));
        this.setBackground(null);
        this.setVisible(true);
        new FadeOut(this).start();
    }

    public static void main(String[] args)
    {
        ShowFrame showFrame = new ShowFrame();
    }

    class MyPanel extends JPanel
    {
        private Image background;

        JFrame frame;

        public MyPanel(final JFrame frame)
        {
            this.frame = frame;
            try
            {
                URL url = Panel.class.getResource("a.jpg");
                ImageIcon icon = new ImageIcon(url);
                background = icon.getImage();
                //      background = ImageIO.read(new File("D:\\workspace\\maven\\blessing\\src\\shen\\b.jpg"));
                this.addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mouseClicked(MouseEvent e)
                    {
                        super.mouseClicked(e);
                        //          new FadeOut(MyPanel.this.frame).start();
                        frame.setVisible(false);
                        frame.dispose();
                    }
                });
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(background,0,0,666,666,null);
            g.setColor(Color.red);
            g.setFont(new Font("", Font.BOLD, 15));
            g.drawString("祝愿宝儿永远幸福的像花儿一样", 60, 280);
    }
    }
    class FadeOut extends Thread
    {
        private JFrame wnd;

        public FadeOut(JFrame wnd)
        {
            this.wnd = wnd;
        }

        @Override
        public void run()
        {
            try
            {
                for (int i = 0; i < 50; i++)
                {
                    Thread.sleep(50);
                    AWTUtilities.setWindowOpacity(wnd, i / 50f);
                }

            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
