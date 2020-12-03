package Esercizi.es1;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.hamcrest.CoreMatchers.is;


import org.junit.Test;

public class CodewarsTest {

	@Test
	public void test() {
		Codewars cod = new Codewars();
		int actual = 345;
		int expected = 91625;
		assertThat( expected, is(cod.squareDigits(actual)));
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
    	int[] act = new int[] {5, 2, 1, 4, 3};
    	int[] expected = new int[] {1, 2, 3, 4, 5};
    	int[] actual = cod.sort1(act);
    	assertThat(actual,is(expected));
    }
    
        @Test
        public void testOneLevelTriangle() {
        	Codewars cod = new Codewars();
            final int[] ints = {1};
            assertThat(cod.generate(1), is(ints));
        }

        @Test
        public void testTwoLevelsTriangle() {
        	Codewars cod = new Codewars();
            final int[] ints = {1, 1, 1};
            assertThat(cod.generate(2), is(ints));
        }
        @Test
        public void testthreeLevelsTriangle() {
        	Codewars cod = new Codewars();
            final int[] ints = {1, 1, 1, 1, 2, 1};
            assertThat(cod.generate(3), is(ints));
        }
 
}
