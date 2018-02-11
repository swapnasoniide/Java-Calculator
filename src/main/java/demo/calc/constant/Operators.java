package demo.calc.constant;

import java.util.function.Supplier;

import demo.calc.calculation.Addition;
import demo.calc.calculation.Division;
import demo.calc.calculation.Multiplication;
import demo.calc.calculation.Operator;
import demo.calc.calculation.Substraction;

/**
 * 
 * @author swapna soni This enum contains operators for calculation and return
 *         Specific operator object based on enum selection
 */
public enum Operators {
	add("Addition", Addition::new), sub("Substraction", Substraction::new), div("Division",
			Division::new), mul("Multiplication", Multiplication::new);

	private String id;
	private Supplier<?> supplier;

	/**
	 * Constructor
	 * @param id
	 * @param supplier
	 */
	private Operators(String id, Supplier<? extends Operator> supplier) {
		this.id = id;
		this.supplier = supplier;
	}

	/**
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @return supplier
	 */
	public Supplier<?> getSupplier() {
		return supplier;
	}

	/**
	 * 
	 * @return
	 */
	public Operator createInstance() {
		return (Operator) supplier.get();
	}
}
