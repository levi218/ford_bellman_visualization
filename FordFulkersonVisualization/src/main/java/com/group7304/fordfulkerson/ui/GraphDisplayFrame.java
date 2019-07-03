/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group7304.fordfulkerson.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author theph
 */
public class GraphDisplayFrame extends JPanel {

    ArrayList<GraphElement> elements;

    public GraphDisplayFrame() {
        this.elements = new ArrayList<>();
        this.elements.add(new GraphEdge(100, 100, 300, 200));
        this.elements.add(new GraphVertex(100, 100));
        this.elements.add(new GraphVertex(300, 200));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        for (GraphElement ele : elements) {
            ele.paint(g);
        }
    }

}
