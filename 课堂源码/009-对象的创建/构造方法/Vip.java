public class Vip{

	// ��Ա��
	long no;

	// ��Ա����
	String name;

	// ����
	String birth;

	// �Ա�
	boolean sex;

	//�޲������췽��
	public Vip(){

	}

	//�в������췽��
	public Vip(long huiYuanHao, String xingMing){
		// ��ʵ��������ֵ����ʼ��ʵ����������ʼ�����ԡ�
		no = huiYuanHao;
		name = xingMing;
		// ʵ�������ﻹ�����д��루û���ֶ���ֵ��ϵͳ����Ĭ�ϸ�ֵ����
		//birth = null;
		//sex = false;
	}

	//�в������췽��
	public Vip(long huiYuanHao,String xingMing, String shengRi){
		no = huiYuanHao;
		name = xingMing;
		birth = shengRi;
		// ʵ����������һ��Ĭ�ϵĴ���
		//sex = false;
	}

	//�в����Ĺ��췽��
	public Vip(long huiYuanHao,String xingMing,String shengRi,boolean xingBie){
		no = huiYuanHao;
		name = xingMing;
		birth = shengRi;
		sex = xingBie;
	}
}