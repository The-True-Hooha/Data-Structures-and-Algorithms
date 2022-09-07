package com.github.TheTrueHooha.DataStructure.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class GraphSearch {

    int vNumber; // number of unknown vertices
    ArrayList<Integer>[] adj;

    // constructor that takes in the number of vertices
    public GraphSearch(int numberOfVertices) {
        this.vNumber = numberOfVertices;
        adj = new ArrayList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++){
            adj[i] = new ArrayList<>();
        }
    }

    void edges(int x, int y){
        adj[x].add(y);
    }

    void depthFirstSerach(int initialV){
        boolean[] traversed = new boolean[vNumber];
        Stack<Integer> s1 = new Stack<>();
        s1.push(initialV);
        int node;
        while (!s1.empty()) {
            initialV = s1.peek();
            s1.pop();

            for (int i = 0; i < adj[initialV].size(); i++) {
                node = adj[initialV].get(i);
                if (!traversed[node]) {
                    s1.push(node);
                }
            }
            if (traversed[initialV] == false) {
                System.out.print(initialV + " ");
                traversed[initialV] = true;
            }
        }
    }


    public static void main(String[] args) {
        GraphSearch g1 = new GraphSearch(6);
        g1.edges(0, 1);
        g1.edges(0, 2);
        g1.edges(1, 0);
        g1.edges(1, 2);
        g1.edges(2, 1);
        g1.edges(2, 0);
        g1.edges(2, 3);
        g1.edges(2, 4);
        g1.edges(3, 2);
        g1.edges(4, 2);
        g1.edges(4, 5);
        g1.edges(5, 0);
        g1.edges(5, 4);

        g1.depthFirstSerach(0);
    }
}

