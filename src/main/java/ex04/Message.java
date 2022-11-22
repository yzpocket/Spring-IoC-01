package ex04;

public interface Message {
	void sayHello();
	void sayHi(String ... names);
	// ...은 매개변수를 자유롭게 넣을 수 있다. 1,2,3...n개까지
	//names 변수는 String[] 배열 타입
}
