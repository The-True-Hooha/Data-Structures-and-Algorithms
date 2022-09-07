package com.github.TheTrueHooha.DataStructure.Graph;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphApplication {

    int vertices;
    ArrayList<Integer> arrayList[];

    public GraphApplication(int vNUmber) {
        vertices = vNUmber;
        arrayList = new ArrayList[vNUmber];

        for (int i = 0; i < vNUmber; i++){
            arrayList[i] = new ArrayList<>();
        }
    }

    //creating edges
    void edges(int x, int y){
        arrayList[x].add(y);
    }

    void breadthFirstSearch(int initialV){
        boolean[] traversedV = new boolean[vertices];
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        traversedV[initialV] = true;
        a1.add(initialV);
        while (!a1.isEmpty()){
            initialV = a1.remove(0);
            System.out.print(initialV+" ");
            Iterator<Integer> i = arrayList[initialV].iterator();
            while (i.hasNext()){
                int number = i.next();
                if (!traversedV[number]){
                    traversedV[number] = true;
                    a1.add(number);
                }
            }
        }
    }


    public static void main(String[] args) {
        GraphApplication graphApplication = new GraphApplication(6);
        graphApplication.edges(0, 1);
        graphApplication.edges(0, 2);
        graphApplication.edges(0, 5);
        graphApplication.edges(1, 0);
        graphApplication.edges(1, 2);
        graphApplication.edges(2, 0);
        graphApplication.edges(2, 1);
        graphApplication.edges(2, 3);
        graphApplication.edges(2, 4);
        graphApplication.edges(3, 2);
        graphApplication.edges(3, 2);
        graphApplication.edges(4, 2);
        graphApplication.edges(4, 5);
        graphApplication.edges(5, 0);
        graphApplication.edges(5, 4);

        graphApplication.breadthFirstSearch(0);

    }
}
