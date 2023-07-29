package review.kadai19;

import java.util.Comparator;

public class DescendingCodeComparator implements Comparator<Employee> {
	public int compare(Employee x, Employee y) {
		return -(x.getCode()-y.getCode());
	}
}
