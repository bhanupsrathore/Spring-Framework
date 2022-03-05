package com.met.nonspring.test;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import com.met.model.JavaTrainer;
import com.met.model.METSolutions;
import com.met.model.Trainer;
import com.met.model.TrainingCompany;
import com.met.model.TrainingWorkshop;
import com.met.model.Workshop;

public class NonSpringTrainingTest {

	public static void main(String[] args) {
		
		/*List<String> subjects = new ArrayList<String>(3);
		subjects.add("OOP");
		subjects.add("JDBC");
		subjects.add("COLLECTIONS");
		
		
		Trainer javaTrainer = new JavaTrainer("Ajay", subjects);			//parametrized const
		*/
		
		
		List<String> subjects = new ArrayList<String>(3);
		subjects.add("JSP");
		subjects.add("Servlets");
		subjects.add("JNDI");
		
		
		Trainer javaTrainer1 = new JavaTrainer("Vijay", subjects);			//parametrized const
		
		
		METSolutions trainingCompany = new METSolutions();
		trainingCompany.setTrainer(javaTrainer1);							//Setter
		
		
		Workshop trainingWorkshop = new TrainingWorkshop(trainingCompany);	//parametrized const
		
		
		System.out.println("*******************Workshop started*******************");
		
		trainingWorkshop.conductWorkshop();
		
		
		
		
		
	}
	
	
	
}
