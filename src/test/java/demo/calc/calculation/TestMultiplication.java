package demo.calc.calculation;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import demo.calc.bean.CalcBean;
import demo.calc.constant.Operators;

public class TestMultiplication {

	@Test
	public void test() {
		CalcBean calcBean = new CalcBean();
		calcBean.setOperator(Operators.valueOf("mul").createInstance());
		calcBean.getOperands().add(new BigDecimal(53.876));
		calcBean.getOperands().add(new BigDecimal(61.876));
		BigDecimal result = calcBean.getOperator().calculate(calcBean);
		result = result.setScale(6, BigDecimal.ROUND_HALF_UP);
		Assert.assertEquals(new BigDecimal(3333.631376).setScale(6, BigDecimal.ROUND_HALF_UP), result);
	}

}
