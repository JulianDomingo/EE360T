package pset1;
import static org.junit.Assert.*;
import org.junit.Test;


public class FibListRepOkTester {
	// INVALIDITY TESTS
	@Test public void t0() {

		// Test invalid sizes
		FibList fibList = new FibList();
		for (int newSize = 0; newSize < 3; newSize++) {
			fibList.size = newSize;
			assertFalse(fibList.repOk());
		}

		// Test fibonacci invalidity
		fibList = new FibList();
		fibList.header = new Node();
		fibList.header.elem = 1;
		fibList.header.next = new Node();
		fibList.header.next.elem = 1;
		fibList.header.next.next = new Node();
		fibList.header.next.next.elem = 3;

		assertFalse(fibList.repOk());

		// Test acyclic list
		fibList = new FibList();
		Node headerCopy = fibList.header;
		Node runner = fibList.header;

		while (runner.next != null) {
			runner = runner.next;
		}

		runner.next = headerCopy;

		assertFalse(fibList.repOk());
	}


	// VALIDITY TESTS
	@Test public void t1() {
		FibList fibList = new FibList();

		// Test fibonacci validity
		fibList = new FibList();
		assertTrue(fibList.header.elem == 1);
		assertTrue(fibList.header.next.elem == 1);

		Node operand1 = header.next;
		Node operand2 = operand1.next;
		Node runner = operand2.next;

		while (runnner != null) {
			assertTrue(operand1.elem + operand2.elem == runner.elem);
			operand1 = operand2;
			operand2 = runner;
			runner = runner.next;
		}

		// Test size validity
		fibList = new FibList();
		int size = 0;

		Node runner = fibList.header;

		while (runner.next != null) {
			size++;
			runner = runner.next;
		}

		assertTrue(size == fibList.size);
	}

}