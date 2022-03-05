package com.met.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.met.model.DotNetTrainer;
import com.met.model.JavaDotNetTrainer;
import com.met.model.JavaTrainer;
import com.met.model.Trainer;

/*<beans  -> @Configuration*/ 

/*<context:component-scan base-package="com.met.*"></context:component-scan>         -> @ComponentScan*/


@Configuration
@ComponentScan(basePackages="com.met.*")
@PropertySource("classpath:app.properties")
//@Lazy
public class JavaConfiguration {

	/*<bean id="javaTrainer1" class="com.met.model.JavaTrainer" >
		<constructor-arg name="name" value="Ajay"></constructor-arg>
		<constructor-arg name="subjects">
			<list>
				<value>OOP</value>
				<value>JDBC</value>
				<value>COLLECTIONS</value>
			</list>
		</constructor-arg>
	</bean>*/
	
	/*<bean -> @Bean*/
	
	
	@Value("${trainer1.name}")
	private String trainer1Name;
	
	@Value("#{${trainer1.subjects}}")
	private List<String> trainer1Subjects;
	
	
	@Value("${javaTrainer2.name}")
	private String trainer2Name;
	
	@Value("#{${javaTrainer2.subjects}}")
	private List<String> trainer2Subjects;
	
	@Bean
	/*@Scope("singleton")
	@Lazy*/
	public Trainer javaTrainer1(){						//methodName becomes id of bean
		/*List<String> subjects = new ArrayList<String>(3);
		subjects.add("OOP");
		subjects.add("JDBC");
		subjects.add("COLLECTIONS");
		
		
		Trainer javaTrainer = new JavaTrainer("Ajay", subjects);*/
		
		
		Trainer javaTrainer = new JavaTrainer(trainer1Name, trainer1Subjects);
		
		return javaTrainer;
		
	}
	
	
	/*<bean id="javaTrainer2" class="com.met.model.JavaTrainer">
		<constructor-arg name="name" value="Vijay"></constructor-arg>
		<constructor-arg name="subjects">
			<list>
				<value>JSP</value>
				<value>SERVLETS</value>
				<value>JNDI</value>
			</list>
		</constructor-arg>
	</bean>*/
	
	@Bean("javaTrainer2")
	public Trainer trainer(){
		Trainer javaTrainer2 = new JavaTrainer(trainer2Name, trainer2Subjects);
		
		return javaTrainer2;
		
	}
	
	
	@Value("${dotNetTrainer.name}")
	private String dotNetTrainerName;
	
	@Value("#{${dotNetTrainer.subjects}}")
	private List<String> dotNetTrainerSubjects;
	
	@Bean("dotNetTrainer")
	public Trainer dotNetTrainer(){
		
		Trainer trainer = new DotNetTrainer(dotNetTrainerName, dotNetTrainerSubjects);
		
		return trainer;
	}
	
	
	@Value("${javaDotNetTrainer.name}")
	private String javaDotNetTrainerName;
	
	@Value("#{${javaDotNetTrainer.subjects}}")
	private List<String> javaDotNetTrainerSubjects;
	
	@Bean
	public JavaDotNetTrainer javaDotNetTrainer(){
		
		JavaDotNetTrainer trainer = new JavaDotNetTrainer();
		trainer.setName(javaDotNetTrainerName);
		trainer.setSubjects(javaDotNetTrainerSubjects);
		
		return trainer;
		
	}
	
	/*@Scope
	@Lazy
	@Primary*/
	
}
