package demo.calc.util;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

import demo.calc.constant.Operators;

/**
 * class to validate user input
 * 
 * @author swapna soni
 *
 */
public class Validator {

	/**
	 * 
	 * @param scanner
	 * @return BigDecimal
	 */
	public static BigDecimal isValidNumber(Scanner scanner) {
		BigDecimal bigDecimal = null;
		boolean isValid = false;
		while (!isValid) {
			try {
				bigDecimal = scanner.nextBigDecimal();
				isValid=true;
				return bigDecimal;
			} catch (InputMismatchException e) {
				scanner.next();
				System.out.println("Error!! Please enter valid number");
			}
		}
		return bigDecimal;
	}

	/**
	 * 
	 * @param scanner
	 * @return
	 */
	public static String isValidOperator(Scanner scanner) {
		Operators operation = null;
		boolean isValid = false;
		while (!isValid) {
			try {
				operation = Operators.valueOf(scanner.next());
				isValid = true;
				return operation.name();
			} catch (IllegalArgumentException e) {
				System.out.println("Error!! Please enter valid operator from options");
			}
		}
		return operation.name();
	}
}
