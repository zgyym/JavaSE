public class OverloadTest04{
	public static void main(String[] args){
		// ����Ƿ���ϣ�println��һ����������
		// println�ҳ����Ƿ������ˣ������������˭д�ģ�SUN��˾��java�Ŷ�д�ġ�
		// ��ֱ���þ��С�
		// println()�����϶��������ˡ������ţ�����Է���һ��SUN��˾д��Դ���뿴������
		// ����println()������˵������ֻ��Ҫ������һ�����������С�
		// �������Ϳ�����㴫����˵��println()���������ˡ�
		System.out.println(10);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println('a');
		System.out.println("abc");

		System.out.println(100L);
		System.out.println(3.0F);

		// ����m����
		m(100);
	}

	public static void m(int i){
		
	}

}