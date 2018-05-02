import io.dts.client.annotation.DtsTransaction;
import io.dts.client.api.impl.DefaultDtsTransactionManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class HelloWorld {

	private String message;

  @Transactional
	public void sayHello() {
		System.out.println("tx---" + message);
	}

  @DtsTransaction
	public void sayHello2() {
		System.out.println("dts---" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans-dts.xml");
			HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
			obj.sayHello();
			obj.sayHello2();
		} finally {
			System.exit(0);
		}
	}

}

