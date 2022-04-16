/*
	1���ٸ����ӣ���ǡ����ʱ��ʹ�ã�super(ʵ�ʲ����б�);
	2��ע�⣺�ڹ��췽��ִ�й�����һ���������˸���Ĺ��췽����
	����Ĺ��췽���ּ������µ������ĸ���Ĺ��췽��������ʵ����
	����ֻ������һ����

	3��˼������super(ʵ��)�������Ǹ�ɶ�ģ�
		super(ʵ��)�������ǣ���ʼ����ǰ����ĸ�����������
		�����Ǵ����¶���ʵ���϶���ֻ������1����
	
	4��super�ؼ��ִ���ʲôѽ��
		super�ؼ��ִ���ľ��ǡ���ǰ���󡱵��ǲ��ָ�����������

		�Ҽ̳����Ҹ��׵�һ����������
			���磺�۾���Ƥ����.
			super����ľ��ǡ��۾���Ƥ���ȡ���
			���۾���Ƥ���ȡ���Ȼ�Ǽ̳��˸��׵ģ����ⲿ�������������ء�

*/
// ���Գ���
public class SuperTest03{
	public static void main(String[] args){

		CreditAccount ca1 = new CreditAccount();
		System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," + ca1.getCredit());

		CreditAccount ca2 = new CreditAccount("1111", 10000.0, 0.999);
		System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," + ca2.getCredit());

	}
}

// �˻�
class Account extends Object{
	// ����
	private String actno;
	private double balance;

	// ���췽��
	public Account(){
		//super();
		//this.actno = null;
		//this.balance = 0.0;
	}
	public Account(String actno, double balance){
		// super();
		this.actno = actno;
		this.balance = balance;
	}

	// setter and getter
	public void setActno(String actno){
		this.actno = actno;
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
}

// �����˻�
class CreditAccount extends Account{

	// ���ԣ������ȣ�����ֵ��
	// �������е�һ������������û�С�
	private double credit;

	// ���췽��
	// �������³����Ƿ���ڱ�����󣿣�����
	public CreditAccount(String actno, double balance, double credit){

		// ˽�е����ԣ�ֻ���ڱ����з��ʡ�
		/*
		this.actno = actno;
		this.balance = balance;
		*/

		// �������д�����ǡ����λ�ã����ÿ���ʹ�ã�super(actno, balance);
		// ͨ������Ĺ��췽�����ø���Ĺ��췽����
		super(actno, balance);
		this.credit = credit;
	}

	// �ṩ�в����Ĺ��췽��
	public CreditAccount(){
		//super();
		//this.credit = 0.0;
	}

	// setter and getter����
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
	
}