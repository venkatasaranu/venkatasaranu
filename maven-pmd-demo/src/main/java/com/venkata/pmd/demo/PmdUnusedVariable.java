package com.venkata.pmd.demo;

public class PmdUnusedVariable {
private String name; // Non used variable
private String value;
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
public boolean show(){
	System.out.println("Value is "+value);
	return true;
}
}
