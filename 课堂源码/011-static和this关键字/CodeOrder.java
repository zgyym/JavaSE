//�ж����³����ִ��˳��
public class CodeOrder{
	
	// ��̬�����
	static{
		System.out.println("A");
	}

	// ���
	// A X Y C B Z
	public static void main(String[] args){
		System.out.println("Y");
		new CodeOrder();
		System.out.println("Z");
	}

	// ���췽��
	public CodeOrder(){
		System.out.println("B");
	}

	// ʵ������
	{
		System.out.println("C");
	}

	// ��̬�����
	static {
		System.out.println("X");
	}

}