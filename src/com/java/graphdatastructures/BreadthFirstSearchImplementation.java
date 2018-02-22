package com.java.graphdatastructures;

import com.java.datastructures.Queue;

class Vertexg{
	public char label;
	public boolean visited;
	public Vertexg(char lab){
		label = lab;
		visited = false;
		
				
	}
	
}

class Graphg{  
	
	private int maxVertices ;
	private Vertexg vertexList[];
	private int adjMatrix[][];
	private int vertexCount;
	private Queue theQueue;
	
	
	public Graphg(int maxVertices){
		this.maxVertices = maxVertices;
		vertexList = new Vertexg[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		vertexCount =0;
		theQueue = new Queue(maxVertices);
	}
	public void addVertex(char lab){
		vertexList[vertexCount++] = new Vertexg(lab);
	}
	
	public void addEdge(int start,int end){
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
		
	}
	public void display(int v){
		System.out.println(vertexList[v].label);
	}
	
	public void bfs() throws Exception{
		vertexList[0].visited = true;
		display(0);
		theQueue.enque(0);
		int v2;
		
		while (!theQueue.isEmpty()) {
			int v1 = theQueue.deque();
			while((v2 = getAdjUnvistedVertex(v1))!= -1){
				vertexList[v2].visited =true;
				display(v2);
				theQueue.enque(v2);

				
			}
			
		}
		
		
		for (int i = 0; i < adjMatrix.length; i++) {
			vertexList[i].visited = false;
		}
		
	}
	private int getAdjUnvistedVertex(int v1) {
	
		for (int i = 0; i < vertexCount; i++) 
			if(adjMatrix[v1][i]==1 && vertexList[v1].visited ==false)
				return i;
			
		
		
		
		
		return 0;
	}
}
public class BreadthFirstSearchImplementation {


	public static void main(String[] args) throws Exception {
		Graphg graphg = new Graphg(5);
		graphg.addEdge(1, 4);
		graphg.addVertex('A');
		
		graphg.addEdge(2, 4);
		graphg.addVertex('G');
		
		graphg.addEdge(3, 4);
		graphg.addVertex('F');
		
		graphg.addEdge(1, 2);
		graphg.addVertex('L');
	
		graphg.addEdge(1, 3);
		graphg.addVertex('M');
		
	
		
		graphg.bfs();

	}
}
