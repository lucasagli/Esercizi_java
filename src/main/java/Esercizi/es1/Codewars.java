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
import java.util.Arrays;
import java.util.Collections;
import java.math.RoundingMode;


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

		for (int k = 0; k < level; k++) {

			for (int i = 0; i <= k; i++) {
				if (i == 0) {

					res.add(1);
				}

				else {
					double fact = 1;

					// devo fare fattoriale di fact ma solo per il numero di volte indicato da k
					for (int j = 1; j <= k; j++) {
						fact = fact * j;
					}

					double fact2 = 1;
					for (int j = 1; j <= i; j++) { // da controllare la fine del loop, not sure
						fact2 = fact2 * j;
					}
					double fact3 = 1;
					for (int j = 1; j <= k - i; j++) {
						fact3 = fact3 * j;
					}
					int result = (int) (fact / (fact2 * fact3));
					res.add(result);

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

	public int[] sort2(int[] data) {
		for (int i = 0; i < data.length; i++) {

			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[i]) {

					int swap = data[i];
					data[i] = data[j];
					data[j] = swap;
				}
			}

		}
		return data;
	}

	// epidemia
	public int epidemic(int tm, int n, int s0, int i0, double b, double a) {
		double r0 = 0;
		double dt = (double) tm / n;
		double s = 0;
		double i = i0;
		double r = 0;
		List<Double> rec = new ArrayList<Double>();
		List<Double> sus = new ArrayList<Double>();
		List<Double> inf = new ArrayList<Double>();
		rec.add(r0);
		sus.add((double)s0);
		inf.add((double)i0);
		s = (s0 - dt * b * s0 * i0);
		i = (i0 + dt * (b * s0 * i0 - a * i0));
		r = (r + dt * i0 * a);
		rec.add(r);
		sus.add(s);
		inf.add(i);
		int j = 1;
		while (i >= inf.get(j-1)) {
//    	  (I)    S[k+1] = S[k] - dt * b * S[k] * I[k]
//    	  (II)   I[k+1] = I[k] + dt * (b * S[k] * I[k] - a * I[k])
//    			  (III)  R[k+1] = R[k] + dt * I[k] *a
			
			
			s =  (sus.get(j) - dt * b * sus.get(j) * inf.get(j));
			i =  (inf.get(j) + dt * (b * sus.get(j) * inf.get(j) - a * inf.get(j)));
			r =  (rec.get(j) + dt * inf.get(j) * a);
			sus.add(s);
			inf.add(i);
			rec.add(r);
			j++;
			
		}
		double max = 0;
		for (int k = 0; k < inf.size(); k++) {
			if ( inf.get(k) > max ) {
				max = inf.get(k); 
			}
		}
		return (int)max;
	}
	
public static int longestSlideDown(int[][] pyramid) {
        int sum = pyramid[0][0];
        int row = pyramid.length;
        int col = pyramid[0].length;
        int count = 0;
        for (int i = 1; i < row; i++) {
        	for (int j = 0; j <= i; j++) {
				if( j == count ) {
					if (pyramid[i][count] > pyramid[i][count+1]) {
						sum += pyramid[i][count];
						break;
						
					}
					else {
						sum += pyramid[i][count+1];
						count += 1;
						break;
					}
				}
			}
			
		}
        return sum;
        
    }
 public static void main(String[] args) {
//	int[][] pyramid = new int[][] {{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}};
//	int c = Codewars.longestSlideDown(pyramid);
//	 int n = 719;
//	 int l = 983;
//	 System.out.println(Codewars.isPrime());
	 long[] result =  Codewars.gap(10, 300, 400);
	 System.out.println(Arrays.toString(result));
	 
}
 
 public static long digPow (int n, int p) {
	 List<Integer> result = new ArrayList<Integer>();
	 int number = n;
	 while (n>0) {
		 result.add(n%10);
		 n /= 10;
	 }
	 long sum = 0;
	 Collections.reverse(result);
	 for (int i = p; i < p+ result.size(); i++) {
		sum += Math.pow(result.get(i-p), i);
	}
	 if(sum % number == 0) {
		 return sum/number;
	 }
	 else {
		 return -1;
	 }
 }
 
 public static boolean isPrime(long p) {
	 for (int i = 2; i <= p/2; i++) {
		if ( p%i == 0) {
			return false;
		}
		
	}
	 return true;
	 
 }
 
 
 public static long[] gap(int g, long m, long n) {
	 int count = 0;
	 long num1 = 0;
	 long num2 = 0;
	 for (long j = m; j <= n; j++) {
		if ( Codewars.isPrime(j)  && count == 0) {
			num1 = j;
			count = 1;
		}
		else if ( Codewars.isPrime(j) && count == 1) {
			num2 = j;
			count = 2;
		}
		
		if (count == 2 && num2 - num1 == g) {
			return new long[] {num1 , num2};
		}
		else if (count == 2) {
			num1 = num2;
			count = 1;
		}
		
	}
	 return null;
    	 
    	 
    	 
//		long j = i + g;
//		if (Codewars.isPrime(i) && Codewars.isPrime(j)) {
//			
//			return new long[] { i , j };
//		}
		
	}
 }
	

