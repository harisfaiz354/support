package com.nt.advice;

import java.util.Arrays;
//some changes in aroundloggingadvice
<<<<<<< HEAD
//haris
//this is haris
=======


>>>>>>> 8018ff569a6a993be14ebca3b07fa6bee60c34e2
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		Object args[]=null;
		System.out.println("Entering into "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
		//changing arg value
		args=invocation.getArguments();
		if(((Float)args[0])<50000)
			args[1]=(Float)args[1]-0.5f;
		//controlling Target method execution
		 if(((Float)args[0])<=0 ||((Float)args[1]<=0) ||((Float)args[2]<0))
			 throw new IllegalArgumentException("provide valid inputs");
		 else
   		   retVal=invocation.proceed();
     		
		System.out.println("Leaving from "+invocation.getMethod().getName()+"with args"+Arrays.toString(invocation.getArguments()));
		return retVal;
	}

}
