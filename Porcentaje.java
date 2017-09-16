package strategy;

import java.util.HashMap;
import java.util.Map;

public class Porcentaje {
	private Map<String, Strategy> operaciones = new HashMap<>();
	
	public void registro(String op, Strategy dp)
	{
		operaciones.put(op, dp);
	}
	
	public int execute(int a, int b)
	{
		Strategy s1 = operaciones.get("+");
		Strategy s2 = operaciones.get("-");
		Strategy s3 = operaciones.get("*");
		Strategy s4 = operaciones.get("/");
		int aT=s3.operate(2,a);
		int bT=s2.operate(aT-b);
		int cT=s1.operate(3,a);
		int dT=s4.operate(bT,cT);
		return dT;
	}
}

