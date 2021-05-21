package aufgaben.aufgabe5;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

	Set<Integer> numbers1;
	Set<Integer> numbers2;
	Set<Integer> both;
	
	SetOperations()
	{
		this.numbers1 = new TreeSet();
		this.numbers2 = new TreeSet();
		this.both = new TreeSet();
	}
	
	public void fill()
	{
		Random r = new Random();
		int number;
		for(int i = 0; i < 100; i++)
		{
			number = r.nextInt(100);
			this.numbers1.add(Integer.valueOf(number));
		}
		for(int i = 0; i < 100; i++)
		{
			number = r.nextInt(100);
			this.numbers2.add(Integer.valueOf(number));
		}
	}
	
	public void fillBothUnion()
	{
		this.fill();
		this.both.addAll(numbers1);
		this.both.addAll(numbers2);
	}
	
	public void fillBothIntersection()
	{
		this.fill();
		for(Integer i : this.numbers2)
		{
			if(this.numbers1.contains(i))
			{
				this.both.add(i);
			}
		}
	}
	
	public void fillBothDifference()
	{
		this.fill();
		this.both.addAll(numbers1);
		for(Integer i : this.numbers2)
		{
			if(this.numbers1.contains(i))
			{
				this.both.remove(i);
			}
		}
	}
	
	public void print()
	{
		char contains = '\u25cf';
		char not = '\u2009';
		int indexNumbers1 = 0;
		int indexNumbers2 = 0;
		int indexBoth = 0;
		int zahl = 10;
		for(int i = 0; i < 10; i++)
		{
			for(; indexNumbers1 < zahl; indexNumbers1++)
			{
				if(this.numbers1.contains(Integer.valueOf(indexNumbers1)))
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print("          ");
			for(; indexNumbers2 < zahl; indexNumbers2++)
			{
				if(this.numbers2.contains(Integer.valueOf(indexNumbers2)))
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print("          ");
			for(; indexBoth < zahl; indexBoth++)
			{
				if(this.both.contains(Integer.valueOf(indexBoth)))
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
			zahl+=10;
		}
	}
	
	
}
