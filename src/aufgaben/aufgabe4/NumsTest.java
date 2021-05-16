package aufgaben.aufgabe4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NumsTest {
	
	int[] nums = {};
	int[] nums1 = {2,1,2};
	int[] nums2 = {2,2,1,1};
	int[] nums3 = {1,2,3,3,2,4};
	int[] nums4 = {5,3,44,5,6,3,44};

	@Test
	void test() 
	{
		
		assertTrue(-1==Nums.singleNumber(nums),"Kein Element gefunden");
		assertTrue(1==Nums.singleNumber(nums1), "1");
		assertTrue(-1==Nums.singleNumber(nums2), "Kein Element gefunden, kein einzelnes Element!");
		assertTrue(-1==Nums.singleNumber(nums3), "Nicht nur eine einzelnes Element!");
		assertTrue(6==Nums.singleNumber(nums4), "6");
	}

}
