/*
	whileѭ����
		1��whileѭ�����﷨�����Լ�ִ��ԭ��
			�﷨���ƣ�
				while(�������ʽ){
					ѭ����;
				}
			ִ��ԭ��
				�жϲ������ʽ�Ľ�������Ϊtrue��ִ��ѭ���壬
				ѭ�������֮���ٴ��жϲ������ʽ�Ľ�������
				����true������ִ��ѭ���壬ֱ���������ʽ���
				Ϊfalse��whileѭ��������

		2��whileѭ����û�п���ѭ������Ϊ0�Σ�
			���ܡ�
			whileѭ����ѭ�������ǣ�0~n�Ρ�
*/
public class WhileTest01{
	public static void main(String[] args){
		// ��ѭ��
		/*
		while(true){
			System.out.println("��ѭ��");
		}
		*/

		// ������whileѭ����forѭ��ԭ������ͬ�ġ�
		/*
			for(��ʼ�����ʽ; �������ʽ; ���±��ʽ){
				ѭ����;
			}

			��ʼ�����ʽ;
			while(�������ʽ){
				ѭ����;
				���±��ʽ;
			}

			if switch���ڷ�֧�������ѡ����䡣
			for while do..while..��Щ����ѭ����䡣
			������������Ƕ�ס�
		*/
		for(int i = 0; i < 10; i++){
			System.out.println("i --->" + i);
		}
		
		/*
		int i = 0;
		while(i < 10){
			System.out.println("i = " + i);
			i++;
		}
		*/

		// for��while��ȫ���Ի�����ֻ���������﷨��ʽ��һ����
		for(int i = 0; i < 10; ){
			i++;
			System.out.println("i --->" + i); // 1 2 3 .. 9 10
		}

		int i = 0;
		while(i < 10){
			i++;
			System.out.println("i = " + i); // 1 2 3 .. 9 10
		}


	}
}