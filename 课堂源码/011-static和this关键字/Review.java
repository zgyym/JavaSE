/*
	��ĿǰΪֹһ���൱�п��Գ��ֵģ�
		����{
			ʵ������;
			ʵ������;

			��̬����;
			��̬����;

			���췽��;

			��̬�����;
			ʵ������;

			����(){
				// �ֲ�����
				int i = 100;
			}
		}
*/
public class Review{ // ��
	// ����ػ����У��������ģ��ڳ���ִ��֮ǰ��������Ҫ���ص���ȫ�����ص�JVM���С�
	// ����ɼ��زŻ�ִ��main������
	static{
		System.out.println("Review�����ʱִ�У�");
	}

	// ���
	// ��̬����
	public static void main(String[] args){
		// �ֲ�����
		int i = 100;

		// ���һ�������һ����������
		// һ��ѧ���ڽ�����ѧϰ��ѧϰ���֮��ȥ�����Է���
		Student s1 = new Student();

		// ��ѧϰ�����е���ѧϰ���ʵ��������
		s1.study();

		Student s2 = new Student();
	}

}

// ѧ����
class Student{

	static{
		System.out.println("Student�����ʱִ�У�");
	}

	// ѧ��
	private int no; // ʵ������
	// ����
	private String name;

	// ѧ���о�̬������
	// �༶�������
	static String job = "ѧϰ";

	{
		System.out.println("ʵ�����飬���췽��ִ��һ�Σ������ִ��һ�Σ�");
	}

	// ���췽��
	public Student(){
		// ��������޲����Ĺ��췽����Ĭ�ϴ�����ѧ��ѧ����100��������zhangsan
		this(100, "zhangsan"); // this() ������Ҳʹ���ˡ�
	}
	public Student(int no, String name){
		this.no = no; // ����ʹ����this
		this.name = name;
	}

	// ��װ
	// setter and getter����
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNo(int no){
		this.no = no;
	}
	public int getNo(){
		return no;
	}

	// �ṩ����ʵ������
	public void study(){
		// ˽�е��ǿ����ڱ����з��ʵġ����������б���ʹ��set��get������
		//System.out.println(this.name + "����Ŭ����ѧϰ!");
		//System.out.println(name + "����Ŭ����ѧϰ!");

		// ��ʵ�������е��ñ���������ʵ��������
		System.out.println(this.getName() + "����Ŭ����ѧϰ!");
		//System.out.println(getName() + "����Ŭ����ѧϰ!");

		// ����ִ�е��˴���ʾѧϰ����ˣ�ȥ�Է���
		//this.eat();		
		// this.����ʡ��
		// ��������⵽eat()������ʵ�����������Զ���eat()����ǰ��� this.
		eat();
	}
	
	public void eat(){ // ʵ������
		System.out.println(this.getName() + "�ڲ����Է��أ�����");

		// ���þ�̬m1()����
		// ��̬����ʹ�á�����.���ķ�ʽ����
		// Student.m1();

		// ����. ����ʡ���𣿿��ԡ�
		// java���������Զ���m1()����֮ǰ��ӡ�����.������Ϊ��⵽m1()������һ����̬������
		m1();
	}


	// �ṩ������̬����
	public static void m1(){
		System.out.println("Student's m1 method execute!");
		// ����m2()����
		//Student.m2();
		m2();
	}

	public static void m2(){
		System.out.println("Student's m2 method execute!");
		System.out.println("�������ʣ�" + job);
		// ��������⵽job��һ����̬����������������Զ���jobǰ��ӣ�Student.
		//System.out.println("�������ʣ�" + Student.job);
	}
}
