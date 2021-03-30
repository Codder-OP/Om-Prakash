
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springss.xml");
		 context.registerShutdownHook();
		  BeanLifeCycle beanlife=(BeanLifeCycle) context.getBean("lifecycle");
		  beanlife.display();
		 
	}
}
