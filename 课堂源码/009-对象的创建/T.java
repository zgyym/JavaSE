// ������ڴ�ͼ��������һ��Ҫ���ճ����ִ��˳��һ��һ������
public class T{
	A o1; // ��Ա�����е�ʵ�������������ȴ�������ͨ�������á������ʡ�

	public static void main(String[] args){
		D d = new D();
		C c = new C();
		B b = new B();
		A a = new A();
		T t = new T();

		//���ﲻд��������NullPointerException�쳣������ָ���쳣����
		c.o4 = d;
		b.o3 = c;
		a.o2 = b;
		t.o1 = a;

		// ��д����ͨ��t������d�е�i
		//System.out.println(T.a); //����ġ�
		System.out.println(t.o1.o2.o3.o4.i);
	}
}
class A{
	B o2;
}
class B{
	C o3;
}
class C{
	D o4;
}
class D{
	int i;
}