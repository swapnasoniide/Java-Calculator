package demo.calc.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import demo.calc.calculation.Operator;
import lombok.Data;

/**
 * 
 * @author swapna soni
 * This bean to set operands and operator 
 */
@Data
public class CalcBean {
	private  List<BigDecimal> operands;
	private Operator operator;
	
	/**
	 * Method to return list of operands
	 * @return List<BigDecimal>
	 */
	public List<BigDecimal> getOperands() {
        if (operands == null) {
        	operands = new ArrayList<>();
        }
        return operands;
    }
}
