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
		Node currentNode = l.header;
		for (int node = 0; node < l.size; node++) {
			assertTrue(currentNode.elem == 0);
			currentNode = currentNode.next;
		}
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
		for (int node = 0; node < l.size; node++) {
			assertTrue(currentNode.elem == 0);
			currentNode = currentNode.next;
		}
	}
}