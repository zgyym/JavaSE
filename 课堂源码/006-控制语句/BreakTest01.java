/*
	break;��䣺
		1��break;���Ƚ����⣬�����ڣ�break�����һ�����ʳ�Ϊһ��������java��䡣
		���⣺continueҲ����������������һ�����ʳ�Ϊһ����䡣

		2��break ����Ϊ�۶ϡ�Ū�ϡ�

		3��break;���������������أ�
			���������ط�������λ�ò���
			��һ��λ�ã�switch��䵱�У�������ֹswitch����ִ�С�
				����switch��䵱�У���ֹcase��͸����������ֹswitch��

			�ڶ���λ�ã�break;�������ѭ����䵱�У�������ֹѭ����ִ�С�
				����for����
				����while����
				����do....while..���С�
		
		4�����³�����Ҫ����forѭ��Ϊ��ѧϰbreakת����䡣

		5��break;����ִ�в���������������������break;�����Ҫ��������ֹ�������
		���Ǹ�ѭ����䡣

		6����ô��break;�����ָֹ����ѭ���أ�
			��һ��������Ҫ��ѭ����һ�����֣����磺
				a: for(){
					b:for(){
					
					}
				}
			�ڶ�������ֹ��break a;
*/
public class BreakTest01{

	public static void main(String[] args){

		// ���0-9
		/*
		for(int i = 0; i < 10; i++){
			System.out.println("i = " + i);
		}
		*/

		for(int i = 0; i < 10; i++){
			if(i == 5){
				// break;���������������ѭ����ֹ��������
				break; // break;��ֹ�Ĳ���if���������if�ģ�����������������ѭ����
			}
			System.out.println("i = " + i); // 0 1 2 3 4
		}

		// ����Ĵ����ճ�ִ�С�break;��ִ�в�����Ӱ�����
		System.out.println("Hello World!");

		// ���forѭ������
		for(int k = 0; k < 2; k++){ // ���for
			for(int i = 0; i < 10; i++){ // �ڲ�for
				if(i == 5){
					break; // ���break;���ֻ����ֹ���������for
				}
				System.out.println("i ===> " + i); 
			}
		}

		System.out.println("------------------------------------------");

		// ���½�������ݣ��Ժ󿪷������á���Ҫ���š�
		// �����﷨�����ã��˽�һ�¼��ɡ�
		a:for(int k = 0; k < 2; k++){ 
			b:for(int i = 0; i < 10; i++){
				if(i == 5){
					break a; // ��ָֹ����ѭ����
				}
				System.out.println("i ===> " + i); 
			}
		}

		System.out.println("�Ǻ�");

	}
}

