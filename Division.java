package strategy;

public class Division implements Strategy {
	public int operate(int a, int b) {
		return a/b;
	}
}
