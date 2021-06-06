package uebungen.uebung7;

public class MyInteger implements Comparable<MyInteger> {
	
	//6. Implementieren Sie f�r MyInteger das Interface Comparable<MyInteger> so, 
	//dass nach den Gr��en der Werte sortiert wird. 
		    private int value;

	    public MyInteger(int value)
	    {
	        this.value = value;
	    }

	    public int intValue()
	    {
	        return this.value;
	    }

	    public static MyInteger valueOf(int value)
	    {
	        return new MyInteger(value);
	    }

	    //7. �ndern Sie compareTo() in MyInteger so, dass 
	    //die Werte der Schl�ssel absteigend sortiert werden.
	    //Beispiel aus dem Script f�r AUFsteigend sortiert:
	    //public int compareTo(Rectangle o) {
	        //  int diff = (this.height+this.width) - (o.height+o.width);
	        //  return diff;
	        //}
	   @Override
	    public int compareTo(MyInteger o)
	   {

		   return -(this.value - o.value); 
//		  return this.value < o.value ? 1: (this.value == o.value ? 0 : -1);

	    }


}
