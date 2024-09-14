package calculator;

public class CalculatorModel {
	// 計算を行うメソッド
	public double calculate(double num1, double num2, String operator) {
		double result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				throw new ArithmeticException("0で割ることはできません。");
			}
			break;
		default:
			throw new IllegalArgumentException("無効な演算子です。");
		}
		return result;
	}
}