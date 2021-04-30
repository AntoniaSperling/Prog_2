package aufgaben.aufgabe2;

public class MyInteger {
	
	public static final int MAX_VALUE =  2147483647;
	public static final int MIN_VALUE = -2147483648;
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public MyInteger(String s) throws IllegalArgumentException
	{
		this.value = parseInt(s);
	}
	
	private static String keineNullen(String s)
	{
		while(s.charAt(0)== '0')
		{
			s=s.substring(1);
		}
		return s;
	}
	
	private static boolean zahlenImString(char c)
	{
		return (c=='0' || c=='1' || c=='2' || c=='3'  || c=='4' ||
				c=='5' || c=='6' || c=='7' || c=='8'  || c=='9');
	}
	
	private static boolean inputOk(String s)
	{
		for(int index = 0; index < s.length(); index++)
		{
			if(!zahlenImString(s.charAt(index)))
			{
				return false;
			}
		}
		return true;
	}
	
	private static int charIntoInt(char c)
	{
		int charAsciiValue = c;
		int intvalue = charAsciiValue-48; // 0 ist 48 bis 9 ist 57
		return intvalue;

	}
	
	public static int parseInt(String s) throws IllegalArgumentException
	{
		if(s.length() == 0) throw new IllegalArgumentException("Leere Eingabe");
		int value = 0;
		boolean negativ = false;
		if(s.charAt(0)== '+')
		{
			s=s.substring(1);
		}
		else if(s.charAt(0)== '-')
		{
			s=s.substring(1);
			negativ = true;
		}
		if(s.length()== 0) throw new IllegalArgumentException("Eingabe ist nur +/- aber keine Zahl!");
		s=keineNullen(s);
		if(!inputOk(s)) throw new IllegalArgumentException("Eingabe war keine Zahl!");
		
		int exponent = 1;
		for(int index = s.length()-1; index >= 0; index--)
		{
			value += charIntoInt(s.charAt(index))*exponent;
			exponent*=10;
		}
		
		if(negativ) return -value;
		else return value;
	}
	
//  5. Eine Objektmethode intValue(), die den Wert von value zurückgibt.
	
	public int intValue()
	{
		return this.value;
	}
	
//	6. Eine Objektmethode doubleValue(), die den Wert von value als double zurückgibt.
	public double doubleValue()
	{
		/*double d = 0.0;
		d = this.value;
		return d;*/
		return this.value;
	}
	
	public static MyInteger valueOf(int value)
	{
		return new MyInteger(value);
	}
	
	public static MyInteger valueOf(String s)
	{
		return new MyInteger(s);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}

}
