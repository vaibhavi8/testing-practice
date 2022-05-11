import static org.junit.Assert.*;

import org.junit.Test;
import hw5.Functions;
public class Prime {

	@Test
	public void test() {
		Functions f = new Functions();
		boolean isPrime = f.isPrime(2);
		assertTrue(isPrime);
	}
	@Test
	public void test1() {
		Functions f = new Functions();
		boolean isPrime = f.isPrime(8);
		assertTrue(isPrime);
	}
	@Test
	public void test2() {
		Functions f = new Functions();
		boolean isPrime = f.isPrime(13);
		assertTrue(isPrime);
	}
	@Test
	public void test3() {
		Functions f = new Functions();
		boolean isPrime = f.isPrime(7);
		assertTrue(isPrime);
	}
	@Test
	public void test4() {
		Functions f = new Functions();
		boolean isPrime = f.isPrime(22);
		assertTrue(isPrime);
	}
	@Test
	public void test5() {
		Functions f = new Functions();
		boolean isPrime = f.isPrime(21);
		assertTrue(isPrime);
	}
	

}
