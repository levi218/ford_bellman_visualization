import java.util.ArrayList;

public class Graph {
    ArrayList<Edge> edges;
    ArrayList<Vertex> vrtx;

    Graph() {
        edges = new ArrayList();
        vrtx = new ArrayList();
    }

    void addEdge(Vertex start, Vertex end, int capacity){
        edges.add(new Edge(start, end, capacity));
    }

    void addVertex(char newVertex){
        vrtx.add(new Vertex(newVertex));
    }
}
