package ex09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

//XML에 설정된 빈을 Java Config로 가져오기
// ==> @ImportResource 어노테이션을 붙여준다.

//@Configuration은 Config 클래스를 환경 설정으로 사용한다는 의미의 어노테이
@Configuration
@ImportResource("classpath:ex09/applicationContext.xml")
public class Config {
	//스프링은 기본적으로 빈을 singleton (단일 객체)로 생성한다.
	//@Scope(value ="singleton") ==>이 디폴트다. 그래서 아래 		Emp e=this.empInfo();
	//로 위 King까지 miller로 바뀐것.
	//@Scope(value ="prototype") 으로 매번 new에따라 새로운 객체를 생성한다.

	
	@Bean(name="e1")  // <<== <Bean id="e1" class="ex07.Emp/> 와 동일한표현.
	@Scope(value ="prototype")
	public Emp empInfo() {
		return new Emp("King","Research",5000);
	}
	
	//@Bean에 name속성을 주지 않으면 빈의 이름은 메서드 이름 empInfo2이 bean name이 된다.
	@Bean // <<== <Bean id="empInfo2" class="ex07.Emp/> 와 동일한표현.
	public Emp empInfo2() {
		Emp e=this.empInfo();
		e.setName("Miller");
		e.setDept("Operation");
		e.setSalary(4000);
		return e;
	}
	
	//Emp빈을 반환하는 메서드를 구성하세요
	@Bean
	public Emp empInfo3() {
		return new Emp("Scott","Analyst", 3500);
	}
	//ServiceImpl빈을 반환하는 메서드를 구성하세요
	@Bean
	public ServiceImpl service() {
		ServiceImpl s=new ServiceImpl();
		s.setEmp(this.empInfo3());
		return s;
	}
}

