
/*
	��������ô�仯����䲻�����ڣ���һ���̶��Ĺ��ɣ�
		���е�ʵ����صĶ����ȴ�������ͨ��������.�������ʡ�
		���еľ�̬��صĶ���ֱ�Ӳ��á�����.�������ʡ�
	
	���з���һЩ������
		����һЩ����Ҫ����ģ�����Щ����Ļ���֮�Ͻ��з�����
	
	����ۣ�
		ֻҪ������õķ���a�ͱ����õķ���b��ͬһ���൱�У�
			this. ����ʡ��
			����. ����ʡ��
*/
public class Review02{

	int i = 100;

	static int j = 1000;

	public void m1(){

		// ����������ľ�̬����
		T.t1();

		// �����������ʵ������
		T t = new T();
		t.t2();
	}

	public void m2(){}

	// ʵ������
	public void x(){ // ���������ʵ��������ִ����������Ĺ����У���ǰ�����Ǵ��ڵġ�
		m1();
		m2();

		m3();
		m4();

		System.out.println(i); // System.out.println(this.i);
		System.out.println(j); // System.out.println(Review02.i);
	}

	public static void m3(){}

	public static void m4(){}

	// �ʣ�����ô�����������
	/*
		��һ����
			main�����Ǿ�̬�ģ�JVM����main������ʱ��ֱ�Ӳ��õ��ǡ�����.���ķ�ʽ��
			����main������û��this��

		�ڶ�����
			m1() �� m2() ������ʵ������������java�﷨������˵��ʵ������������
			new����ͨ��������.���ķ�ʽ���ʡ�
	*/
	public static void main(String[] args){
		// ���뱨��
		//m1();
		//m2();

		m3(); // ���������Զ�ʶ��m3()��̬����������ǣ�Review02.m3();
		m4(); // Review02.m4();

		//System.out.println(i); // ����
		System.out.println(j); // ����

		// �����m1() m2()����i������static������ֻ���Լ�new
		Review02 r = new Review02();
		System.out.println(r.i);
		r.m1();
		r.m2();

		// �ֲ��������ֲ��������ʵ�ʱ���ǲ���Ҫ��xxx.����
		int k = 10000;
		System.out.println(k);
	}
}


class T{
	// ��̬����
	public static void t1(){
	
	}

	//ʵ������
	public void t2(){
	
	}
}
