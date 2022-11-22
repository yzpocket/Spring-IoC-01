package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import ex03.MessageBean;
/* 스프링 컨테이너 : 빈을 관리한다.
 * 			     스프링 컨테이너는 빈 객체를 저장하고 있으며, 각 객체간의 의존 관계를 관리해준다.
               BeanFactory와 ApplicationContext가 컨테이너 역할을 수행하는 인터페이스
 * 1 BeanFactory (인터페이스)
 * 2 ApplicationContext (BeanFactory 를 상속받은 하위 인터페이스.)
 * 3 WebApplicationContext (인터페이스. 웹 어플리케이션을 위한 ApplicationContext다.
         하나의 웹어플(즉, 하나의ServletContext) 마다 한 개 이상의 WebApplicationContext를 가질 수 있다).
 * 
 * DI(dependency Injection) : 의존성 주입
 * 1 객체 간의 관계를 느슨하게 연결하도록 해주는 기능 중의 하나.
 * 2 참조되는 객체를 직접적으로 참조하는 객체에서 생성하지 않고 
 * 컨테이너에서 생성을 해서 사용하는 방법이다. 
 * 
 * 컨테이너 종류 다양하다.
 * FileSystemXmlApplicationContext  ==>xml 설정시 
 * ClassPathXmlApplicationContext	==>xml 설정시 
 * AnnotationConfigApplicationContext	==>자바로 설정시 
 */
public class HelloSpringApp {

	
	public static void main(String[] args) {
		//스프링 컨테이너 생성해서 mb1룩업 한 뒤 sayHello() 호출하기.
		String resource="src/main/java/ex04/appContext.xml";
		
		//스프링 컨테이너 
		ApplicationContext ctx=new FileSystemXmlApplicationContext(resource);

		
		//DL:(Dependency Lookup) 메모리에 올라가 있는 객체를 이름으로 찾는것
		Message msg=ctx.getBean("mb1", Message.class); //<<형변환 다른방법.
		msg.sayHello();
		msg.sayHi("BTS", "블랙핑크", "수지");
		
		Message msg2=ctx.getBean("mb2", Message.class); //<<형변환 다른방법.
		msg2.sayHello();
		msg2.sayHi("A", "B");
	}

}
