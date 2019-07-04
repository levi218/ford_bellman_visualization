package com.group7304.fordfulkerson.model;
import java.util.ArrayList;

public class Vertex {
    char name;
    Edge cameFrom;
    ArrayList<Vertex> neighbours;
    boolean visited;

    Vertex(char name) {
        this.name = name;
        neighbours = new ArrayList();
        visited = false;
        cameFrom = null;
    }
}
