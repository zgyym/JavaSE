/*
(��װ)��֪һ���� Student �������£�
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
Ҫ��
	1����Student �����Զ���Ϊ˽�У����ṩget/set �����Լ��ʵ��Ĺ��췽����
	2��ΪStudent �����һ��getPostAddress ������Ҫ�󷵻�Student �����"��ַ"��"�ʱ�"��
	ע�⣺������˵�ĵ�ַ�ǣ�address�������ڴ��ַ��
*/
public class Homework3{
	public static void main(String[] args){

		Student s1 = new Student();
		System.out.println(s1.getName() + "��" + s1.getPostAddress());

		// ��ֵ
		s1.setName("zhangsan");
		s1.setAge(20);
		s1.setAddress("����������");
		s1.setZipcode("122222");
		s1.setMobile("12235224214");

		System.out.println(s1.getName() + "��" + s1.getPostAddress());

		Student s2 = new Student("����",18,"���ڱ�����","11111","456456456456465");
		System.out.println(s2.getName() + "��" + s2.getPostAddress());

	}
}

class Student{
	private String name;
	private int age;
	private String address;
	private String zipcode;
	private String mobile;

	public Student(){
	
	}
	public Student(String name, int age, String address, String zipcode, String mobile){
		this.name = name;
		this.age = age;
		this.address = address;
		this.zipcode = zipcode;
		this.mobile = mobile;
	}

	// ���ص�ַ���ʱ�
	public String getPostAddress(){
		return "��ַ��" + this.getAddress() + "���ʱࣺ" + this.getZipcode();
		//return "��ַ��" + this.address + "���ʱࣺ" + this.zipcode;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	public String getZipcode(){
		return zipcode;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return mobile;
	}

}