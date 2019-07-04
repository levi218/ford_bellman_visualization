/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group7304.fordfulkerson.controller;

import com.group7304.fordfulkerson.model.Edge;
import com.group7304.fordfulkerson.model.Graph;
import com.group7304.fordfulkerson.model.Vertex;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author duyenNH
 */
public class Controller {
    public Graph graph;
    
    public void addEdge(Vertex start, Vertex end, int capacity){
        graph.addEdge(start, end, capacity);
    }
    
    public void addVertex(char newVertex){
        graph.addVertex(newVertex);
    }
    
    public void process(){
        
    }
    
    public void getStep(int typeStep){
        
    }
    
    public void saveFile(String fileName) throws IOException{
        FileWriter fw = new FileWriter(fileName);
        fw.write("Vertex: " + graph.getVrtx().size()+"\n");
        for(Vertex v: graph.getVrtx()){
            fw.write(v.toString());
        } 
        fw.write("\nEdges: " + graph.getEdges().size() + "\n");
        for(Edge e : graph.getEdges()){
            fw.write(e.toString());
        }
        fw.close();
    }
    
    public void loadFile(String fileName) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
	String sLine;
        int i = 0;
 
	while ((sLine = br.readLine()) != null) {
            i++;
            if(i == 2){
                for(int j=0; j<sLine.length(); j++){
                    graph.addVertex(sLine.charAt(j));
                }
            }
            else if(i > 3){
                Vertex s = new Vertex(sLine.charAt(0));
                Vertex e = new Vertex(sLine.charAt(1));                
                graph.addEdge(s, e, sLine.charAt(2));
            }
	}
        br.close();
        fr.close();
    }
}
