public class ConstructorTest03{
	public static void main(String[] args){
		//���ò�ͬ�Ĺ��췽����������
		Vip v1 = new Vip();
		System.out.println(v1.no); //0
		System.out.println(v1.name); // null
		System.out.println(v1.birth); // null
		System.out.println(v1.sex); // false

		Vip v2 = new Vip(11111L, "�����");
		System.out.println(v2.no); // 11111L
		System.out.println(v2.name); // "�����"
		System.out.println(v2.birth); // null
		System.out.println(v2.sex); // false

		Vip v3 = new Vip(22222L, "С����", "2000-10-10");
		System.out.println(v3.no); // 22222L
		System.out.println(v3.name); //"С����"
		System.out.println(v3.birth); // "2000-10-10"
		System.out.println(v3.sex); // false

		Vip v4 = new Vip(33333L, "������", "1980-10-11", true);
		System.out.println(v4.no); // 33333L
		System.out.println(v4.name); //"������"
		System.out.println(v4.birth); //"1980-10-11"
		System.out.println(v4.sex); //true
	}

}