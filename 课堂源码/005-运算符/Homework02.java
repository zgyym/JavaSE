public class Homework02{
	public static void main(String[] args){
		int x = 10;
		int a = x + x++; // ���д���ֻҪ������x����11
		System.out.println("a =" + a); // 20 ��x�ߵ�����ͱ��11�ˣ�
		System.out.println("x =" + x); // 11
		int b = x + ++x; // 23 ���д������֮��x����12
		System.out.println("b =" + b); // 23
		System.out.println("x =" + x); // 12
		int c = x + x--; // ���д���ִ�н���֮��x����11
		System.out.println("c =" + c); // 24
		System.out.println("x =" + x); // 11
		int d = x + --x; // ���д���ֻҪִ�н�����x����10�ˡ�
		System.out.println("d =" + d); // 21
		System.out.println("x =" + x); // 10
	}
}