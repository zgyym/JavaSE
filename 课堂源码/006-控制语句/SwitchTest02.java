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

		����ʹ��switch�������ɣ������ô�죿
*/
public class SwitchTest02{
	public static void main(String[] args){
		// ��ʾ�û�����ѧ���ɼ�
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������ѧ���ɼ���");
		double score = s.nextDouble();
		//System.out.println(score);
		if(score < 0 || score > 100){
			System.out.println("�������ѧ���ɼ����Ϸ����ټ���");
			return; // ��������ִ�У�����main����������ὲ��
		}

		// �����ܹ�ִ�е�����˵���ɼ�һ���ǺϷ��ġ�
		// grade��ֵ�����ǣ�0 1 2 3 4 5 6 7 8 9 10
		// 0 1 2 3 4 5 ������
		// 6 ����
		// 7 ��
		// 8 ��
		// 9 10 ��
		
		int grade = (int)(score / 10); // 95.5/10���9.55��ǿתΪint�����9
		String str = "������";
		switch(grade){
		case 10: case 9:
			str = "��";
			break;
		case 8: 
			str = "��";
			break;
		case 7:
			str = "��";
			break;
		case 6:
			str = "����";
		}
		System.out.println("��ѧ���ĳɼ��ȼ�Ϊ��" + str);
	}
}