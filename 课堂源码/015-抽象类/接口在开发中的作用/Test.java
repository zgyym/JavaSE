public class Test{
	public static void main(String[] args){

		// ������ʦ����
		//FoodMenu cooker1 = new ChinaCooker();
		FoodMenu cooker1 = new AmericCooker();

		// �����˿Ͷ���
		Customer customer = new Customer(cooker1);

		// �˿͵��
		customer.order();
	}
}