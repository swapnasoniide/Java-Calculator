package demo.calc.calculation;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import demo.calc.bean.CalcBean;
import demo.calc.constant.Operators;

public class TestDivision {

	@Test
	public void test() {
		CalcBean calcBean = new CalcBean();
		calcBean.setOperator(Operators.valueOf("div").createInstance());
		calcBean.getOperands().add(new BigDecimal(20));
		calcBean.getOperands().add(new BigDecimal(2));
		BigDecimal result = calcBean.getOperator().calculate(calcBean);
		Assert.assertTrue(new BigDecimal(10).compareTo(result) == 0);
	}

}
