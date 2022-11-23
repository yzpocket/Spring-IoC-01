package ex13;

import javax.annotation.Resource;
import javax.inject.Inject;

//
/* @Value :기본자료형, String 유형을 주입할 때 사용
 * @Autowired : byType으로 주입한다. 자료유형이 같은 객체가 있으면 주입한다. 찾는순서: 자료형> @Qualifier("빈이름")
 * @Resource  : byName으로 주입한다.  ==> pom.xml에 라이버리를 등록해야 사용 가능하다.
 * @Inject : ==>pom.xml에 라이브러리를 등록해야 사용 가능하다. byType> @Qualifier
 * 
 * */
public class ServiceImpl implements Service {

	//property
	/*@Autowired
	@Qualifier("emp1")*/
	@Resource(name="emp1")
	private Emp emp;
	
	//@Autowired
	@Inject
	private Member user;
	
	@Override
	public void test1() {
		System.out.println("----Emp 정보-----------------");
		System.out.println(emp);
	}

	@Override
	public void test2() {
		System.out.println("----Member 정보-----------------");
		user.showInfo();;
	}

}
