package datastructures;

import java.util.Enumeration;

public interface TreeNode<T extends Comparable<? super T>> {
	public  TreeNode<T> getParent();
	public Enumeration<TreeNode<T>> getChildren();
	public T getValue();
	public long getKey();
	public  int getNumberOfChildren();
	public boolean hasParent();
}
