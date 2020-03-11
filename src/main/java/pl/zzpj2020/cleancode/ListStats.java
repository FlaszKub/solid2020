package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListStats {

	Map<Integer, Integer> numberOfNumbersInList = new HashMap<Integer, Integer>();
	private int minValue = Integer.MAX_VALUE;
	private int maxValue = Integer.MIN_VALUE;

	public ListStats(List<Integer> numbers) {
		goThroughTheList(numbers);
	}

	public ListStats() { }

	public void goThroughTheList(List<Integer> numberList) {
		for (Integer integer : numberList) {
			insertIntoHashMap(integer);
		}
	}

	private void insertIntoHashMap(Integer i) {
		if (numberOfNumbersInList.containsKey(i)) {
			Integer k = numberOfNumbersInList.get(i);
			numberOfNumbersInList.put(i, k + 1);
		} else {
			numberOfNumbersInList.put(i, 1);
		}

		if (i > maxValue) {
			maxValue = i;
		}

		if (i < minValue) {
			minValue = i;
		}
	}

	public int getNumberOfOccurrences(int number) {
		return numberOfNumbersInList.getOrDefault(number, 0);
	}

	public double getAverage() {
		double sumOfValues = 0;
		double countOfNumbers = 0;
		for (Entry<Integer, Integer> u : numberOfNumbersInList.entrySet()) {
			countOfNumbers += u.getValue();
			sumOfValues += u.getKey() * u.getValue();
		}
		return sumOfValues / countOfNumbers;
	}

	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

}