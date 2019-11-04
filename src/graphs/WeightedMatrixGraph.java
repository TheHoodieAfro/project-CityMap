package graphs;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a weighted graph using a matrix
 * @author Cristian Sanchez - Juan Pablo Herrera
 * @version 1.0 - 11/2019
 * @param <V> Abstract data type that represents the object to be modeled in the graph
 */
public class WeightedMatrixGraph<V> {
	
	private Map<V,Integer> Vertex;
	
	private int[][] Weight;
	
	public boolean isDirected;
	
	public WeightedMatrixGraph(int v, boolean d) {
		Vertex = new HashMap<V, Integer>();
		Weight = new int[v][v];
		isDirected = d;
	}

}
