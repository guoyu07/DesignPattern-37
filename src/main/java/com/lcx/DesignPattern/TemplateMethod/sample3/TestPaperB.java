package com.lcx.DesignPattern.TemplateMethod.sample3;

public class TestPaperB extends TestPaper {
	@Override
	public String answer1() {
		return "c";
	}

	@Override
	public String answer2() {
		return "a";
	}

	@Override
	public String answer3() {
		return "a";
	}
}
