
/*
	����Ĵ�����ʹ�á�
*/
public class XueShengTest{
	public static void main(String[] args){

		int i = 100;
		System.out.println("i = " + i);
		
		// ��������Է���XueSheng����
		// ��Ȼ���ԡ�
		/*
			����������﷨��ʲô��
				Ŀǰ����Ӳ�����ȼ�ס�������������ˡ�
					new ����();
			����ģ�壬ͨ��һ���࣬�ǿ��Դ���N�������ġ�
			new��һ���������ר�Ÿ������Ĵ�����

			XueSheng s1 = new XueSheng();
			��
			int i = 100;
			����һ�£�
				i�Ǳ�����
				int�Ǳ�������������
				100�Ǿ�������ݡ�
				
				s1�Ǳ�������s1���ܽ�������s1ֻ��һ���������֡���
				XueSheng�Ǳ���s1���������ͣ������������ͣ�
				new XueSheng() ����һ�����󡣣�ѧ���ഴ��������ѧ�����󡣣�
			
			�������Ͱ������֣�
				�����������ͣ�byte short int long float double boolean char
				�����������ͣ�String��XueSheng.....

			java�����еġ��ࡱ�����������������͡�

		*/
		XueSheng s1 = new XueSheng(); // �� int i = 10;һ������

		// ��ͨ�����ഴ��һ��ȫ�µĶ���
		XueSheng s2 = new XueSheng();

		// �ٴ���һ���أ�
		XueSheng xsh = new XueSheng();

		// ���ϵ����������൱��ͨ��XueSheng��ʵ������3��XueSheng����
		// ��������ĸ���û�����ƣ��������⡣ֻҪ��ģ������С�
		// 3����������ѧ�����͡�

	}
}
