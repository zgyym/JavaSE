/*
	��Ŀ��
		ҵ��
			�Ӽ����Ͻ�����������Ϣ��
				1��ʾ������
				0��ʾ������
			ͬʱ�Ӽ����Ͻ����Ա����Ϣ��
				1��ʾ����
				0��ʾ��Ů
			ҵ��Ҫ��
				�������������ʱ��
					�еģ���һ�Ѵ��ɡ
					Ů�ģ���һ��С��ɡ
				�������������ʱ��
					�еģ�ֱ�����𣬳�ȥ��ˣ
					Ů�ģ������ɹ˪����ȥ��ˣ
		
		��Ҫʹ��if����Լ�Ƕ�׵ķ�ʽչ�����ҵ��

		�����ڳ���Ŀ�ʼ�������������ݣ�һ��������������һ���������Ա�
		Ȼ�����������ݱ��浽�����С�
*/
public class IfTest04{
	public static void main(String[] args){
		// �����û���������
		java.util.Scanner s = new java.util.Scanner(System.in);
		// ��ʾ��Ϣ
		System.out.print("�����������Ա�����1��ʾ�У�����0��ʾŮ��");
		// ����ͣ�����ȴ��û�������
		int gender = s.nextInt();
		//System.out.println(gender);
		// ��ʾ��Ϣ
		System.out.print("�����뵱ǰ��������1��ʾ���죬0��ʾ���죺");
		// �ȴ��û�������
		int weather = s.nextInt();
		// ����Ҫ���ϵĽ��в��ԣ���Ҫ����һ�ΰѳ���д�á�
		//System.out.println(weather);
		if(weather == 1){
			//System.out.println("����");
			if(gender == 1){
				// ��
				System.out.println("�����ˣ�С��磬���ŵ�ʱ��ǵ���һ�Ѵ��ɡŶ��");
			}else if(gender == 0){
				// Ů
				System.out.println("�����ˣ�С��㣬���ŵ�ʱ��ǵô�һ��С��ɡŶ��");
			}
		}else if(weather == 0){
			//System.out.println("����");
			if(gender == 1){
				// ��
				System.out.println("������������������ǳ�ȥ��ˣ�ɣ�");
			}else if(gender == 0){
				// Ů
				System.out.println("������������ʣ�С���Ҫ������Ƥ��Ŷ�������ɹ˪��");
			}
		}
	}
}