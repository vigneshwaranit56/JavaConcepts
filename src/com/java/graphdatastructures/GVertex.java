package com.java.graphdatastructures;

import java.util.LinkedList;
import java.util.List;

public class GVertex {
	
Integer vertex;
Boolean isVisited;
List<GEdge> edges;

public GVertex(Integer vertex,Boolean isvisited) {
this.vertex = vertex;
this.isVisited = isvisited;
edges= new LinkedList<GEdge>();
}

}
