/*
	����Object���е�toString()����
		1��toString()������������ʲô��
			���ã�����java����ת���ɡ��ַ�������ʽ����

		2��Object����toString()������Ĭ��ʵ����ʲô��
			public String toString() {
				return getClass().getName() + "@" + Integer.toHexString(hashCode());
			}
			toString: ����������˼��ת����String
			���壺����һ��java�����toString()�����Ϳ��Խ���java����ת�����ַ����ı�ʾ��ʽ��

		3����ôtoString()��������Ĭ��ʵ�ֹ�����
*/
public class OverrideTest04{
	public static void main(String[] args){
		// ����һ�����ڶ���
		MyDate t1 = new MyDate();
		// ����toString()������������ת�����ַ�����ʽ����
		// �ʣ������������������𣿲����⣬ϣ�������xxxx��xx��xx��
		// ��дMyDate��toString()����֮ǰ�Ľ��
		//System.out.println(t1.toString()); //MyDate@28a418fc 

		// ��дMyDate��toString()����֮��Ľ��
		System.out.println(t1.toString());

		// ����Ƿ񻹼ǵã������һ�����õ�ʱ��println�������Զ��������õ�toString������
		System.out.println(t1);

		MyDate t2 = new MyDate(2008, 8, 8);
		System.out.println(t2); //2008��8��8��

		//����ѧ������
		Student s = new Student(1111, "zhangsan");
		// ��дtoString()����֮ǰ
		//System.out.println(s); //Student@87aac27
		// ��дtoString()����֮��
		// ���һ��ѧ�������ʱ�򣬿��ܸ�Ը�⿴��ѧ������Ϣ����Ը�⿴��������ڴ��ַ��
		System.out.println(s.toString());
		System.out.println(s);
	}
}

// ������
class MyDate {
	private int year;
	private int month;
	private int day;
	public MyDate(){
		this(1970,1,1);
	}
	public MyDate(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}

	// ��Object���м̳й������Ǹ�toString()�����Ѿ��޷�������ҵ�������ˡ�
	// ��������MyDate���б�Ҫ�Ը����toString()�������и���/��д��
	// �ҵ�ҵ��Ҫ���ǣ�����toString()���������ַ���ת����ʱ��
	// ϣ��ת���Ľ���ǣ�xxxx��xx��xx�գ����ָ�ʽ��
	// ��дһ��Ҫ����ճ������Ҫ�ֶ���д�����ġ�
	public String toString() {
		return year + "��" + month + "��" + day + "��";
	}
}

class Student{
	int no;
	String name;
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	// ��д  ��������
	public String toString() {
		return "ѧ�ţ�" + no + "��������" + name;
	}
}
