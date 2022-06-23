package model.services;

import java.util.List;

public class CalculationService {
	
	public static <Generic extends Comparable<? super Generic>> Generic max(List<Generic> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List Can't be empty!");
		}
		Generic max = list.get(0);
		for (Generic item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
