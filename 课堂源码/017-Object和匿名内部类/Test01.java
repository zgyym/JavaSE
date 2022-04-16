/*
	����Object���е�toString()����

		1��Դ���볤ʲô����
			public String toString() {
				return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
			}
			Դ������toString()������Ĭ��ʵ���ǣ�
				����@������ڴ��ַת��Ϊʮ�����Ƶ���ʽ

		2��SUN��˾���toString()������Ŀ����ʲô��
			toString()������������ʲô��
				toString()���������Ŀ���ǣ�ͨ����������������Խ�һ����java����ת���ɡ��ַ�����ʾ��ʽ��

		3����ʵSUN��˾����java���Ե�ʱ�򣬽������е����඼ȥ��дtoString()������
		toString()����Ӧ����һ�����ġ���ʵ�ġ����Ķ���.
*/
public class Test01{
	public static void main(String[] args){
		MyTime t1 = new MyTime(1970, 1, 1);
		// һ�����ڶ���ת�����ַ�����ʽ�Ļ����ҿ��ܻ���ϣ���ܿ��������������Ϣ��
		String s1 = t1.toString();

		//MyTime����дtoString()����֮ǰ
		//System.out.println(s1); // MyTime@28a418fc
		
		//MyTime����дtoString()����֮��
		System.out.println(s1); // 1970��1��1��

		
		//System.out.println(t1.toString()); //1970��1��1��

		// ע�⣺������õ�ʱ�򣬻��Զ����ø����õ�toString()������
		System.out.println(t1);
	}
}
class MyTime{
	int year;
	int month;
	int day;

	public MyTime(){
	
	}

	public MyTime(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// ��дtoString()����
	// ���toString()������ô��д�أ�
	// Խ���Խ�ã��ɶ���ԽǿԽ�á�
	// ����ġ���ʵ�ġ����Ķ��ķ���չ
	public String toString(){
		//return this.year + "��" + this.month + "��" + this.day + "��";
		return this.year + "/" + this.month + "/" + this.day;
	}
}