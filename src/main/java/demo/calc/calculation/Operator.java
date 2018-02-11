package demo.calc.calculation;

import java.math.BigDecimal;

import demo.calc.bean.CalcBean;

/**
 * 
 * @author swapna soni
 *
 */
public interface Operator {
	/**
	 * 
	 * @param calcBean
	 * @return BigDecimal
	 */
	public BigDecimal calculate(CalcBean calcBean);
	
}
