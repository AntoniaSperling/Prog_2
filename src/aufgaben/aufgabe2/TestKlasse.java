package aufgaben.aufgabe2;

public class TestKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInteger mi1;
		MyInteger mi2;
		MyInteger mi3;
		
		try {
			mi1 = new MyInteger(5);
			System.out.println("mi1: " +mi1.intValue());
			System.out.println("mi1: " +mi1.doubleValue());
			System.out.println(mi1.toString());
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("mi1: " +e.getMessage());
		}
		try {
			mi2 = new MyInteger("-0021");
			System.out.println("mi2: " +mi2.intValue());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("mi2: " +e.getMessage());
		}
		try {
			mi3 = new MyInteger("hallo");
			System.out.println("mi3: " +mi3.intValue());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("mi3: " +e.getMessage());
		}
		
		mi1 = new MyInteger("-000020");
		mi2 = new MyInteger(-20);
		System.out.println(mi1.equals(mi2));
		System.out.println(mi2.hashCode());
		System.out.println(MyInteger.valueOf(2));
		System.out.println(MyInteger.valueOf(2147483646));
	
		
	}

}
