package strategy;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	private Map<String, Strategy> operaciones = new HashMap<>();
	
	public void registro(String op, Strategy dp)
	{
		operaciones.put(op, dp);
	}
	
	public int execute(String op, int a, int b)
	{
		Strategy sl = operaciones.get(op);
		return sl.operate(a, b);
	}

}
