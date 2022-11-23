package ex06;
import java.util.*;
public class ServiceImpl implements Service {
	//property
	private List<String> list;
	private Map<String, Integer> map;
	private Set<String> set;
	private Properties prop;
	
	//setter ==> xml에서 <property>로 넣어야 한다.
	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public void test1() {	
		System.out.println("-------list--------------");
		for(String str:list) {
			System.out.println(str);
		}
	}

	@Override
	public void test2() {
		System.out.println("//////Map///////////////");
		Set<String> keySet=map.keySet();
		for(String str:keySet) {
			Integer val=map.get(str);
			System.out.println(str+"<-키값 : 밸류값->"+val);
		}
	}

	@Override
	public void test3() {
		System.out.println("-----------set--------------");
		for (String str: set) {
		System.out.println(str);
		}
	}

	@Override
	public void test4() {
		System.out.println("-------properties----------");
		System.out.println("user: "+prop.getProperty("user"));
		System.out.println("passwd: "+prop.getProperty("passwd"));
	}

}
