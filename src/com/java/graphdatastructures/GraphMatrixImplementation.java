package com.java.graphdatastructures;

import java.util.Scanner;

public class GraphMatrixImplementation {

	  private final int vertices;
	    private int[][] adjacency_matrix;
	 
	    public GraphMatrixImplementation(int v) 
	    {
	        vertices = v;
	        adjacency_matrix = new int[vertices + 1][vertices + 1];
	    }
	 /**
	  * undirected graph and un weighted graph
	  * @param to
	  * @param from
	  * @param edge
	  */
	    public void makeEdge(int to, int from, int edge) 
	    {
	        try 
	        {
	            adjacency_matrix[to][from] = edge;
	            adjacency_matrix[from][to] = edge;
	        }
	        catch (ArrayIndexOutOfBoundsException index) 
	        {
	            System.out.println("The vertices does not exists");
	        }
	    }
	    
	    
	    /**
		  * undirected graph and  weighted graph
		  * @param to
		  * @param from
		  * @param edge
		  */
		    public void makeEdgeW(int to, int from, int edge) 
		    {
		        try 
		        {
		            adjacency_matrix[to][from] = edge;
		            adjacency_matrix[from][to] = edge;
		        }
		        catch (ArrayIndexOutOfBoundsException index) 
		        {
		            System.out.println("The vertices does not exists");
		        }
		    }
	 /**
	  * directed graph and unweighed graph
	  * @param to
	  * @param from
	  * @param edge
	  */
	    public void makeEdgeD(int to, int from, int edge) 
	    {
	        try 
	        {
	            adjacency_matrix[to][from] = edge;
	        }
	        catch (ArrayIndexOutOfBoundsException index) 
	        {
	            System.out.println("The vertices does not exists");
	        }
	    }
	    /**
		  * directed graph and  unweighed graph
		  * @param to
		  * @param from
		  * @param edge
		  */
		    public void makeEdgeDW(int to, int from, int edge) 
		    {
		        try 
		        {
		            adjacency_matrix[to][from] = edge;
		           
		        }
		        catch (ArrayIndexOutOfBoundsException index) 
		        {
		            System.out.println("The vertices does not exists");
		        }
		    }
	    public int getEdge(int to, int from) 
	    {
	        try 
	        {
	            return adjacency_matrix[to][from];
	        }
	        catch (ArrayIndexOutOfBoundsException index) 
	        {
	            System.out.println("The vertices does not exists");
	        }
	        return -1;
	    }
	 
	    public static void main(String args[]) 
	    {
	        int v, e, count = 1, to = 0, from = 0;
	        Scanner sc = new Scanner(System.in);
	        GraphMatrixImplementation graph;
	        try 
	        {
	            System.out.println("Enter the number of vertices: ");
	            v = sc.nextInt();
	            System.out.println("Enter the number of edges: ");
	            e = sc.nextInt();
	 
	            graph = new GraphMatrixImplementation(v);
	 
	            System.out.println("Enter the edges: <to> <from>");
	            while (count <= e) 
	            {
	                to = sc.nextInt();
	                from = sc.nextInt();
	                
	                graph.makeEdge(to, from, 1);// undirected and unweighed graph
	 
//	                graph.makeEdgeW(to, from, sc.nextInt()); // undirected and weighed graph
	                
//	                graph.makeEdgeD(to, from, 1); // directed and unweighed graph
	                
//	                graph.makeEdgeDW(to, from, sc.nextInt()); // directed and weighed graph
	                
	                
	                count++;
	            }
	 
	            System.out.println("The adjacency matrix for the given graph is: ");
	            System.out.print("  ");
	            for (int i = 1; i <= v; i++)
	                System.out.print(i + " ");
	            System.out.println();
	 
	            for (int i = 1; i <= v; i++) 
	            {
	                System.out.print(i + " ");
	                for (int j = 1; j <= v; j++) 
	                    System.out.print(graph.getEdge(i, j) + " ");
	                System.out.println();
	            }
	            
	            
	 
	        }
	        catch (Exception E) 
	        {
	            System.out.println("Somthing went wrong");
	        }
	 
	        sc.close();
	    }
	
	
}
