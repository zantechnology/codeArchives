package sorts;

import java.util.List;

public interface Sort{
	public <T extends Comparable<? super T>> void sort(List<T> list);

}
