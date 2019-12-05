package com.meetashwin.ds;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StackOperationsTest {
	  private static final Logger logger = LogManager.getLogger(StackOperationsTest.class);

	  @Test
	  public void testPushAndPop() {
	  	//1. Create a Stack
	  	StackOperations sop = new StackOperations();

	  	//2. Push elements {1, 4, 3} into the stack
		sop.push(1);
		sop.push(4);
		sop.push(3);

		assertFalse(sop.isEmpty());

	  	//3. Pop 2 elements from the stack
	  	assertEquals(sop.pop(), 3);
	  	assertEquals(sop.pop(), 4);

	  	//4. Push element {7} into the stack
		sop.push(7);

	  	//5. Pop 1 element fromt he stack
		  assertEquals(sop.pop(), 7);


	  	logger.info("Finished executing testPushAndPop");
	  }
}