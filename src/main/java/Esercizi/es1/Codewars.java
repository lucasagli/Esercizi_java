package Esercizi.es1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.lang.*;
import java.util.Hashtable;
import java.math.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Codewars {

	// primo esercizio codewars
	public int squareDigits(int value) {
		Deque<Integer> stack = new LinkedList<Integer>();

		while (value > 0) {
			int cypher = value % 10;
			stack.push(cypher * cypher);
			value /= 10;
		}

		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			int current = stack.pop();
			result = result.append(current);
		}
		return Integer.parseInt(result.toString());
	}

	// secondo esercizio codewars
	public int countBits(int n) {
		StringBuilder bitNum = new StringBuilder();

		while (n > 0) {
			if (n % 2 == 1) {
				bitNum.append(1);

			} else {
				bitNum.append(0);
			}
			n /= 2;
		}
		// ora ho il numero in bit
		int result = 0;
		for (int i = 0; i < bitNum.length(); i++) {
			if (bitNum.charAt(i) == '1') {
				result += 1;
			}

		}
		return result;

	}

	public int maxBall(int v0) {
		double v0ms = v0 / 3.6;
		double t = 0.1;
		double h = 0;
		int key = 1;
		Map<Integer, Double> height = new HashMap<Integer, Double>();
		double v1 = v0ms;
		final double G = 9.81;
		while (v1 >= 0) {
			h = v0ms * t - 0.5 * G * Math.pow(t, 2);
			height.put(key, h);
			v1 = v0ms - G * t;
			key++;
			t += 0.1;
		}

		if (height.get(height.size()) > height.get(height.size() - 1)) {
			key = height.size();
		} else {
			key = height.size() - 1;
		}
		return key;

//		do {
//			h = v0ms * t - 0.5 * 9.81 * Math.pow(t, 2);
//			height.put(key, h);
//			t += 0.1;
//			key ++;
//		} while (h > 0);
//
//		double max = Collections.max(height.values());
//
//		int max_key = 0;
//		for (int i = 1; i < height.size(); i++) {
//			if (height.get(i) == max) {
//				max_key = i;
//			}
//		}
//		return max_key;

	}

	public int[] sort1(int[] data) {

		for (int i = 0; i < data.length; i++) {
			boolean flag = false;
			for (int j = 0; j < data.length - 1; j++) {
				int swap = data[j];
				if (data[j] > data[j + 1]) {
					data[j] = data[j + 1];
					data[j + 1] = swap;
					flag = true;

				}
			}
			if (flag == false) {
				return data;
			}
		}
		return data;
	}

	public int[] generate(int level) {
		List<Integer> res = new ArrayList<Integer>();

		for (int k = 1; k < level+1; k++) {

			for (int i = 1; i <= k ; i++) {
				if (i == 1) {

					res.add(1);
				}

				else {
					int fact = k;
					int count = i;
					// devo fare fattoriale di fact ma solo per il numero di volte indicato da k
					while (count > 1) {

						fact = fact * (fact - count + 1);
						count--;
					}

					int fact2 = 1;
					for (int j = 1; j <= i; j++) { // da controllare la fine del loop, not sure
						fact2 = fact2 * j;
					}

					res.add(fact / fact2);

				}

			}
		}
		int[] res2;
		res2 = new int[res.size()];
		for (int i = 0; i < res2.length; i++) {
			res2[i] = res.get(i);
		}
		return res2;
	}
}
