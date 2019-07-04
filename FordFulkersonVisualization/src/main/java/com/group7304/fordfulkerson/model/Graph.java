package com.group7304.fordfulkerson.model;
import java.util.ArrayList;

public class Graph {
    private ArrayList<Edge> edges;
    private ArrayList<Vertex> vrtx;

    public Graph() {
        edges = new ArrayList();
        vrtx = new ArrayList();
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public ArrayList<Vertex> getVrtx() {
        return vrtx;
    }

    public void setVrtx(ArrayList<Vertex> vrtx) {
        this.vrtx = vrtx;
    }

    public void addEdge(Vertex start, Vertex end, int capacity){
        edges.add(new Edge(start, end, capacity));
    }

    public void addVertex(char newVertex){
        vrtx.add(new Vertex(newVertex));
    }
}
