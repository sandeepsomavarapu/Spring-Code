package foo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bar {
	private String test;

	public static void main(String[] args) 
	{
		ApplicationContext bf = new ClassPathXmlApplicationContext("mapper.xml");
		bf.getBean("bar");
	}

	public Bar() {
		System.out.println("Bar()");
	}

	public Bar init() {
		System.out.println("init()");
		return this;
	}

	public void setTest(String test) {
		this.test = test;
		System.out.println("setTest(String test)");
	}
}
