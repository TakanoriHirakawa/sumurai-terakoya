package review.kadai19;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	public int compare(Employee x,Employee y) {
		return x.getFurigana().compareTo(y.getFurigana());
	}
}
