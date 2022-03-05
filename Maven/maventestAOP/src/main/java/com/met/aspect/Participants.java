package com.met.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Participants {

	@Pointcut("execution(* *.train(..))")				//1 -> any return type
	public void training(){}							//2 -> any class
														//.. -> any number of arguments
	
	/*@Before("training()")
	public void takingSeats(){
		System.out.println("Participants are taking seats");
	}
	
	@Before("training()")
	public void switchOffPhones(){
		System.out.println("Participants are switching off mobile phones");
	}
	
	@AfterReturning("training()")														//commit
	public void trainingSuccess(){
		System.out.println("Training completed successfully");
	}
	
	@AfterThrowing("training()")														//Catch
	public void trainingFailure(){
		System.out.println("Training was failure");
	}
	
	
	@After("training()")																//Finally
	public void trainingCompleted(){
		System.out.println("Training was completed");
	}
	*/
	
	//@Around -> @Before +@AfterReturning +@AfterThrowing+@After
	
	
	@Around("training()")
	public void trainingProcess(ProceedingJoinPoint pjp){
		
		try{
			System.out.println("Participants are taking seats");						//Before
			System.out.println("Participants are switching off mobile phones");
			
			//invoke bussiness logic here 
			pjp.proceed();		
			
			System.out.println("Training completed successfully");						//AfterRetrning
			
		}catch(Throwable ex){
			System.out.println("Training was failure");									//@AfterThrowing
			
		}finally{
			System.out.println("Training was completed");								//@After
		}
	}
}
