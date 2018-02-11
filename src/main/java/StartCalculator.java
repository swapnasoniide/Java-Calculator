import java.math.BigDecimal;
import java.util.EnumSet;
import java.util.Scanner;

import demo.calc.bean.CalcBean;
import demo.calc.constant.Operators;
import demo.calc.util.Validator;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author swapna soni Main class to initialize calculator
 */
@Slf4j
public class StartCalculator {

	public static void main(String[] args) {

		boolean runAgain = false;
		BigDecimal result = new BigDecimal(0);
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		log.debug("-----Start of Calculation-----");
		do {
			CalcBean calcBean = new CalcBean();
			System.out.println("Enter the valid first number : ");
			BigDecimal firstNumber = Validator.isValidNumber(scanner);
			calcBean.getOperands().add(firstNumber);

			System.out.println("Enter the operator from below options: ");
			System.out.println();
			for (Operators operators : EnumSet.allOf(Operators.class))
				System.out.println(operators.toString() + "  (for " + operators.getId() + ")");
			String validOperator = Validator.isValidOperator(scanner);
			calcBean.setOperator(Operators.valueOf(validOperator).createInstance());

			System.out.println("Enter the second number : ");
			BigDecimal secondNumber = Validator.isValidNumber(scanner);
			calcBean.getOperands().add(secondNumber);

			result = calcBean.getOperator().calculate(calcBean);

			System.out.println("Answer : " + result);

			log.debug("-----End of Calculation-----");

			System.out.print("Do you want to try again?[Y/N] : ");
			runAgain = scanner.next().equalsIgnoreCase("Y");

		} while (runAgain);

		System.out.println("Program finished!");
		scanner.close();
	}

}
