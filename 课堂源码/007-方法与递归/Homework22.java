
/*
	��дһ���������������ĳ��������n����С������
		���磺���������n��2
		Ҳ����Ҫ���������2����С���������������3

		���磺���������n��9
		Ҳ����Ҫ���������9����С���������������11

		����11����С�������ǣ�13
	
	˼·��
		���ȣ�ϵͳһ�����ȸ���һ����������n����Ȼ�������
		���n����++��ÿ��1�õ�������m�ж�һ���Ƿ�Ϊ������
*/
public class Homework22{

	public static void main(String[] args){
		printZuiXiaoZhiShu(7);
	}
	public static void printZuiXiaoZhiShu(int n){
		while(!isZhiShu(++n)){
		}
		System.out.println(n);
	}
	public static boolean isZhiShu(int num){
		for(int i = 2; i < num; i++){ 
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}