public class Homework03{
	public static void main(String[] args){
		int i = 5;
		int j = 5;
		int m = 5;
		int n = 5;
		i++; // ���д���ִ�н���֮��i��6
		j = j + 1; // ���д���ִ�н���֮��j��6
		m--; // ���д���ִ�н���֮��m��4
		n = n - 1; // ���д���ִ�н���֮��n��4
		System.out.println(i); // 6
		System.out.println(i++); // 6����Ȼ��������6����������������д���ִ�н���֮��i����7�ˡ���
		System.out.println(++i); // 8�����д���ִ�н���֮��i�����ֵ�����8��
		System.out.println(i--); // 8�����д���ִ�н���֮��i�����ֵ�����7��
		System.out.println(); // С������ʲôҲû�У��հף���ʾ����
		System.out.println(j);
		System.out.println(j++);
		System.out.println(j--);
		System.out.println(--j);
		System.out.println();
		System.out.println(m);
		System.out.println(n);
	}
}