package aufgaben.aufgabe6;

public abstract class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = 1000;
		Integer b = 1000;       
		Integer c = 1000;       
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(b.longValue()==c.longValue());
		/*
		 * b==C = false ist weil es nicht auf das gleiche Objekt zeigt sondern nur den gleichen Value hat
		 */
		
		
	}

}
