/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

//import org.springframework.samples.petclinic.Test;
/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */

class Outer {

	int x = 100;

	class InnerClass {

		int y = 9;

	}

}

class NewEx {

	String ok = "fuck";

}

class NewExSub {

	public void sum(int a, int b) {
		int sum = 0, odd = 0, even = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
			if (i % 2 == 0) {
				even += i;
			}
			else {
				odd += i;
			}
		}
		System.out.println(a + "~" + b + "까지의 합 : " + sum);
		System.out.println(a + "~" + b + "까지의 짝수의 합 : " + even);
		System.out.println(a + "~" + b + "까지의 홀수의 합 : " + odd);
	}

}

class People {

	private String name;

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		this.name = newName;
	}

}

@SpringBootApplication(proxyBeanMethods = false)
public class PetClinicApplication {

	static void myStaticmeThod() {
		System.out.println("없이 부르기");
	}

	public void myPublicMethod() {
		System.out.println("public void 는 객체를 선언해줘야해");
	}

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
		// System.out.println("this is my grammar note");
		// String str = "ABC"; // String
		// Integer i = 123; // Integer
		// ArrayList<String> list = new ArrayList<String>(); // ArrayList
		// ArrayList<Integer> list1 = new ArrayList<>();

		// NewExSub ave = null;
		// ave = new NewExSub();
		// 클래스 사용하기1)
		// NewExSub ave = new NewExSub();
		// ave.sum(4, 5);

		// 클래스 사용하기2)
		// NewEx fuck = new NewEx();
		// System.out.println(fuck.ok);

		// Test sibal = new Test();
		// System.out.println(sibal.result());

		// Outer myOuter = new Outer();
		// Outer.InnerClass myInner = myOuter.new InnerClass();

		// System.out.println(myInner.y + myOuter.x);
		// list1.add(0);
		// list1.add(1);s
		// list1.add(3);
		// System.out.println(list1.get(0));
		// System.out.println(list1.get(1));
		// System.out.println(list1.get(2));

		// System.out.println(list1.get(0));
		// list1.add(0, 15);
		// for(int sub : list1){
		// System.out.println(" 값 : " + sub);
		// }

		// System.out.println(str.getClass().getName());
		// System.out.println(i.getClass().getName());
		// System.out.println(list.getClass().getName()); // Type 확인

		// list.add("글자만추가가능");
		// list.add("글자2");
		// list.add("글자");
		// System.out.println(list);
		// list.remove(0);
		// System.out.println(list);
		// list.clear();
		// System.out.println(list);

		// Fruit rhkdlf = new Fruit();

		// System.out.println(rhkdlf.Mango);

		// Car myMethod = new Car(2, "ss");

		// // myMethod.Method("가보자 가보자");

		// myMethod.fullexcel();
		// myMethod.speed(200);

		// Car myMethod1 = new Car(1, "벤츠");

		// myMethod1.fullexcel();

		// Car soCar = new Car(5);
		// System.out.println("쏘카는 : " + soCar.x);

		// Test tesT = new Test();

		// static 메소드는 오브젝트 없이 불를 수 있고
		// public void 메서드는 오브젝트 생성해야함
		// myStaticmeThod();

		// PetClinicApplication method = new PetClinicApplication();

		// method.myPublicMethod();

		Student obj = new Student();

		System.out.println(" Name : " + obj.fname);
		System.out.println(" Age : " + obj.age);
		System.out.println(" Graduation Year " + obj.graduationYear);
		obj.study();

		KindDog dog = new KindDog();

		System.out.println("발 갯수" + dog.leg);

		People obj1 = new People();

		obj1.setName("fuck");
		System.out.println(obj1.getName());

		//import java.util.Scanner;
		//Scanner Tobj = new Scanner(System.in);
		System.out.print("Enter Username : ");

		//String userName = Tobj.nextLine();
		//System.out.println("Username is : " + userName);

	}

}

class Vehicle{
	protected String brand;
	public void honk(){
		System.out.println("툿, 툿");
	}
}

class Taxi extends Vehicle{
	private String modelName;
	System.out.println(" 차 모델을 입력하세요 : "  );
	Scanner scan = new Scanner(System.in);
	modelName = scan.nextLine();
	System.out.println(" 차 모델 : " +modelName);
}