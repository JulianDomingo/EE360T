package pset1;
import static org.junit.Assert.*;
import org.junit.Test;

public class FibListAugmentTester {
	@Test public void test0() {
		FibList l = new FibList();
		assertTrue(l.repOk());
		l.augment();
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		assertTrue(l.header != null);

		Node operand2 = l.header;
		Node operand1 = operand2.next;
		Node runner = operand1.next;

		int size = 3;

		while (runner != null) {
			assertTrue(operand1.elem + operand2.elem == runner.elem);
			operand2 = operand1;
			operand1 = runner;
			runner = runner.next;
			size++;
		}

		assertTrue(l.size == (size - 1));
	}

	@Test public void test1() {
		FibList l = new FibList();
		assertTrue(l.repOk());                     
		l.augment();
		assertTrue(l.repOk());
		l.augment();
		assertTrue(l.repOk());
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		assertTrue(l.header != null);

		Node operand2 = l.header;
		Node operand1 = operand2.next;
		Node runner = operand1.next;

		int size = 3;

		while (runner != null) {
			assertTrue(operand1.elem + operand2.elem == runner.elem);
			operand2 = operand1;
			operand1 = runner;
			runner = runner.next;
			size++;
		}

		assertTrue(l.size == (size - 1));

	}
}