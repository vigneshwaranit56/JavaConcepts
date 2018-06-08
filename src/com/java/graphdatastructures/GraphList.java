package com.java.graphdatastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.java.datastructures.Queue;


public class GraphList {

	private int numVertices;
	private static LinkedList<Integer> adjLists[];
	private static boolean visited[];

	GraphList(int vertices) {
		numVertices = vertices;
		adjLists = new LinkedList[vertices];
		visited = new boolean[vertices];

		for (int i = 0; i < vertices; i++)
			adjLists[i] = new LinkedList<Integer>();
	}

	void addEdge(int src, int dest) {
		adjLists[src].add(dest);
		adjLists[dest].add(src);

	}

	public void printGraph() {

		for (int i = 0; i < adjLists.length; i++) {
			System.out.println("vertex " + i);

			for (Integer gEdge : adjLists[i]) {
				System.out.print("->" + gEdge);
			}

			System.out.println();
		}

	}

	public static void main(String[] args) throws Exception {

		GraphList g = new GraphList(5);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);

		g.printGraph();
		g.dfs(1);
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;

		}
		System.out.println();
		g.bfs(0);

	}

	private void dfs(Integer node) {
		visited[node] = true;

		System.out.print(node + " ");

		Iterator<Integer> ite = adjLists[node].listIterator();
		while (ite.hasNext()) {
			int adj = (int) ite.next();
			if (!visited[adj])
				dfs(adj);
		}

	}

	private void bfs(Integer node) throws Exception {

		visited[node] = true;
		Queue queue = new Queue(numVertices);

		try {
			queue.enque(node);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (!queue.isEmpty()) {
			Integer el = queue.deque();
			System.out.print(el + " vertex ");

			Iterator<Integer> itr = adjLists[el].iterator();

			while (itr.hasNext()) {
				Integer adj = itr.next();

				if (!visited[adj]) {
					queue.enque(adj);
					visited[adj] = true;
				}
			}

		}

	}

}
