//�ӿ���̨����һ������������������Ľ׳ˡ���������5���׳�Ϊ 5*4*3*2*1
public class Homework3{
	public static void main(String[] args){
		//��һ������ô�Ӽ����Ͻ���һ����������
		java.util.Scanner s = new java.util.Scanner(System.in);
		// �ȴ��û�����һ����������
		System.out.print("������һ����������");
		int num = s.nextInt();
		// ��������Ľ׳�
		// 5�Ľ׳ˣ�5*4*3*2*1
		// 8�Ľ׳ˣ�8*7*6*5*4*3*2*1
		// �ڶ������Ȳ��ùܳ˷����¶�����ʵ�ִ�8ȡ��1.���ݼ��ķ�ʽȡ��
		//int jieGuo = 0; //��ʼֵ������0����0��ʱ�򣬳˻������0.
		int jieGuo = 1; //����ĳ�ʼֵ��1.
		for(int i = num; i > 1; i--){
			jieGuo *= i; // jieGuo = jieGuo * i;
		}
		System.out.println("������ = " + jieGuo);
	}
}