public class AnimalTest{
	
	// test�����ǳ���ԱB�����д��
	// ���test()�����Ĳ�����һ��Animal
	public void test(Animal a){ // ʵ������
		// ��д������������˻�ȥ���á�
		// ���˵��õ�ʱ����ܸ���test()����������һ��Bird
		// ��ȻҲ���ܴ�����һ��Cat
		// ��������˵���Ҳ�֪������õ�ʱ����Ҵ�����һ��ɶ��
		if(a instanceof Cat){
			Cat c = (Cat)a;
			c.catchMouse();
		}else if(a instanceof Bird){
			Bird b = (Bird)a;
			b.sing();
		}
	}

}