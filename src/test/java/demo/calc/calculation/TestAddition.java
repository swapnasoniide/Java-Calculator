package demo.calc.calculation;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import demo.calc.bean.CalcBean;
import demo.calc.constant.Operators;

public class TestAddition {

	@Test
	public void test() {
		CalcBean calcBean = new CalcBean();
		calcBean.setOperator(Operators.valueOf("add").createInstance());
		calcBean.getOperands().add(new BigDecimal(53.876));
		calcBean.getOperands().add(new BigDecimal(61.876));
		BigDecimal result = calcBean.getOperator().calculate(calcBean);
		Assert.assertTrue(new BigDecimal(115.752).compareTo(result) == 0);
	}

}
