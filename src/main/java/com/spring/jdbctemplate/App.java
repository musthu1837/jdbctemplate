package com.spring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
        
        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
        boolean status1=dao.saveEmployeeByPreparedStatement(new Employee(105,"Vikas",35000));
        System.out.println(status1);
        System.out.println(dao.getAllEmployeesRowMapper());
//        int status=dao.updateEmployee(new Employee(102,"Musthafa",35000));
//        System.out.println(status);        
//        status=dao.deleteEmployee(new Employee(102,"Amit",35000));  
//        System.out.println(status);  
              
    }
}
