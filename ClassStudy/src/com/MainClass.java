package com;
import com.Student;
public class MainClass {

	public static void main(String[] args) {
		Student student1;
		student1= new Student(); //new Student() 의 반환값은 참조값이다.  student1 은 참조값을 가지고 있다.
	
		student1.name="학생";
		student1.age=15;
		student1.grade=90;
		
//		System.out.println(student1); //메모리주소(참조값) ex) x001
//		System.out.println(student1.age); //실제 객체 접근 x001에 있는 age에 접근해라 
		
		
			Student[] students= new Student[2];
			students[0]=student1;
			System.out.println("배열의 참조값 : "+students); //x005
			System.out.println("인스턴스의 참조값: "+students[0]); //x001
			
			//자바에서 대입은 항상 변수에 들어있는 값을 복사한다. 새로운 인스턴스 생성이 아니다.
			
			
			 int i=5;
			int k=i;// 기본형 타입에서는 메모리 주소를 저장하는것이 아닌 k 에 i의 값을 복사한다.
			i=6;//따라서 후에 값을 변경해도 k와 i의 값은 독립적이다.
			
			System.out.println(k);
			
			
			Student student2= student1;// 반면 참조형 타입은  =키워드를 통해 메모리주소를 복사한다. 
			System.out.println(student1);
			System.out.println(student2);  //따라서 같은 메모리 주소를 공유하고
			student1.age=110;
			System.out.println(student2.age); // 후에 값을 변경하면 같은메모리주소를 참조하기때문에 값이 변한다고 볼순없지만 같은 결과값을 가진다.
			
			
			
	}
	
}
