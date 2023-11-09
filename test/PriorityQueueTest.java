import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

	/*
	 * Part 1: complete
	 */
	
	PriorityQueue pq;
	
	@Before
	public void setup(){
		pq = new PriorityQueue(20);
	}
	
	@Test
	public void insertTestMin() {
		//INSERTING SOME NUMBERS AND TESTING PQ.MIN()
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		assertEquals(1,pq.min());
	}
	
	@Test
	public void insertTestSize() {
		//INSERTING SOME NUMBERS AND TESTING PQ.SIZE()
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		assertEquals(3,pq.size());
	}

	@Test
	public void removeMinTest() {
		// STEP 1:ADDING FEW NUMBERS TO PQ
		pq.insert(1);
		pq.insert(2);
		pq.insert(3);
		//STEP 2:CALLING FEW TIMES PQ.REMOVEMIN()TO CHECK IT
		//NUMBERS WILL BE RETURNED IN ASCENDING ORDER
		assertEquals(1,pq.removeMin());
		assertEquals(2,pq.removeMin());
		assertEquals(3,pq.removeMin());
	}
	
	@Test(expected=PriorityQueueException.class)
	public void removeMinEmptyTest() {
		pq.removeMin();
	}
}