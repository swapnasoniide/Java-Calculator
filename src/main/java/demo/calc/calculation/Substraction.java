package demo.calc.calculation;

import java.math.BigDecimal;

import demo.calc.bean.CalcBean;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author swapna soni
 *
 */
@Slf4j
public class Substraction implements Operator{

	@Override
	public BigDecimal calculate(CalcBean calcBean) {
		// TODO Auto-generated method stub
		log.debug("substraction of operands");
		return calcBean.getOperands().get(0).subtract(calcBean.getOperands().get(1));
	}
}