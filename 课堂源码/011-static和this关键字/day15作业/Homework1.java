/*
��ͨ�������װ��ʵ����������
	��дһ����Book������̲�:	
	1.�������ԣ����ƣ�title����ҳ����pageNum��
	2.����ҳ����������200ҳ���������������Ϣ��������Ĭ��ֵ200
	3.Ϊ�������ṩ��ֵ��ȡֵ����
	4.���з���:detail�������ڿ���̨���ÿ���̲ĵ����ƺ�ҳ��
	5.��д������BookTest���в��ԣ�ΪBook��������Ը����ʼֵ��������Book�����detail��������������Ƿ���ȷ
*/
public class Homework1{
	public static void main(String[] args){
		// ����Book����
		Book b1 = new Book("������ѧ�˽̰�", 250);
		// ����detail����
		b1.detail();
		// �޸�ҳ��
		b1.setPageNum(100);
		b1.detail();

		Book b2 = new Book();
		b2.detail();
	}
}

class Book{
	// ����
	private String title; //ʵ������������. �ķ�ʽ����
	// ҳ��
	private int pageNum;

	// ���췽�����޲���
	public Book(){
		title = "δ֪";
		pageNum = 200;
	}

	// �в���������
	public Book(String s, int i){
		title = s;
		if(i < 200){
			pageNum = 200;
			System.out.println("ҳ����������200������200ʱ��ҳ��Ĭ��Ϊ200ҳ");
		}else{
			pageNum = i;
		}	
	}

	// setter and getter����
	public void setTitle(String s){
		title = s;
	}
	public String getTitle(){
		return title;
	}
	public void setPageNum(int i){
		if(i < 200){
			System.out.println("����ҳ����������200ҳ��Ĭ�ϸ�ֵ200");
			// Ĭ�ϸ�ֵ200
			pageNum = 200;
			return;
		}
		// ˵��ҳ���Ǵ��ڵ���200�ġ�
		pageNum = i;
	}
	public int getPageNum(){
		return pageNum;
	}

	// �������ṩһ��detail����
	public void detail(){
		//System.out.println("�̲����ƣ�" + this.title + "����ҳ��Ϊ" + this.pageNum);
		//this.�ǿ���ʡ�Ե�
		System.out.println("�̲����ƣ�" + title + "����ҳ��Ϊ" + pageNum);

	}
}