package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogic implements MethodBeforeAdvice{
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("Before executing "+arg0.getName()+"() with "+arg1.length+" parameters"); 
	} 
}
