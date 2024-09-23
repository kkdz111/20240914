package rdtygy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class rerft {

    public static void main(String[] args) {
        new myDrawLine();
    }
}

class myDrawLine extends JFrame implements MouseListener {
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JButton jbtn1 = new JButton("红色");
    JButton jbtn2 = new JButton("绿色");
    JButton jbtn3 = new JButton("蓝色");
    int x1, y1, x2, y2;
    char yanse;

    myDrawLine() {
        super("画线程序");
        setSize(500, 400);
        setLocation(460, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp2.setLayout(new GridLayout(1, 3, 5, 5));
        jp2.add(jbtn1);
        jp2.add(jbtn2);
        jp2.add(jbtn3);
        add(jp1);
        add(jp2, BorderLayout.SOUTH);
        jbtn1.addMouseListener(this);
        jbtn2.addMouseListener(this);
        jbtn3.addMouseListener(this);
        jp1.addMouseListener(this);
        jp2.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == jbtn1) {
            yanse = 'r';
        } else if (e.getSource() == jbtn2) {
            yanse = 'g';
        } else if (e.getSource() == jbtn3) {
            yanse = 'b';
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == jbtn1) {
            jbtn1.setForeground(Color.RED);
        } else if (e.getSource() == jbtn2) {
            jbtn2.setForeground(Color.GREEN);
        } else if (e.getSource() == jbtn3) {
            jbtn3.setForeground(Color.BLUE);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == jbtn1) {
            jbtn1.setForeground(Color.BLACK);
        } else if (e.getSource() == jbtn2) {
            jbtn2.setForeground(Color.BLACK);
        } else if (e.getSource() == jbtn3) {
            jbtn3.setForeground(Color.BLACK);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        Graphics g = jp1.getGraphics();
        if (yanse == 'r') {
            g.setColor(Color.RED);
        } else if (yanse == 'g') {
            g.setColor(Color.GREEN);
        } else if (yanse == 'b') {
            g.setColor(Color.BLUE);
        }
        g.drawLine(x1, y1, x2, y2);
    }
}
