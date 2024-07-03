import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Dogdriver {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");
		Dog d=ac.getBean(Dog.class);
		System.out.println(d);
		System.out.println(d.breed);
		System.out.println(d.name);
		System.out.println(d.height);
		

	}

}
