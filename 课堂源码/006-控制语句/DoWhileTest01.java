
/*
	do..whileѭ������ִ��ԭ���Լ��﷨���ƣ�
		�﷨���ƣ�
			do {
				ѭ����;
			}while(�������ʽ);

		ע�⣺do..whileѭ������ʱ���©�����ֺš�

		ִ��ԭ��
			��ִ��ѭ���嵱�еĴ��룬ִ��һ��ѭ����֮��
			�жϲ������ʽ�Ľ�������Ϊtrue�������ִ��
			ѭ���壬���Ϊfalseѭ��������
		
		����do..whileѭ����˵��ѭ��������ִ��1�Ρ�ѭ�����ִ�д����ǣ�1~n�Ρ�
		����whileѭ����˵��ѭ����ִ�д����ǣ�0~n�Ρ�
		
*/
public class DoWhileTest01{
	public static void main(String[] args){
		//����: ��Ҫ';'
		/*
		int i = 0;
		do{
			System.out.println(i);
			i++;
		}while(i < 10)
		*/
		
		/*
		int i = 0;
		do{
			System.out.println(i); // 0 1 2 3 ... 8 9
			i++;
		}while(i < 10);
		*/

		/*
		int i = 0;
		do{
			System.out.println(i++); // 0 1 2 3 ... 8 9
		}while(i < 10);
		*/

		int i = 0;
		do{
			//System.out.println(++i); // 1 2 3 ... 8 9 10

			// ��������һ�д�����Ϊ���µ����д��롣
			int temp = ++i;
			System.out.println(temp); // ����ִ�е��˴���ʱ��i��10

		}while(i < 10);

		System.out.println("-----------------------------");
		int k = 100;
		System.out.println(++k); // 101
		System.out.println(k); // 101

		int m = 10;
		System.out.println(m++); // 10
		System.out.println(m); // 11


		// ����ִ��1��ѭ���塣
		do{
			System.out.println("Hello World!");
		}while(false);

	}
}