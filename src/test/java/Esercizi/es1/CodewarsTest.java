package Esercizi.es1;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CodewarsTest {

	@Test
	public void test() {
		Codewars cod = new Codewars();
		int actual = 345;
		int expected = 91625;
		assertThat(expected, is(cod.squareDigits(actual)));
	}

	@Test
	public void testGame() {
		Codewars cod = new Codewars();
		assertEquals(5, cod.countBits(1234));
		assertEquals(1, cod.countBits(4));
		assertEquals(3, cod.countBits(7));
		assertEquals(2, cod.countBits(9));
		assertEquals(2, cod.countBits(10));
	}

	private void testing(int actual, int expected) {
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		Codewars cod = new Codewars();
		System.out.println("Fixed Tests maxBall");
		testing(cod.maxBall(37), 10);
		testing(cod.maxBall(45), 13);
		testing(cod.maxBall(99), 28);
		testing(cod.maxBall(85), 24);
	}

	@Test
	public void test4() {
		Codewars cod = new Codewars();
		int[] act = new int[] { 5, 2, 1, 4, 3 };
		int[] expected = new int[] { 1, 2, 3, 4, 5 };
		int[] actual = cod.sort1(act);
		assertThat(actual, is(expected));
	}

	@Test
	public void testOneLevelTriangle() {
		Codewars cod = new Codewars();
		final int[] ints = { 1 };
		assertThat(cod.generate(1), is(ints));
	}

	@Test
	public void testTwoLevelsTriangle() {
		Codewars cod = new Codewars();
		final int[] ints = { 1, 1, 1 };
		assertThat(cod.generate(2), is(ints));
	}

	@Test
	public void testthreeLevelsTriangle() {
		Codewars cod = new Codewars();
		final int[] ints = { 1, 1, 1, 1, 2, 1 };
		assertThat(cod.generate(3), is(ints));
	}

	@Test
	public void test5() {
		Codewars cod = new Codewars();
		final int[] ints = { 1, 2, 3, 4, 5 };
		int[] actual = new int[] { 5, 3, 1, 2, 4 };
		assertThat(cod.sort2(actual), is(ints));
	}

	private static void testing(long actual, long expected) {
		
		long r = Math.abs(actual - expected);
		boolean inrange = r <= 1;
		if (inrange == false) {
			DecimalFormat df = new DecimalFormat("#.0");
			System.out.println("abs(actual - expected) must be <= 1 but was " + df.format(r));
		}
		assertEquals(true, inrange);
	}

	@Test
	public void test1() {
		Codewars cod = new Codewars();
		System.out.println("Fixed Tests: Epidemic");
		int tm = 18;
		int n = 432;
		int s0 = 1004;
		int i0 = 1;
		double b = 0.00209;
		double a = 0.51;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 420);
		tm = 12;
		n = 288;
		s0 = 1007;
		i0 = 2;
		b = 0.00206;
		a = 0.45;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 461);
		tm = 13;
		n = 312;
		s0 = 999;
		i0 = 1;
		b = 0.00221;
		a = 0.55;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 409);
		tm = 24;
		n = 576;
		s0 = 1005;
		i0 = 1;
		b = 0.00216;
		a = 0.45;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 474);
		tm = 24;
		n = 576;
		s0 = 982;
		i0 = 1;
		b = 0.00214;
		a = 0.44;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 460);
		tm = 20;
		n = 480;
		s0 = 1000;
		i0 = 1;
		b = 0.00199;
		a = 0.53;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 386);
		tm = 28;
		n = 672;
		s0 = 980;
		i0 = 1;
		b = 0.00198;
		a = 0.44;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 433);
		tm = 14;
		n = 336;
		s0 = 996;
		i0 = 2;
		b = 0.00206;
		a = 0.41;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 483);
		tm = 13;
		n = 312;
		s0 = 993;
		i0 = 2;
		b = 0.0021;
		a = 0.51;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 414);
		tm = 28;
		n = 672;
		s0 = 999;
		i0 = 1;
		b = 0.00197;
		a = 0.55;
		testing(cod.epidemic(tm, n, s0, i0, b, a), 368);
	}

}
