package uebungen.uebung7;
import java.util.*;

//3. Implementieren Sie f�r Stadt das Interface Comparable<Stadt> so, 
//dass nach den Namen der St�dte sortiert wird. 
public class Stadt implements Comparable<Stadt>
{
	String name;
	List<Integer> bevoelkerung;
	float flaeche;

	public Stadt(String name, List<Integer> bevoelkerung, float flaeche)
	{
		super();
		this.name = name;
		this.bevoelkerung = bevoelkerung;
		this.flaeche = flaeche;
	}

	void print()
	{
		System.out.printf("%-15s %9.2f km2 ", name, flaeche);
		for(Integer i : bevoelkerung)
		{
			System.out.printf("%,12d", i);
		}
		System.out.println();
	}

	@Override
	public boolean equals(Object o)
	{
		if(o==null) return false;
		if(o==this) return true;
		if(this.getClass()!=o.getClass()) return false;

		Stadt other = (Stadt)o;
		return (this.name.equals(other.name));
	}

	@Override
	public int hashCode()
	{
		return this.name.hashCode();
	}


	//3. �ndern Sie compareTo() in Stadt so, dass nach den Namen der 
	//St�dte sortiert werden kann.  

	//4. �ndern Sie compareTo() in Stadt so, dass die Namen der 
	//St�dte absteigend sortiert werden 

	//5. �ndern Sie compareTo() in Stadt so, 
	//dass die St�dte absteigend nach ihrer Fl�che sortiert werden.

	//Beispiel aus dem Script
	//@Override
	//public int compareTo(Circle o) {
	//  if(this.radius > o.radius) return 1;
	//  else if(this.radius < o.radius) return -1;
	//  else return 0; // this.radius == o.radius
	//}     
	public int compareTo(Stadt s)
	{
//		return -(this.name.compareTo(s.name));
		if(this.flaeche>s.flaeche) return -1;
		else if(this.flaeche<s.flaeche) return 1;
		else return 0; // this.fl�che == s.fl�che
//		 return this.flaeche < o.flaeche ? 1: (this.flaeche == o.flaeche ? 0 : -1);

		
	}
}
