
public class CalcState {
	private int value; // value of current calculation
	
	CalcState() 
	{ 
		value = 0; 
	}
	
	public int clear() 
	{ 
		return value = 0; 
	}
	
	public int currentValue() 
	{ 
		return value; 
	}
	
	public void setVal(int a)
	{
		value = a;
	}

	public String addN(String x, String y, int radix){
		String g;
		value = Integer.parseInt(x, radix) + Integer.parseInt(y, radix);
		g = Integer.toString(value, radix);
		
		return g;
	}
	
	public String subN(String x, String y, int radix){
		String g;
		value = Integer.parseInt(x, radix) - Integer.parseInt(y, radix);
		g = Integer.toString(value, radix);
		
		return g;
	}
	
	public String mulN(String x, String y, int radix){
		String g;
		value = Integer.parseInt(x, radix) * Integer.parseInt(y, radix);
		g = Integer.toString(value, radix);
		
		return g;
	}
	
	public String divN(String x, String y, int radix){
		String g;
		value = Integer.parseInt(x, radix) / Integer.parseInt(y, radix);
		g = Integer.toString(value, radix);
		
		return g;
	}
	
	public String Convert(String x, int radix){
		String g;
		g = Integer.toString(value, radix);
		
		return g;
	}
	
}
