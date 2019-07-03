/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group7304.fordfulkerson.ui;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author theph
 */
public class GraphVertex extends GraphElement{
    private int x;
    private int y;

    public GraphVertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        if(!this.selected) g.setColor(Color.GREEN); else g.setColor(Color.red);
        int radius = 20;
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);

        g.setColor(Color.black);
        g.drawString(toString(), x, y);
    }
    
    
}
