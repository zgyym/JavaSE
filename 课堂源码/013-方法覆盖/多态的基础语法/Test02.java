
/*
	�����������ʣ�
		���ۿ��Թ۲쵽�ײ㵽����new Bird()����new Cat()����
		����Ϊʲô��Ҫ����instanceof���ж��أ�������

		ԭ���ǣ�
			���Ժ�������ۿ�������
*/
public class Test02{
	public static void main(String[] args){
		Animal x = new Bird();
		Animal y = new Cat();

		if(x instanceof Bird){
			Bird b = (Bird)x;
			b.sing();
		} else if(x instanceof Cat){
			Cat c = (Cat)x;
			c.catchMouse();
		}


		if(y instanceof Bird){
			Bird b = (Bird)y;
			b.sing();
		} else if(y instanceof Cat){
			Cat c = (Cat)y;
			c.catchMouse();
		}
	}
}