package com.lcx.DesignPattern.FactoryMethod.calc3;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		double result = getNumberA() / getNumberB();
		return result;
	}

}
