
// editPlus����ɫ�ǹؼ���
// ��ɫ�Ǳ�ʶ��
// System.out.println("Hello World!"); 
// ���ϴ����У�System��out��println���Ǳ�ʶ����
// �� editplus�еĺ�ɫ���壬��ʾ�������SUN��JDKд�õ�һ���ࡣ
public class Test{

	// ��̬����
	static Student stu = new Student();

	// ���
	public static void main(String[] args){
		
		//���Ϊ����
		Student s = Test.stu;
		s.exam();

		//�ϲ�����
		Test.stu.exam();

		System.out.println("Hello World!");
	}
}

class Student{

	// ʵ������
	public void exam(){
		System.out.println("���ԡ���������");
	}
}