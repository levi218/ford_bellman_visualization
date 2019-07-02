/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group7304.fordfulkerson;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author theph
 */
public class GraphDisplayFrame extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        int x1 = 100, y1 = 100, x2 = 300, y2 = 200;
        int radius = 20;
        
        g.setColor(Color.black);
        g.drawLine(x1, y1, x2, y2);
        g.drawString("flow / cap", (x1+x2)/2, (y1+y2)/2);

        g.setColor(Color.green);
        g.fillOval(x1-radius, y1-radius, radius*2, radius*2);

        g.setColor(Color.black);
        g.drawString("1", x1, y1);

        g.setColor(Color.green);
        g.fillOval(x2-radius, y2-radius, radius*2, radius*2);

        g.setColor(Color.black);
        g.drawString("2", x2, y2);

    }

}
