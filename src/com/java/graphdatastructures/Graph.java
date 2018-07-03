package com.java.graphdatastructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Graph {
	private int vCount;
	private PriorityQueue<GEdge>[] adj;

	public int getvCount() {
		return vCount;
	}

	public Graph(int vCount) {
		this.vCount = vCount;
		adj = new PriorityQueue[vCount];
		for (int i = 0; i < vCount; i++)
			adj[i] = new PriorityQueue<GEdge>();
	}

	public void addEdge(int i, int j, float weight) {
		adj[i].add(new GEdge(i, j, weight));
	}

	public void addEdge(GEdge e) {
		adj[e.getStartPoint()].add(e);
	}

	public void removeEdge(int i, int j) {
		Iterator<GEdge> it = adj[i].iterator();
		GEdge other = new GEdge(i, j, 0);
		while (it.hasNext()) {
			if (it.next().equals(other)) {
				it.remove();
				return;
			}
		}
	}

	public boolean hasEdge(GEdge e) {
		return adj[e.getStartPoint()].contains(e);
	}

	public PriorityQueue<GEdge> neighbours(int vertex) {
		return adj[vertex];
	}

	public void printGraph() {
		for (int i = 0; i < vCount; i++) {
			PriorityQueue<GEdge> edges = neighbours(i);
			Iterator<GEdge> it = edges.iterator();
			System.out.print(i + ": ");
			for (int j = 0; j < edges.size(); j++) {
				System.out.print(it.next() + " ");
			}
			System.out.println();
		}
	}

	public static Graph Kruskal(Graph g) {
		Graph mst = new Graph(g.getvCount());
		boolean[] marked = new boolean[g.getvCount()];

		// create queue of all edges in ascending order
		PriorityQueue<GEdge> edges = new PriorityQueue<GEdge>();
		for (int i = 0; i < g.getvCount(); i++) {
			Iterator<GEdge> it = g.neighbours(i).iterator();
			while (it.hasNext()) {
				edges.add(it.next());
			}
		}

		System.out.println(edges);
		// first edge insert
		GEdge e = edges.remove();
		mst.addEdge(e);
		marked[e.getStartPoint()] = true;

		// loop until no edges remain
		while (!edges.isEmpty()) {
			// get the edge with the less weight
			GEdge temp = edges.remove();

			// if no circle is being made
			if (!marked[temp.getEndPoint()]) {
				if (!mst.hasEdge(temp)) {
					mst.addEdge(temp);
					marked[temp.getEndPoint()] = true;
				}
			}

		}
		return mst;
	}
	
	
	public static Graph Prim(Graph g, int startVertex) {
		Graph mst = new Graph(g.getvCount());
		boolean[] marked = new boolean[g.getvCount()];

		// insert neighbours of first vertex
		PriorityQueue<GEdge> edges = new PriorityQueue<GEdge>();
		Iterator<GEdge> it = g.neighbours(startVertex).iterator();
		while (it.hasNext()) {
			edges.add(it.next());
		}
		marked[startVertex] = true;

		// loop until no edges remain
		while (!edges.isEmpty()) {
			GEdge e = edges.remove();

			// if adding makes no circle
			if (!marked[e.getEndPoint()]) {
				mst.addEdge(e);
				marked[e.getEndPoint()] = true;

				// add neighbour edges of vertex if don't marked yet
				Iterator<GEdge> i = g.neighbours(e.getEndPoint()).iterator();
				while (i.hasNext())
					edges.add(i.next());
//				marked[e.getEndPoint()] = true;
			}
		}
		return mst;
	}
	
	
	public static void Dijkstra(Graph g, int startVertex) {
        // for storing distances after removing vertex from Queue
        float[] distances = new float[g.getvCount()];
        // for storing father id's after removing vertex from Queue
        int[] parents = new int[g.getvCount()];
        for (int i = 0; i < g.getvCount(); i++) {
            parents[i] = -1;
        }
 
        // set up vertex queue
        PriorityQueue<Vertex> Q = new PriorityQueue<Vertex>();
        for (int i = 0; i < g.getvCount(); i++) {
            if (i != startVertex) {
                Q.add(new Vertex(i));
            }
        }
 
        // add startVertex
        Vertex node = new Vertex(startVertex);
        node.setDistance(0);
        Q.add(node);
 
        // loop through all vertices
        while (!Q.isEmpty()) {
            // get vertex with shortest distance
            Vertex u = Q.remove();
            distances[u.getId()] = u.getDistance();
 
            // iterate through all neighbours
            Iterator<GEdge> it = g.neighbours(u.getId()).iterator();
            while (it.hasNext()) {
                GEdge e = it.next();
                Iterator<Vertex> it2 = Q.iterator();
                while (it2.hasNext()) {
                    Vertex v = it2.next();
                    // check if vertex was visited already
                    if (e.getEndPoint() != v.getId()) {
                        continue;
                    }
                    // check distance
                    if (v.getDistance() > u.getDistance() + e.getWeight()) {
                        v.setDistance(u.getDistance() + e.getWeight());
                        v.setParent(u);
                        parents[v.getId()] = v.getParent().getId();
                    }
                }
            }
 
        }
       
        // print final shortest paths
        System.out.println("Vertex\tDistance\tParent Vertex");
        for (int i = 0; i < g.getvCount(); i++) {
            System.out.println(i + "\t" + distances[i] + "\t\t" + parents[i]);
        }
 
    }
	
	public static void BellmanFord(Graph g, int startVertex) {
		// for storing distances
		float[] distances = new float[g.getvCount()];
		// for storing predecessors
		int[] predecessors = new int[g.getvCount()];

		// initialize arrays
		for (int i = 0; i < distances.length; i++) {
			distances[i] = Float.MAX_VALUE;
			predecessors[i] = -1;
		}
		distances[startVertex] = 0;

		// relax all edges v - 1 times repeatedly
//		for (int i = 1; i < g.getvCount() - 1; i++) {
			for (int j = 0; j < g.getvCount() - 1; j++) {
				Iterator<GEdge> it = g.neighbours(j).iterator();
				while (it.hasNext()) {
					GEdge e = it.next(); // edge (u, v)
					// if dist(u) + w(u, v) < dist(v) then
					// dist(v) = dist(u) + w(u, v)
					// pred(v) = u
					if (distances[e.getStartPoint()] + e.getWeight() < distances[e.getEndPoint()]) {
						distances[e.getEndPoint()] = distances[e.getStartPoint()] + e.getWeight();
						predecessors[e.getEndPoint()] = e.getStartPoint();
					}
				}
			}
//		}

		// check for negative-weight circles
		for (int i = 0; i < g.getvCount() - 1; i++) {
			Iterator<GEdge> it = g.neighbours(i).iterator();
			while (it.hasNext()) {
				GEdge e = it.next(); // edge (u, v)
				// if dist(u) + w(u, v) < dist(v) then
				// graph contains negative-weight circle
				if (distances[e.getStartPoint()] + e.getWeight() < distances[e.getEndPoint()]) {
					System.out.println("Graph contains negative-weight circle!");
					return;
				}
			}
		}

		// print final shortest paths
		System.out.println("Vertex\tDistance\tPredecessor");
		for (int i = 0; i < g.getvCount(); i++) {
			System.out.println(i + "\t" + distances[i] + "\t\t" + predecessors[i]);
		}

	}

}
