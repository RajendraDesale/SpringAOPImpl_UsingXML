package com.example.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class EmployeeCRUDLoggingAspect {

	public void logBefore(JoinPoint joinPoint) {
		System.out.println("1.EmployeeCRUDAspect.logBefore() : " + joinPoint.getSignature().getName());
	}

	public void logAfter(JoinPoint joinPoint) {
		System.out.println("2.EmployeeCRUDAspect.logAfter() : " + joinPoint.getSignature().getName());
	}

	public void logAfterReturingAllMethods(Object retVal) throws Throwable {
		System.out.println("3.LoggingAspect.logAfterReturingAllMethods() " + retVal);
	}

	public void logAfterThrowingAllMethods(Exception ex) throws Throwable {
		System.out.println("4.LoggingAspect.logAfterThrowingAllMethods() " + ex);
	}

	public void logAroundAllMethods(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("5.LoggingAspect.logAroundAllMethods() - Before method call");
		pjp.proceed();
		System.out.println("6.LoggingAspect.logAroundAllMethods() - After method call");
	}
}
