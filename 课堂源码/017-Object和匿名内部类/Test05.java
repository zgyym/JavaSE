
// equals������д��ʱ��Ҫ���ס�

public class Test05{
	public static void main(String[] args){
		
		// ��̬���Զ�����ת������
		Object o1 = new String("hello world!");
		Object o2 = new User();
		Object o3 = new Address();

		User u1 = new User("zhangsan", new Address("����","������","11111"));
		User u2 = new User("zhangsan", new Address("����","������","11111"));

		System.out.println(u1.equals(u2)); // true

		User u3 = new User("zhangsan", new Address("����","������","11112"));
		System.out.println(u1.equals(u3)); // false
	}
}

class User{
	// �û���
	String name; 
	// �û���סַ
	Address addr;

	public User(){
	}
	public User(String name, Address addr){
		this.name = name;
		this.addr = addr;
	}

	// ��дequals����
	// ��д���򣺵�һ���û����û����ͼ�ͥסַ����ͬ����ʾͬһ���û���
	// ���equals�жϵ���User�����User�����Ƿ���ȡ�
	public boolean equals(Object obj){
		// �û������û�����ͬ��סַ��סַ��ͬ��ʱ���϶���ͬһ���û���
		if(obj == null || !(obj instanceof User)) return false;
		if(this == obj) return true;
		
		User u = (User)obj;
		if(this.name.equals(u.name) && this.addr.equals(u.addr)){
			return true;
		}
		return false;
	}
}

class Address{
	String city;
	String street;
	String zipcode;

	public Address(){
	
	}
	public Address(String city,String street,String zipcode){
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	// ע�⣺���ﲢû����дequals������
	// �����equals�����жϵ��ǣ�Address�����Address�����Ƿ���ȡ�
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Address)) return false;
		if(this == obj) return true;
		// ��ô���Ǽ�ͥסַ��ͬ�أ�
		// ������ͬ���ֵ���ͬ���ʱ���ͬ����ʾ��ͬ��
		Address a = (Address)obj;
		if(this.city.equals(a.city) 
			&& this.street.equals(a.street) 
			&& this.zipcode.equals(a.zipcode)){
			return true;
		}
		return false;
	}
}