
public class StaticTest04{
	public static void main(String[] args){

		// ���ǱȽ�����ķ�ʽ����̬�������á�����.��
		StaticTest04.doSome();

		//����
		StaticTest04 st = new StaticTest04();
		// �á�����.������
		st.doSome();

		// ������
		st = null;
		// ������ֿ�ָ���쳣
		st.doSome(); // �������������ִ�е�ʱ���ǻ�ת��Ϊ��StaticTest04.doSome();

		// ʵ������doOther()
		// ���󼶱�ķ�������new����ͨ��������.�������ʣ�
		//����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� doOther()
		//StaticTest04.doOther();

		StaticTest04 st2 = new StaticTest04();
		st2.doOther();

		// ������
		st2 = null;
		// �����õ���ʵ�����������ʲô���⣿��ָ���쳣��
		//st2.doOther();

	}

	// ��̬��������̬��������Ҫnew����ֱ��ʹ�á�����.�������ʣ�
	// ����Ҳ����ʹ�á�����.�������ʣ��������á�����Ϊ��������Ա��е����󡣣�
	public static void doSome(){
		System.out.println("��̬����doSome()ִ���ˣ�");
	}

	// ʵ��������ʵ����صĶ���Ҫnew����ʹ��"����."�����ʡ���
	public void doOther(){
		System.out.println("ʵ������doOtherִ���ˣ�");
	}
}

// �ӵ�һ�쿪ʼ����HelloWorld��ĿǰΪֹ��һ���൱��һ����д����Щ������
/*
��{
	// ʵ����صĶ�����Ҫnew����ģ�ͨ��"����."���ʡ�
	ʵ������;
	ʵ������;

	// ��̬��صĶ��ǲ��á�����.�����ʡ�Ҳ����ʹ�á�����.����ֻ���������顣
	��̬����;
	��̬����;
}
*/