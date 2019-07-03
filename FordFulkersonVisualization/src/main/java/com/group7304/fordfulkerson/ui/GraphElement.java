/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group7304.fordfulkerson.ui;

import java.awt.Graphics;

/**
 *
 * @author theph
 */
public abstract class GraphElement {
    private static int id_cur = 0;
    protected int id;

    protected boolean selected;

    public GraphElement() {
        this.id = id_cur;
        id_cur++;
        selected = false;
    }
    
    public abstract void paint(Graphics g);

    @Override
    public String toString() {
        return "{" + id + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }


    
}
