/*
	continue;��䣺
		1��continue����Ϊ������
		2��continue����break���Ҫ�Ա���ѧϰ
		3��continue���������ǣ�
			��ֹ��ǰ"����"ѭ����ֱ�ӽ�����һ��ѭ������ִ�С�
			for(){
				if(){ // �������������ʱ��ִ��continue���
					continue; //�����continue���ִ��ʱ��continue����Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��ִ�С�
				}
				// ���ϵ�continueһ��ִ�У����´��벻ִ�У�ֱ��ִ�и��±��ʽ��
				code1;
				code2;
				code3;
				code4;
			}

		4��continue���������ָ��ѭ����
			���Եġ�
			����Ͳ��ٽ��ˣ��Լ��������¡�
			a:for(;;���±��ʽ1){
				b:for(;;���±��ʽ2){
					if(){
						continue a;
					}
					code1;
					code2;
					code3;
				}
			}
*/
public class ContinueTest01{
	public static void main(String[] args){

		/*
			i = 0
			i = 1
			i = 2
			i = 3
			i = 4
		*/
		for(int i = 0; i < 10; i++){
			if(i == 5){
				break;
			}
			System.out.println("i = " + i);
		}

		System.out.println("----------------------------");

		/*
			i = 0
			i = 1
			i = 2
			i = 3
			i = 4
			i = 6
			i = 7
			i = 8
			i = 9
		*/
		for(int i = 0; i < 10; i++){
			if(i == 5){
				continue;
			}
			System.out.println("i = " + i); // ���i��4
		}

	}
}
