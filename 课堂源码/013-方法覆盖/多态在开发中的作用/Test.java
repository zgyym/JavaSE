/*
	���Զ�̬�ڿ����е�����
*/
public class Test{
	public static void main(String[] args){
		// �������˶���
		Master zhangsan = new Master();
		// �����������
		Dog zangAo = new Dog();
		// ����ι
		zhangsan.feed(zangAo);
		// �����������
		Cat xiaoHua = new Cat();
		// ����ι
		zhangsan.feed(xiaoHua);
		// �����������
		YingWu yingWu = new YingWu();
		// ����ι
		zhangsan.feed(yingWu);
	}
}