package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load spring context from xml configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
    }
}
