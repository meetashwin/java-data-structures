package com.meetashwin.ds;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.Arrays;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ArrayOperationsTest {
	  private static final Logger logger = LogManager.getLogger(ArrayOperationsTest.class);

	  @Test
	  public void testCheckIfSumInSortedArrayExists() {
	  	//1. Create a sorted array
	  	int[] testArray = {1, 3, 5, 6, 7, 12, 14};

	  	//2. Create a sum to be tested
	  	int sum = 11;

	  	//3. Invoke the method
	  	boolean isExists = ArrayOperations.checkIfSumInSortedArray(testArray, sum);

	  	//4. Assert for True
	  	assertTrue(isExists);

	  	logger.info("Finished executing testCheckIfSumInSortedArrayExists");
	  }

	  @Test
	  public void testCheckIfSumInSortedArrayNotExists() {
	  	//1. Create a sorted array
	  	int[] testArray = {1, 3, 5, 6, 7, 12, 14};

	  	//2. Create a sum to be tested
	  	int sum = 5;

	  	//3. Invoke the method
	  	boolean isExists = ArrayOperations.checkIfSumInSortedArray(testArray, sum);

	  	//4. Assert for True
	  	assertTrue(!isExists);

	  	logger.info("Finished executing testCheckIfSumInSortedArrayNotExists");
	  }	  

	  @Test
	  public void testRotatedArray() {
	  	int[] testArray = {1, 2, 3, 4, 5};
	  	int rotateBy = 8;
	  	int[] rotationResultExpected = {4, 5, 1, 2, 3};

	  	int[] rotatedArray = ArrayOperations.rotateArray(testArray, rotateBy);

	  	assertTrue(Arrays.equals(rotatedArray, rotationResultExpected));
	  }
}