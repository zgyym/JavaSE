
/*
	ͨ��������Եó��Ľ��ۣ�
		super �������á�superҲ�������ڴ��ַ��superҲ��ָ���κζ���
		super ֻ�Ǵ���ǰ�����ڲ�����һ�鸸���͵�������
*/
public class SuperTest06 {

	// ʵ������
	public void doSome(){
		// SuperTest06@2f92e0f4
		System.out.println(this);
		// ��������á���ʱ�򣬻��Զ��������õ�toString()������
		//System.out.println(this.toString());

		//�������: ��Ҫ'.'
		//System.out.println(super);
	}

	// this��super����ʹ����static��̬�����С�
	/*
	public static void doOther(){
		System.out.println(this);
		System.out.println(super.xxx);
	}
	*/

	// ��̬������������
	public static void main(String[] args){
		SuperTest06 st = new SuperTest06();
		st.doSome();

		// main�����Ǿ�̬��
		// ����ġ�
		/*
		System.out.println(this);
		System.out.println(super.xxxx);
		*/
	}
}