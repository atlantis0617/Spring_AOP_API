package org.spring.test;

import org.junit.Test;
import org.spring.aop.api.BizLogic;

public class TestSpringAOPAPI extends TestBase{
	
	
	/**
     * 通过构造器初始化spring配置文件
     */
    public TestSpringAOPAPI() {
         
        super("classpath:spring_aop_api.xml");
         
    }
    
    
    /**
     * 测试正常方法
     */
    @Test
    public void testSave() {
         
        BizLogic logic = (BizLogic) super.getBean("bizLogicImpl");
        logic.save();
         
    }
    
    /**
     * 测试存在异常的方法
     */
    @Test
    public void testsaveEx() {
         
        BizLogic logic = (BizLogic) super.getBean("bizLogicImpl");
        logic.saveEx();
         
    }
}
