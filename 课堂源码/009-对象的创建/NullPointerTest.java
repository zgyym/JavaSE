/*
	��ָ���쳣����NullPointerException��

	����������������GC
		��java�����У�������������Ҫ��Ե��Ƕ��ڴ档
		��һ��java����û���κ�����ָ��ö����ʱ��
		GC�ῼ�ǽ������������ͷŻ��յ���
	
	���ֿ�ָ���쳣��ǰ�������ǣ�
		"������"����ʵ����������ء���ص�����ʱ��������ֿ�ָ���쳣��
*/
public class NullPointerTest{
	public static void main(String[] args){
		// �����ͻ�����
		Customer c = new Customer();
		// ��������ͻ���id
		System.out.println(c.id); // 0

		// ���¸�id��ֵ
		c.id = 9521; // �������
		System.out.println("�ͻ���id��=" + c.id);

		c = null;
		// NullPointerException
		// ������û���⣬��Ϊ������ֻ����﷨������������c��Customer���ͣ�
		// Customer��������id���ԣ����Կ��ԣ�c.id���﷨���ˡ�
		// �������е�ʱ����Ҫ����Ĵ��ڣ����Ƕ���û�ˣ������ˣ���ֻ�ܳ���һ���쳣��
		System.out.println(c.id);
	}
}

class Customer{
	// �ͻ�id
	int id; // ��Ա�����е�ʵ��������Ӧ���ȴ�������Ȼ��ͨ��������.���ķ�ʽ���ʡ�
}