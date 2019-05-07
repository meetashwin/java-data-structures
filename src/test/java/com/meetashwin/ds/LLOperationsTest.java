package com.meetashwin.ds;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LLOperationsTest {

	private Node[] testLLNodes;

    private static final Logger logger = LogManager.getLogger(LLOperationsTest.class);	

	@BeforeClass
	public static void setupTests() {
		logger.debug("Starting tests for LLOperations Class");
	}

	@Before
	public void setupNodes() {
		testLLNodes = new Node[4];
		testLLNodes[3] = new Node(15, null);
		testLLNodes[2] = new Node(4, testLLNodes[3]);
		testLLNodes[1] = new Node(2, testLLNodes[2]);
		testLLNodes[0] = new Node(5, testLLNodes[1]);
	}

	@Test
	public void testPrintLinkedList() {
		logger.info("Testing the print method of LLOperations");

		Node head_node = testLLNodes[0];
		LLOperations.printLinkedList(head_node);
	}

	@Test
	public void testAddToLinkedList() {
		logger.info("Testing the addToLinkedList method of LLOperations");
		Node head_node = testLLNodes[0];
		Node new_node = new Node(22, null);

		logger.info("LL after adding an element to the front");
		head_node = LLOperations.addToLinkedList(head_node, new_node);
		LLOperations.printLinkedList(head_node);
	}

	@After
	public void tearDownNodes() {
		testLLNodes = null;
		testLLNodes = new Node[4];
	}

	@AfterClass
	public static void teardownTests() {
		logger.debug("Finished tests for LLOperations Class");
	}	
}
