package com.cgh.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListController_Ex_Animal {
	//Animal클래스를 선언하고
	//이름, 몸무게, 나이, 종류
	//"뽀삐", 5.3,10,"강아지"
	//"야옹이", 4.2,5,"고양이"
	//"킥킥이", 15.3,3,"원숭이"
	//"하하", 200.2,9,"하마"
	//ArrayList에 저장하고
	//1. 전체 데이터 출력
	//2. 이름, 나이, 몸무게만 출력(전체)
	//3. 몸무게 10kg이상인 동물의 이름, 종류, 몸무게 출력
	//4. 나이가 5살이상인 동물의 이름, 나이 출력
	//5. 저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력
	//6. 하하 200.2 10 하마와 동일한 객체 리스트에서 삭제하기
	//7. 이름이 킥킥이인 동물을 찾아서 삭제하기
	public static void main(String[] args) {
		ArrayList animals = new ArrayList();
		animals.add(new Ex_Animal("뽀삐", 5.3,10,"강아지"));
		animals.add(new Ex_Animal("야옹이", 4.2,5,"고양이"));
		animals.add(new Ex_Animal("킥킥이", 15.3,3,"원숭이"));
		animals.add(new Ex_Animal("하하", 200.2,9,"하마"));
		
		System.out.println("==== 1.전체 데이터 출력 ====");
		animals.forEach(System.out::println);
		
		
		System.out.println("\n\n==== 2.이름, 나이, 몸무게만 출력(전체) ====");
		animals.forEach(o-> System.out.println(  ((Ex_Animal)o).getName() +"\t"+ ((Ex_Animal)o).getAge() +"\t"+ ((Ex_Animal)o).getWeight()   ));
		
		
		
		System.out.println("\n\n==== 3.몸무게 10kg이상인 동물의 이름, 종류, 몸무게 출력 ====");
		animals.stream()
			.filter(o -> o instanceof Ex_Animal a && a.getWeight()>=10)
			.forEach(o-> System.out.println(  ((Ex_Animal)o).getName() +"\t"+ ((Ex_Animal)o).getType() +"\t"+ ((Ex_Animal)o).getWeight()   ));
		
		
		
		
		System.out.println("\n\n==== 4.나이가 5살이상인 동물의 이름, 나이 출력 ====");
		animals.stream()
			.filter(o -> o instanceof Ex_Animal a && a.getAge()>=5)
			.forEach(o-> System.out.println(  ((Ex_Animal)o).getName() +"\t"+ ((Ex_Animal)o).getAge()   ));


		
		System.out.println("\n\n==== 5.저장된 동물들의 나이를 한살씩 증가시키고 저장된 전체동물출력 ====");
		animals.forEach(o-> {
				((Ex_Animal)o).setAge(((Ex_Animal)o).getAge()+1);
				System.out.println(o);
				});
		
		
		System.out.println("\n\n==== 6.하하 200.2 10 하마와 동일한 객체 리스트에서 삭제하기 ====");
		Ex_Animal hippo = new Ex_Animal("하하",200.2,10,"하마");
		Iterator it = animals.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			if(o instanceof Ex_Animal) {
				Ex_Animal ani=(Ex_Animal)o;
				if(ani.equals(hippo))
					it.remove();
			}
		}
		animals.forEach(System.out::println);
		
		System.out.println("\n\n==== 6. 람다사용 버전(위에는 Iterator 사용버전. 둘중 하나 주석!) ====");
		List animals2;
		animals2 = animals.stream()
			.filter( o -> !(  ((Ex_Animal)o).equals(new Ex_Animal("하하",200.2,10,"하마"))  ) )
			.toList();
		//하마 빼고.. 나머지로 리스트를 새로 만듦.
		
		animals2.forEach(System.out::println);
		//새로 만든 리스트에 저장해서 7번에서 사용!
		
		
		System.out.println("\n\n==== 7.이름이 킥킥이인 동물을 찾아서 삭제하기 ====");
		animals2.stream()
			.filter( o -> !(  ((Ex_Animal)o).getName().equals("킥킥이")  ) )
			.toList().forEach(System.out::println);
			//킥킥이 빼고 나머지를 다시 출력
	}
}
