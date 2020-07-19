package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLogic implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("After executing "+ arg1.getName()+"() with "+arg2.length+" parameters");	
	}
}
