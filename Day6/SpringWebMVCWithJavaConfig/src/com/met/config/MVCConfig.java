package com.met.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.met.model.Employee;


/*<tx:annotation-driven     -> @EnableTransactionManagement*/
/*<mvc:annotation-driven />   ->  @EnableWebMvc */


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.met.*")
@EnableWebMvc

public class MVCConfig {

	/*<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	<property name="prefix">
		<value>/WEB-INF/pages/</value>
	</property>
	<property name="suffix">
		<value>.jsp</value>
	</property>
</bean>  */
	
	
	
	@Bean
	public ViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/pages/");
		internalResourceViewResolver.setSuffix(".jsp");
		
		return internalResourceViewResolver;
	}
	
	
	/*<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<property name="driverClassName" value="oracle.jdbc.OracleDriver" />
		<property name="url" value="jdbc:oracle:thin:@localhost:1521:XE" />
		<property name="username" value="system" />
		<property name="password" value="admin123" />
	</bean>*/
	
	@Bean
	public DataSource dataSource(){
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("system");
		ds.setPassword("admin123");
		
		return ds;
		
	}
	
	
	/*<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
		<property name="dataSource" ref="dataSource"></property>
	</bean>*/
	
	@Bean
	public JdbcTemplate jdbcTemplate(){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		
		return jdbcTemplate;
		
	}
	
	/*<bean id="sessionFactoryBean" class="org.springframework.orm.hibernate4.LocalSessionFactoryBean">
	<property name="dataSource" ref="dataSource"></property>
	<property name="annotatedClasses">
		<list>
			<value>com.met.model.Employee</value>
		</list>
	</property>
	<property name="hibernateProperties">
		<props>
			<prop key="hibernate.dialect">org.hibernate.dialect.Oracle10gDialect</prop>
			<prop key="hibernate.show_sql">true</prop>
		</props>
	</property>
	</bean>*/
	
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean(){
		
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		
		sessionFactoryBean.setAnnotatedClasses(Employee.class);
		sessionFactoryBean.setHibernateProperties(getProperties());
		
		return sessionFactoryBean;
	}
	
	
	@Bean
	public Properties getProperties(){
		
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		properties.put("hibernate.show_sql", "true");
		
		return properties;
	}
	
	/*<bean id="hibernateTransactionManager" class="org.springframework.orm.hibernate4.HibernateTransactionManager">
		<property name="sessionFactory" ref="sessionFactoryBean"></property>
	</bean>*/
	
	@Bean
	public HibernateTransactionManager hbm(SessionFactory sf){
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sf);				//localSessionFactoryBean()
		
		return htm;
	}
	
	
}



















