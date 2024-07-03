import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class catDriver {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");
		cat c=ac.getBean(cat.class);
		System.out.println(c);
		System.out.println(c.getColor());
		System.out.println(c.getName());
		System.out.println(c.getAge());
	}	
}
