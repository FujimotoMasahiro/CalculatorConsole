package calculator;

public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;

	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}

	public void run() {
		while (true) {
			try {
				// ユーザーから数値と演算子を取得																									
				double num1 = view.getNumber("最初の数を入力してください: ");
				String operator = view.getOperator();
				double num2 = view.getNumber("次の数を入力してください: ");

				// 計算を実行し、結果を表示																									
				double result = model.calculate(num1, num2, operator);
				view.displayResult(result);
			} catch (ArithmeticException | IllegalArgumentException e) {
				view.displayError(e.getMessage());
			}

			// 続行確認																									
			if (!view.askToContinue()) {
				break;
			}
		}
	}
}
