 package com.java.graphdatastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class EdgeG{
	 int source,dest, weight;
	 
	 public EdgeG(int source,int dest,int weight) {
	this.source = source;
	this.dest = dest;
	this.weight = weight;
	}
 }
 class Node{
	 int vertex,weight;
	 
	 public Node( int vertex,int weight) {
	this.vertex = vertex;
	this.weight = weight;
	}
 }
 
 class GraphG{
	 
	 public List<List<EdgeG>> adjList;
	 
	 public GraphG(List<EdgeG> list,int N){
		 
		 adjList = new ArrayList<>(N);
		 
		 for (int i = 0; i < N; i++) {
			adjList.add(i, new ArrayList<>());
		}
		 
		 for (EdgeG edgeG : list) {
			adjList.get(edgeG.source).add(edgeG);
		}
		 
		 
	 }
	 
	 
 }
public class Dijkstra {
	
	private static void shortestPath(GraphG graph, int source, int N) {
		
		// create min heap and push source node having distance 0
        PriorityQueue<Node> minHeap = new PriorityQueue<>((lhs, rhs) -> lhs.weight - rhs.weight);
        minHeap.add(new Node(source, 0));
        
       
        System.out.println(minHeap);
        // set infinite distance from source to v initially
        List<Integer> dist = new ArrayList<>(Collections.nCopies(N, Integer.MAX_VALUE));        

        // distance from source to itself is zero
        dist.set(source, 0);
        
        System.out.println(dist);
        
        boolean[] done = new boolean[N];
        done[0] = true;
        
        // stores predecessor of a vertex (to print path)
        int prev[] = new int[N];
        prev[0] = -1;
        
        // run till minHeap is not empty
        while (!minHeap.isEmpty())
        {
            // Remove and return best vertex
        	
            Node node = minHeap.poll();
System.out.println(node.vertex);
            // get vertex number
            int u = node.vertex;
            System.out.println(u);


            // do for each neighbor v of u
            for (EdgeG edge: graph.adjList.get(u))
            {
                int v = edge.dest;
                System.out.println("v "+v);
                int weight = edge.weight;

                // Relaxation step
                System.out.println(dist.get(v));
                if (!done[v] && (dist.get(u) + weight) < dist.get(v))
                {
                    dist.set(v, dist.get(u) + weight);
                    prev[v] = u;
                    minHeap.add(new Node(v, dist.get(v)));
                }
            }

            // marked vertex u as done so it will not get picked up again
            done[u] = true;
            System.out.println();
        }

        System.out.println(dist);
        for (int i = 1; i < N; ++i)
        {
            System.out.print("Path from vertex 0 to vertex " + i + " has minimum cost of "
                                + dist.get(i) + " and the route is [ ");
            printRoute(prev, i);
            System.out.println("]");
        }
	}
		
	
	
	private static void printRoute(int[] prev, int i) {
		 if (i < 0)
	            return;

		 
	        printRoute(prev, prev[i]);
	        System.out.print(i + " ");
	}



	public static void main(String[] args){
		
		List<EdgeG> list = Arrays.asList( new EdgeG(0, 1, 10), new EdgeG(0, 4, 3),
                new EdgeG(1, 2, 2), new EdgeG(1, 4, 4),
                new EdgeG(2, 3, 9), new EdgeG(3, 2, 7),
                new EdgeG(4, 1, 1), new EdgeG(4, 2, 8),
                new EdgeG(4, 3, 2));
		final int N = 5;
		GraphG g = new GraphG(list, N);
		
		shortestPath(g,0,N);
	}

}


