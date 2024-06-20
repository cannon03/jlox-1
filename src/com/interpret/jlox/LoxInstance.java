package com.interpret.jlox;

public class LoxInstance {
	private LoxClass klass;
	
	LoxInstance(LoxClass klass){
		this.klass=klass;
	}
	
	@Override
	public String toString() {
		return klass.name+" instance";
	}
}
