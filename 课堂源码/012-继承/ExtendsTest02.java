
// ʹ�ü̳л�����������븴�����⡣
// �̳�Ҳ�Ǵ���ȱ��ģ���϶ȸߣ������޸ģ�������ǣ����
public class ExtendsTest02{
	public static void main(String[] args){
		// ������ͨ�˻�
		Account act = new Account();
		act.setActno("1111111");
		act.setBalance(10000);
		System.out.println(act.getActno() + ",���" + act.getBalance());

		// ���������˻�
		CreditAccount ca = new CreditAccount();
		ca.setActno("2222222");
		ca.setBalance(-10000);
		ca.setCredit(0.99);
		System.out.println(ca.getActno() + ",���" + ca.getBalance() + ",������" + ca.getCredit());
	}
}

// �����˻���
// �˻������ԣ��˺š����
class Account{ // ����
	// ����
	private String actno;
	private double balance;

	// ���췽��
	public Account(){
	
	}
	public Account(String actno, double balance){
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

// �������͵��˻������ÿ��˻�
// �˺š���������
class CreditAccount extends Account{ //����

	// ����
	private double credit;

	// ���췽��
	public CreditAccount(){
	
	}

	public void doSome(){
		//����: actno �� Account ���� private ���ʿ���
		//System.out.println(actno);
		// ��ӷ���
		//System.out.println(this.getActno());
		System.out.println(getActno());
	}

	// setter and getter����
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
	
}