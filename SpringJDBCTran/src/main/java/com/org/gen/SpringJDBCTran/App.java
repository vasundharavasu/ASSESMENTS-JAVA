package com.org.gen.SpringJDBCTran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringModule.xml");
        CustomerDAO customerDAO = (CustomerDAO)context.getBean("CustomerDAO");
        Customer customer = new Customer(1,"abc",20);
        customerDAO.insert(customer);
        Customer customer1 = customerDAO.findByCustomerid(1);
        System.out.println(customer1);
       ( (AbstractApplicationContext) context).close();
    }
}
