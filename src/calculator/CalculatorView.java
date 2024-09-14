package calculator;

import java.util.Scanner;

public class CalculatorView {
	private Scanner scanner = new Scanner(System.in);

	// ユーザーから数値を取得																									
	public double getNumber(String prompt) {
		System.out.print(prompt);
		return scanner.nextDouble();
	}

	// ユーザーから演算子を取得																									
	public String getOperator() {
		System.out.print("演算子を入力してください (+, -, *, /): ");
		return scanner.next();
	}

	// 結果を表示																									
	public void displayResult(double result) {
		System.out.println("計算結果: " + result);
	}

	// エラーメッセージを表示																									
	public void displayError(String message) {
		System.out.println("エラー: " + message);
	}

	// 続行確認																									
	public boolean askToContinue() {
		System.out.print("続けますか？ (y/n): ");
		String answer = scanner.next();
		return answer.equalsIgnoreCase("y");
	}
}
