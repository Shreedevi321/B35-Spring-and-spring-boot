package dicollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionExecutor {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("collect.xml");

		Collectiondemo d = ap.getBean("def",Collectiondemo.class);
		d.display();
	}
}