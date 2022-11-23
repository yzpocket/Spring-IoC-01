package ex09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		//FileSystemXmlApplicationContext => xml설정시
		//ClassPathXmlApplicationContext => xml설정시 
		//AnnotationConfigApplicationContext==> 자바로 설정시  <<<=이것 사용하는 테스트

		ApplicationContext ctx=new AnnotationConfigApplicationContext(ex09.Config.class);
		Emp emp=ctx.getBean("emp", Emp.class); //xml에 등록한 빈 
		System.out.println(emp);
		
		Service svc=ctx.getBean("service", Service.class);
		svc.test1();
				
	}

}
