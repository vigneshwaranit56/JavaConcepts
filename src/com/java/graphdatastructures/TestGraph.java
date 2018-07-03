package com.java.graphdatastructures;

public class TestGraph {

	public static void main(String[] args) {

		Graph g = new Graph(5);

		System.out.println("Graph:");
		// add Edges
		g.addEdge(0, 1, 5.2f);
		g.addEdge(0, 3, 7.1f);
		g.addEdge(1, 3, 5.9f);
		g.addEdge(1, 4, 3.4f);
		g.addEdge(2, 1, 1.5f);
		g.addEdge(2, 3, 2.3f);
		g.addEdge(3, 4, 8.5f);
		g.addEdge(4, 2, 2.7f);

		// print Graph
		g.printGraph();

		// MST Algorithms
		System.out.println("Kruskal MST:");
		Graph mst_1 = Graph.Kruskal(g);
		mst_1.printGraph();

		System.out.println("Prim MST:");
		Graph mst_2 = Graph.Prim(g, 0);
		mst_2.printGraph();

		System.out.println("dijkstras");

		Graph.Dijkstra(g, 0);

		System.out.println("bellmon");

		Graph.BellmanFord(g, 0);

	}
}
