package com.cgh.review;
import java.util.Objects;

public class Ex_Animal {
	//Animal클래스를 선언하고
	//이름, 몸무게, 나이, 종류
	//뽀삐, 5.3,10,강아지
	//야옹이, 4.2,5,고양이
	//킥킥이, 15.3,3,원숭이
	//하하, 200.2,9,하마
	//ArrayList에 저장하고
	//1. 전체 데이터 출력
	//2. 이름, 나이, 몸무게만 출력(전체)
	//3. 몸무게 10kg이상인 동물의 이름, 종류, 몸무게 출력
	//4. 나이가 5살이상인 동물의 이름, 나이 출력
	//5. 저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력
	//6. 하하 200.2 10 하마와 동일한 객체 리스트에서 삭제하기
	//7. 이름이 킥킥이인 동물을 찾아서 삭제하기
	private String name;
	private double weight;
	private int age;
	private String type;
	public Ex_Animal() {
		// TODO Auto-generated constructor stub
	}
	public Ex_Animal(String name, double weight, int age, String type) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", age=" + age + ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, type, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex_Animal other = (Ex_Animal) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(type, other.type)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
}
