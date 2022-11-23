package ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		//FileSystemXmlApplicationContext => xml설정시
		//ClassPathXmlApplicationContext => xml설정시 <<<=이것 사용하는 테스트
		//AnnotationConfigApplicationContext==> 자바로 설정시  
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex08/applicationContext.xml");
		
		Emp emp=ctx.getBean("empInfo2", Emp.class);
		System.out.println(emp);
		Service svc=ctx.getBean("svc",Service.class);
		svc.test1();

	}

}
