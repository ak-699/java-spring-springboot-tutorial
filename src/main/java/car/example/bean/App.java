package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load spring context from xml configuration file
        // ApplicationContext is a interface that represents that IOC container that manages the beans and dependencies
        // ClassPathXmlApplicationContext is implementation of ApplicationContext that loads context definition from a xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        // This object is managed by spring
        // use getBean method of context to get the bean by its id
        // typecast the bean returned by context
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}
