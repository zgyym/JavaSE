
//���췽������������Constructor�����캯����
// ֻ����new�����ù��췽����
public class Student{

	String no;
	String name;

	// �޲����Ĺ��췽��
	public Student(){
	}
	public Student(String s){
		no = s;
	}
	/*
	public Student(String mingZi){
		name = mingZi;
	}
	*/
	public Student(String s1, String s2){
		no = s1;
		name = s2;
	}
}

//���췽���������ã���������  �����Ը�ֵ��

class StudentTest{
	public static void main(String[] args){
		Student s = new Student();
		Student s1 = new Student("100");
	}
}