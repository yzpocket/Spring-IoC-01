package ex02;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean mb=new MessageBeanEn();//new MessageBeanKo();
		mb.sayHello("소니");
		/*HelloApp이 MessageBeanKo객체를 사용(use)한다.
		 * ==> HelloApp이 MessageBean 인터페이스에 의존한다.
		 * En으로 변경하려면 ex1과 다르게 뒷부분만 주석처리하고=>다시생성하고=> 이런 과정이 있어야 한다.
		 * ex1보다 인터페이스 때문에 의존성이 조금 약해졌다. 다음 ex3에는 의존성이 더약한
		 * spring container (역제어) 를 볼 수 있다.
		 * */
	}

}
