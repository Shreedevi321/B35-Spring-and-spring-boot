package dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//program to demonstrate on DI in terms of literals

public class EmployeeExecutor {

	public static void main(String[] args) {
		BeanFactory b=new ClassPathXmlApplicationContext("beans.xml");
		employ e=b.getBean("e1",employ.class);
		/*e1.setId(101);
		e1.setEmpname("Shreedevi");*/
		e.display();
		
	 employ obj=b.getBean("e2",employ.class);
		obj.display();

	}

}