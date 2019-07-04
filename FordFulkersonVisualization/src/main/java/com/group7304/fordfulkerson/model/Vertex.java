package com.group7304.fordfulkerson.model;
import java.util.ArrayList;

public class Vertex {
    private char name;
    Edge cameFrom;
    ArrayList<Vertex> neighbours;
    boolean visited;
    
    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }    

    public Vertex(char name) {
        this.name = name;
        neighbours = new ArrayList();
        visited = false;
        cameFrom = null;
    }
}
