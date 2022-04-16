/*
	1��this���˿���ʹ����ʵ�������У����������ڹ��췽���С�
	2�����﷨��ͨ����ǰ�Ĺ��췽��ȥ������һ������Ĺ��췽��������ʹ�������﷨��ʽ��
		this(ʵ�ʲ����б�);
			ͨ��һ�����췽��1ȥ���ù��췽��2�������������븴�á�
			����Ҫע����ǣ������췽��1���͡����췽��2�� ������ͬһ���൱�С�

	3��this() ����﷨������ʲô��
		���븴�á�
	
	4������Ӳ����
		����this()�ĵ���ֻ�ܳ����ڹ��췽���ĵ�һ�С�
*/
public class ThisTest04{
	public static void main(String[] args){
		// �����޲������췽��
		Date d1 = new Date();
		d1.detail();

		// �����в������췽��
		Date d2 = new Date(2008, 8, 8);
		d2.detail();
	}
}

/*
����
	1������һ�������࣬���Ա�ʾ��������Ϣ��
	2��������Ҫ��
		��������޲������췽����Ĭ�ϴ���������Ϊ��1970��1��1�ա�
		��Ȼ�����˵����޲������췽��֮�⣬Ҳ���Ե����в����Ĺ��췽�����������ڶ���
*/
class Date{ // �Ժ�д���붼Ҫ��װ������˽�л��������ṩsetter and getter
	//��
	private int year;
	//��
	private int month;
	//��
	private int day;

	// ���췽���޲�
	// �����޲������췽������ʼ���������ǹ̶�ֵ��
	public Date(){
		//����: ��this�ĵ��ñ����ǹ������еĵ�һ�����
		//System.out.println(11);
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		this(1970, 1, 1);
	}
	// ���췽���в���
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// �ṩһ�����Դ�ӡ���ڵķ���
	public void detail(){
		//System.out.println(year + "��" + month + "��" + day + "��");
		System.out.println(this.year + "��" + this.month + "��" + this.day + "��");
	}

	//setter and getter
	public void setYear(int year){
		// �����ؿ�����ʱ����������ؿ���
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(int month){
		// �����ؿ�����ʱ����������ؿ���
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int day){
		// �����ؿ�����ʱ����������ؿ���
		this.day = day;
	}
	public int getDay(){
		return day;
	}
}

