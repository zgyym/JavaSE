public class PersonTest02{
	public static void main(String[] args){
		// ��������
		Person p1 = new Person();

		// Person��age���������ⲿ���ܷ����ˡ������������е�̫��ȫ�ˡ�
		// age���ܷ��ʣ������������岻���ˡ�
		/*
		// ��age���Ե�ֵ
		System.out.println(p1.age);

		// �޸�age���Ե�ֵ
		p1.age = 20;

		// ��age
		System.out.println(p1.age);
		*/

		// ͨ��������.�����Ե���set��get�����𣿲��С�
		// ֻ�з������η��б�����static��ʱ�򣬲���ʹ�á�����.���ķ�ʽ����
		// ����ġ�
		//Person.getAge();

		//������getAge()����
		//int nianLing = p1.getAge();
		//System.out.println(nianLing); //0
		//���ϴ�������
		System.out.println(p1.getAge()); //0

		//�ĵ���setAge()����
		p1.setAge(20);

		System.out.println(p1.getAge()); //20

		// �����ڰ����ˣ��ⲻ�ǽ������û����ס�𣿣���������
		p1.setAge(-100);
		//System.out.println(p1.getAge()); // -100
		System.out.println(p1.getAge()); // 20

	}
}