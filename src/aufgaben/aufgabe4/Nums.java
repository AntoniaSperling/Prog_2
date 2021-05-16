package aufgaben.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Nums {

	public static int singleNumber(int[] nums)
	{
		List<Integer> single = new ArrayList<>();
		if(nums.length == 0)
		{
			System.out.println("Kein Element gefunden");
			return -1;
		}
		/*	for(int index = 0; index < nums.length; index++)
		{
			if(!single.contains(nums[index]))
			{
				single.add(nums[index]);
			}
		else
			{
				single.remove(nums[index]);
			}
		}*/
		for (int i : nums) {
			if (!single.contains(i)) {
				single.add(i);
			} else {
				single.remove(new Integer(i));
			}
		}
		if(single.size()==0) // keine Elemente
		{
			System.out.println("Kein Element gefunden, kein einzelnes Element!");
			return -1;
		}
		else if(single.size()>1) // mehrere einzelne Elemnent
		{
			System.out.println("Nicht nur eine einzelnes Element!");
			return -1;
		}
		else 
		{
			System.out.println(single.get(0));
			return single.get(0);
		}
	}
}


