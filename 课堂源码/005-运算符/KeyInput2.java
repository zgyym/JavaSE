import java.util.Scanner;

// ���н�����
public class KeyInput2{
	public static void main(String[] args){
		// ��������ɨ��������
		Scanner s = new Scanner(System.in);
		// ���һ����ӭ��Ϣ
		System.out.println("��ӭʹ��С�����������");
		System.out.print("�������1�����֣�");
		int num1 = s.nextInt();
		System.out.print("�������2�����֣�");
		int num2 = s.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}
}