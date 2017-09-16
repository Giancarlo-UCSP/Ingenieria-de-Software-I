package strategy;

import java.util.Scanner;
package strategy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		calc.registro("+", new Suma());
		calc.registro("-", new Resta());
		calc.registro("*", new Multiplicacion());
		calc.registro("/", new Division());

		Porcentaje oper = new Porcentaje();
		oper.registro("+", new Suma());
		oper.registro("-", new Resta());
		oper.registro("*", new Multiplicacion());
		oper.registro("/", new Division());
		
		while (true)
		{
			int a=sc.nextInt();
			String op = sc.next();
			int b=sc.nextInt();
			if (op == "%")
				int c=oper.execute(a,b);
			else
				int c=calc.execute(op, a, b);
			System.out.println(c);
		}
		
	}

}
