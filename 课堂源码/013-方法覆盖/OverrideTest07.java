
public class OverrideTest07{
	public static void main(String[] args){
		// һ����д��ʱ���Ǹ���ճ������Ҫ������Ҫ�ġ�	
	}
}

class Animal{
	/*
	public double sum(int a, int b){
		return a + b;
	}
	*/
	
	/*
	public long sum(int a, int b){
		return a + b;
	}
	*/

	/*
	public int sum(int a, int b){
		return a + b;
	}
	*/
}

class Cat extends Animal{
	// ��д
	// ����: Cat�е�sum(int,int)�޷�����Animal�е�sum(int,int)
	/*
	public int sum(int a, int b){
		return a + b;
	}
	*/
	
	/*
	public double sum(int a, int b){
		return a + b;
	}
	*/

	//����: Cat�е�sum(int,int)�޷�����Animal�е�sum(int,int)
	/*
	public long sum(int a, int b){
		return a + b;
	}
	*/
}

// ����
class MyClass1{
	
	public Animal getAnimal(){
		return null;
	}
}

// ����
class MyClass2 extends MyClass1{

	// ��д����ķ���
	/*
	public Animal getAnimal(){
		return null;
	}
	*/

	// ��д��ʱ�򷵻�ֵ������Animal�����Cat����С�ˡ������ԣ�java������
	/*
	public Cat getAnimal(){
		return null;
	}
	*/

	// ��д��ʱ�򷵻�ֵ������Animal�����Object������ˡ������У�java�в�����
	/*
	public Object getAnimal(){
		return null;
	}
	*/
}