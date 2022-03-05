package com.met.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.config.JavaConfiguration;
import com.met.model.JavaDotNetTrainer;
import com.met.model.Trainer;
import com.met.model.TrainingCompany;
import com.met.model.TrainingWorkshop;
import com.met.model.Workshop;

public class SpringTest {

	public static void main(String[] args) {
		
		/*try(ApplicationContext context = new ClassPathXmlApplicationContext("training.xml")){
			
		}*/
		
		
		
		//try(AbstractApplicationContext context  = new ClassPathXmlApplicationContext("training.xml")){
		
		try(AbstractApplicationContext context  = new AnnotationConfigApplicationContext(JavaConfiguration.class)){
		
			System.out.println("*************************Post initialization**************");
			
			Trainer trainer = context.getBean("javaTrainer1", Trainer.class);
			/*System.out.println(trainer);
			trainer.train();*/
			
			System.out.println(trainer.getClass());
			
			//Trainer trainer = context.getBean("javaTrainer1", Trainer.class);
			
			
			TrainingCompany trainingCompany = (TrainingCompany) context.getBean("metSolutions");
			/*System.out.println(trainingCompany);
			trainingCompany.conductTraining();*/
			
			
			Workshop trainingWorkshop = context.getBean("trainingWorkshop", Workshop.class);
			//TrainingWorkshop trainingWorkshop = context.getBean("trainingWorkshop", TrainingWorkshop.class);
			
			trainingWorkshop.conductWorkshop();
			
			
			System.out.println();
			System.out.println("***********************JavaDotNetTrainer******************************");
			
			JavaDotNetTrainer javaDotNetTrainer = context.getBean(JavaDotNetTrainer.class);
			System.out.println(javaDotNetTrainer.getClass());
			
			javaDotNetTrainer.train();
			
			
			
			
		}
		
		
		
		
	}
	
}
