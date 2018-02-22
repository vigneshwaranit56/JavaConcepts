package com.java.graphdatastructures;

import java.util.Stack;

class Vertex{
	public char label;
	public boolean visited;
	public Vertex(char ch) {
	label = ch;
	visited = false;
	}
}

class Graph{
	private  static int maxVertices ;
	private int adjMatrix[][];
	private int vertexCount;
	private Vertex vertexList[];
	private Stack theStack;
	
	public Graph(int maxVertices) {
		Graph.maxVertices = maxVertices;
		adjMatrix = new int[maxVertices][maxVertices];
		vertexList = new Vertex[maxVertices];
		for (int i = 0; i < maxVertices; i++) 
		for (int j = 0; j < maxVertices; j++) 
			adjMatrix[i][j] =0;
		theStack = new Stack();				
			
		
		
	}
	
	public void addVertex(char lab){
		vertexList[vertexCount++] = new Vertex(lab);
		
	}
	
	public void addEdge(int start,int end){
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
		
	}
	
	public void displayVertex(int v){
		
		System.out.println(vertexList[++v].label);
	}
	
	public void dfs(){
		vertexList[0].visited =true;
		displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty()){
			// getting unvisited vertex adjacent to stack top
			int v = getAdjUnvistedVerstex((int) theStack.peek());
			if(v == -1)
				theStack.pop();
			else
				vertexList[v].visited = true;
			
			displayVertex(v);
			theStack.push(v);
			
		}
		
		for (int i = 0; i < vertexCount; i++) {
			vertexList[i].visited = false;// reset flags
			
		}
		
	}

	private int getAdjUnvistedVerstex(int v) {
		System.out.println(-1);
		for (int i = 0; i < vertexCount; i++) 
			if(adjMatrix[v][i] == 1 && vertexList[i].visited == false)
				return i;
		
		return -1;
	}
	
}

public class DepthFirstSearchListImplementation {

	public static void main(String[] args) {
		Graph graphg = new Graph(5);
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
		
		graphg.dfs();
		
	}

}
