/*
	��Ŀ��
		1��ϵͳ����һ��ѧ���Ŀ��Գɼ������ݿ��Գɼ�����ɼ��ĵȼ���

		2���ȼ���
			�ţ�[90~100]
			����[80~90) 
			�У�[70-80)
			����[60~70)
			������[0-60)

		3��Ҫ��ɼ���һ���Ϸ������֣��ɼ�������[0-100]֮�䣬�ɼ����ܴ���С����
*/
public class IfTest03{
	public static void main(String[] args){
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������Ŀ��Գɼ���");
		// ���Գɼ�����С��
		double score = s.nextDouble(); //��������ͣ���ˣ��ȴ��û������롣
		// �жϿ��Գɼ�
		String str = "��";
		if(score < 0 || score > 100){
			str = "�ɼ����Ϸ�!!!";
		}else if(score < 60){
			str = "������";
		}else if(score < 70){
			str = "����";
		}else if(score < 80){
			str = "��";
		}else if(score < 90){
			str = "��";
		}
		System.out.println(str);
	}
}