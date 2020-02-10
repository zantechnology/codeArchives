package datastructures;

import java.util.Enumeration;

public interface GraphNode<T extends Comparable<? super T>> {
	public Enumeration<GraphNode<T>> getNeighbours();
	public T getValue();
	public long getKey();
}
