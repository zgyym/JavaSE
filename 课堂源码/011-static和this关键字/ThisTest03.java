/*
1��this����ʹ����ʵ�������У�����ʹ���ھ�̬�����С�
2��this�ؼ��ִ󲿷�����¿���ʡ�ԣ�ʲôʱ����ʡ���أ�
	��ʵ�������У����߹��췽���У�Ϊ�����־ֲ�������ʵ��������
	��������£�this. �ǲ���ʡ�Եġ�
*/
public class ThisTest03{
	public static void main(String[] args){

		Student s = new Student();
		s.setNo(111);
		s.setName("����");
		System.out.println("ѧ�ţ�" + s.getNo());
		System.out.println("������" + s.getName());

		Student s2 = new Student(2222, "����");
		System.out.println("ѧ�ţ�" + s2.getNo());
		System.out.println("������" + s2.getName());

	}
}

// ����һ�£����´�������д�Ĳ��á�
// ѧ����
class Student{
	//ѧ��
	private int no;

	//����
	private String name;

	//���췽���޲�
	public Student(){
	
	}

	//���췽���в�
	/*
	public Student(int i, String s){
		no = i;
		name = s;
	}
	*/

	// ����Ĺ��췽��Ҳ��ǿ���¿ɶ���
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}

	// setter and getter����
	/*
	public void setNo(int i){
		no = i;
	}
	*/
	/*
	public void setNo(int no){ // �ͽ�ԭ��
		no = no; //������no���Ǿֲ�����no����ʵ������noû��ϵ��
	}
	*/
	public void setNo(int no){ 
		//no�Ǿֲ�����
		//this.no ��ָ��ʵ��������
		this.no = no; // this. �������ǣ����־ֲ�������ʵ��������
	}
	public int getNo(){
		return no;
		//return this.no;
	}
	/*
	public void setName(String s){
		name = s;
	}
	*/
	/*
	public void setName(String name){ // �ͽ�ԭ��
		name = name; //������name���Ǿֲ�����name����ʵ������nameû��ϵ��
	}
	*/
	public void setName(String name){
		this.name = name;
	}

	/*
	public String getName(){
		return name;
	}
	*/

	public String getName(){ // getNameʵ���ϻ�ȡ���ǡ���ǰ���󡱵����֡�
		//return this.name; // �ϸ���˵����������һ�� this. �ġ�ֻ������� this. �ǿ���ʡ�Եġ�
		return name;
	}
}