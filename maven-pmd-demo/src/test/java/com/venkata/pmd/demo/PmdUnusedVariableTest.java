package com.venkata.pmd.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PmdUnusedVariableTest {

	@Test
	public void test() {
		PmdUnusedVariable pmdUnusedVariable=new PmdUnusedVariable();
		pmdUnusedVariable.setValue("Venkata");
		assertTrue(pmdUnusedVariable.show());
	}

}
