package org.spring.aop.api.impl;

import org.spring.aop.api.BizLogic;

public class BizLogicImpl implements BizLogic{

	@Override
	public String save() {
		System.out.println("BizLogicImpl:BizLogicImpl save.");
        return "BizLogicImpl save";
	}

	@Override
	public String saveEx() {
		System.out.println("BizLogicImpl:BizLogicImpl save.");
        throw new RuntimeException();
	}

}
