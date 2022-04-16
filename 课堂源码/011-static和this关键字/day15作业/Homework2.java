/*
дһ����ΪAccount����ģ���˻���
��������Ժͷ���������ʾ��
������������ԣ��˻�id�����balance��������annualInterestRate��
�����ķ����������Ե�set��get������ȡ���withdraw()������deposit()

дһ�����Գ���
��1������һ��Customer�����ֽ�Jane Smith������һ���˺�Ϊ1000�����Ϊ2000��������Ϊ1.23%���˻�
��2����Jane Smith������
����100Ԫ����ȡ��960Ԫ����ȡ��2000��
��ӡJane Smith�Ļ�����Ϣ
��Ϣ������ʾ��
�ɹ����룺100
�ɹ�ȡ����960
���㣬ȡǮʧ��
Customer [Smith��Jane] has a account ��id is 1000 annualInterestRate is 1.23% balance is 1140.0

*/
public class Homework2{
	public static void main(String[] args){
		// �ȴ���һ���˻�����
		Account a = new Account("1000", 2000, 1.23);
		// �����ͻ�����
		// �������췽��a��ʲô��˼����Customer�����Account���������ϵ��
		// ��ʾ����˻���Smith�ġ�
		Customer c = new Customer("Jane Smith", a);

		/*
		��Jane Smith������
			����100Ԫ��
			��ȡ��960Ԫ��
			��ȡ��2000��
		*/
		c.getAct().deposit(100);
		c.getAct().withdraw(960);
		c.getAct().withdraw(2000);

		// ���п��ǲ���Ӧ����һ�����ˡ�
		// �˳������ѵĵط��ǣ����ֶ���֮��Ĺ��������÷��֡�
	}
}

// �Ժ��Ƿ�װ�����е��඼������˽�л��������ṩsetter and getter������
// �ͻ���
class Customer{
	// �ͻ�����
	private String name;
	// �ͻ�����Ӧ���������˻�
	private Account act;

	// ���췽��
	public Customer(){
	
	}

	public Customer(String name, Account act){
		this.name = name;
		this.act = act;
	}

	// setter and getter����
	// ΪʲôҪдset��get���õ������ò�����Ҳ��д����Ϊ���ǡ���װ���涨�ġ�
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAct(Account act){
		this.act = act;
	}
	public Account getAct(){
		return act;
	}
}

// �˻���
class Account{
	// �˻�id
	private String id;
	// ���
	private double balance;
	// ������
	private double annualInterestRate;

	// ���췽��
	public Account(){
	
	}

	public Account(String id, double balance, double annualInterestRate){
		// ��������ʱ��Ҫ�Ĵ��롣
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	// setter and getter
	public void setId(String id){
		// ���󴴽���֮�����޸�id���Ե��ô˷�����
		this.id = id;
	}
	public String getId(){
		return id;
	}
	// ʵ����������Ҫ������.�������á���
	public void setBalance(double balance){ //�޸����ķ�����
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	// ����
	// ������ʾ�����Ǯ��
	public void deposit(double money){
		// this����thisָ��Ķ����д�
		//this.balance = this.balance + money;
		//this.balance += money;

		// ���ʡ��this.
		//balance = balance + money;
		//balance += money;

		// ���÷����������޸����
		this.setBalance(this.getBalance() + money);

		// this. ����ʡ�ԡ�
		//setBalance(getBalance() + money);

		System.out.println("�ɹ����룺" + money);
	}

	// ȡ���
	// ����ȡǮ�ķ���ʱ��Ӧ�ô��ݹ���һ�����������߸÷���Ҫȡ����Ǯ
	public void withdraw(double money){
		// this����thisָ��Ķ�����ȡ�
		if(money > this.getBalance()){
			System.out.println("���㣬ȡǮʧ��");
			return;
		}
		// �����ܹ�ִ�е��˴�˵��������
		this.setBalance(this.getBalance() - money);
		System.out.println("�ɹ�ȡ����" + money);
	}
}