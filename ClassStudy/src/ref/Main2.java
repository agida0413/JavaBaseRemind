package ref;

public class Main2 {

	public static void main(String[] args) {
	Student studnet1=	createStudent("학생3", 20);
	Student studnet2=	createStudent("학생4", 25);
		
	}
	
	static Student createStudent(String name, int age) {
		Student student=new Student();
		student.name=name;
		student.age=age;
		return student; //참조값을 반환 
	}
}

