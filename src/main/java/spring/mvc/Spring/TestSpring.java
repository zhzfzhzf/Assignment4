package spring.mvc.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.mvc.Bean.TestBean;

public class TestSpring {
    public static void main(String[] args){


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = context.getBean("testBean",TestBean.class);

        System.out.println(testBean.toString());
    }
}
