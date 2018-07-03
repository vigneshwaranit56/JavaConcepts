package com.java.graphdatastructures;

public class GEdge implements Comparable<GEdge>{

	float weight;
	Integer startPoint;
	Integer endPoint;

	public GEdge(Integer source, Integer Destination, float weight2) {
		this.weight = weight2;
		endPoint = Destination;
		startPoint = source;

	}

    public int getStartPoint() {
	return startPoint;
    }

    public int getEndPoint() {
	return endPoint;
    }

    public float getWeight() {
	return weight;
    }

    public boolean equals(GEdge other) {
	if (this.startPoint == other.startPoint) {
		if (this.endPoint == other.endPoint) {
			return true;
		}
	}
	return false;
    }
    
    @Override
    public int compareTo(GEdge o) {
	GEdge other = o;
	return Double.compare(this.weight, other.weight);
    }

    public String toString() {
	return startPoint + "-" + endPoint + " (" + weight + ")";
    }


}
