
// String����Ƚϵ�ʱ�����ʹ��equals������
public class Test04{
	public static void main(String[] args){
		/*
		Student s1 = new Student(111, "����������ׯ��С");
		Student s2 = new Student(111, "����������ׯ��С");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
		*/

		Student s1 = new Student(111, new String("����������ׯ��С"));
		Student s2 = new Student(111, new String("����������ׯ��С"));
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	}
}

class Student{
	// ѧ��
	int no; //�����������ͣ��Ƚ�ʱʹ�ã�==
	// ����ѧУ
	String school; //�����������ͣ��Ƚ�ʱʹ�ã�equals������

	public Student(){}
	public Student(int no,String school){
		this.no = no;
		this.school = school;
	}

	// ��дtoString����
	public String toString(){
		return "ѧ��" + no + "������ѧУ����" + school;
	}

	// ��дequals����
	// ���󣺵�һ��ѧ����ѧ����ȣ�����ѧУ��ͬʱ����ʾͬһ��ѧ����
	// ˼�������equals����ô��д�أ�
	// equals�����ı�дģʽ���ǹ̶��ġ����Ӳ�ࡣ
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Student)) return false;
		if(this == obj) return true;
		Student s = (Student)obj;
		return this.no == s.no && this.school.equals(s.school);

		//�ַ�����˫�ȺűȽϿ�����
		// ������
		//return this.no == s.no && this.school == s.school;
	}
}
