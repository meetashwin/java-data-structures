package com.meetashwin.ds;

public class ArrayOperations {

	/**
	* Check if the array has at least one pair of elements that matches the sum
	*/
	public static boolean checkIfSumInSortedArray(int[] sortedArray, int sum) {
		//Get the low and high indices
		int low = 0;
		int high = sortedArray.length - 1;

		boolean result = false;

		while (low < high) {
			int s = sortedArray[low] + sortedArray[high];

			if (s == sum) {
				result = true;
				break;
			} else if (s > sum) {
				--high;
			} else {
				++low;
			}
		}

		return result;
	}

	/**
	* Rotate the array by 'd' elements
	* For example, array of [1,2,3,4,5] and d=2, becomes [3,4,5,1,2]
	*/
	public static int[] rotateArray(int[] inputArray, int rotateBy) {
		int[] rotatedArray = new int[inputArray.length];

		// If the rotation is equal to the array size, then the rotated array is identical
		if (inputArray.length == rotateBy || rotateBy <= 0) {
			rotatedArray = inputArray;
		}

		// If rotate by is greater than array size, take the modulus for rotation
		if (rotateBy > inputArray.length) {
			rotateBy = rotateBy % inputArray.length;
		}

		// Populate first part of array
		int lastIndex = 0;
		for (int i=rotateBy, j=0; i < inputArray.length; ++i, ++j) {
			rotatedArray[j] = inputArray[i];
			lastIndex = j + 1;
		}

		//Popular second part of array
		for(int i=0, j=lastIndex; i < rotateBy; ++i, ++j) {
			rotatedArray[j] = inputArray[i];
		}

		return rotatedArray;
	}
}