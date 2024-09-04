package com.example.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByName.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
// first configuration is loaded and lookedup
// spring sees there is a bean that needs to be created
// it sees it needs to set the property and sets the property using setter
// the first bean is done

// then it goes to second bean
// spring now needs to manage the second bean
// and it needs to be autowire it by name
// the name of the bean that needs to be wired to myCar object should be same as property name within car class
// so myCar class contains a property called specification
// spring will search for a bean with name same as property name
// do we have a bean that matches this name? yes
// then that bean is injected
// bean is injected to myClass using corresponding setter as it is autowired by name
// if no setter then there will be error