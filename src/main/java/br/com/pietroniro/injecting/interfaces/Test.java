package br.com.pietroniro.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("injectinginterfaces.xml");
        OrderBO orderBO = (OrderBO) ctx.getBean("bo");
        orderBO.placeOrder();
    }
}
