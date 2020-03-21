package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Truck;

public class Client {

	public static void main(String[] args) {
		String fileName= "resources/spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(fileName);
		Truck t = (Truck)context.getBean("t");
		System.out.println(t.getTruckEngine().getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}
