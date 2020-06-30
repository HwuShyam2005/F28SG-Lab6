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
		// insert a few numbers then test pq.min()
		fail("not implemented yet");
	}
	
	@Test
	public void insertTestSize() {
		// insert a few numbers then test pq.size()
		fail("not implemented yet");
	}

	@Test
	public void removeMinTest() {
		// step 1: add a few numbers to pq
		
		// step 2: call pq.removeMin() to check numbers outputted
		//         in ascending order 
		fail("not implemented yet");
	}
	
	
	@Test(expected=PriorityQueueException.class)
	public void removeMinEmptyTest() {
		pq.removeMin();
	}
}	
