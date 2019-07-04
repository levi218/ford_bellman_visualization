package com.group7304.fordfulkerson.model;
public class Edge {
    private Vertex start;
    private Vertex end;
    private int flow;
    private int capacity;

    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public Vertex getEnd() {
        return end;
    }

    public void setEnd(Vertex end) {
        this.end = end;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public Edge(Vertex start, Vertex end, int capacity) {
        this.start = start;
        this.end = end;
        this.capacity = capacity;
        this.flow = 0;
    }

    public int countFlow(Vertex from) {
        if (from == start)
            return capacity - flow;
        else
            return flow;
    }
}
