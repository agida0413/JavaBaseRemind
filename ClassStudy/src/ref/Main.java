package ref;

public class Main {
public static void main(String[] args) {
	Student student1=new Student();
	initStudent(student1, "학생", 15);
	
	
	Student student2=new Student();
	initStudent(student2, "학생2", 17);
	
	
	printStudent(student1);
	printStudent(student2);
}

static void initStudent(Student student,String name,int age) {
	student.name=name;
	student.age=age;

}

static void printStudent(Student student) {
	System.out.println("이름:"+student.name+"나이:"+student.age);
}
}
