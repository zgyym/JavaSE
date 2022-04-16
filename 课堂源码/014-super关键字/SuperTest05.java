
/*
	1、“this.”和“super.”大部分情况下都是可以省略的。
	2、this. 什么时候不能省略？
		public void setName(String name){
			this.name = name;
		}
	3、super. 什么时候不能省略？
		父中有，子中又有，如果想在子中访问“父的特征”，super. 不能省略。
*/
public class SuperTest05{
	public static void main(String[] args){
		Vip v = new Vip("张三");
		v.shopping();
		//父类中定义了一个需要访问自身实例变量的方法i，在主方法中new了一个子类型的引用指向子类型的对象，
		//这时候在主方法中调用这个方法i
		//方法i中的实例变量会是父类中的值，而不是子类中的值
		/*
		当一个类继承于另一个类，子类中没有父类的方法时。用子类的对象调用方法时，会首先在子类中查找，
		如果子类中没有改方法，再到父类中查找。

		当一个方法只在父类中定义时，调用该方法时会使用父类中的属性。
		如果该方法中又调用了其他方法，那么还是按照之前的顺序，先在子类中查找，再在父类中查找。

		*/

		v.doSome();
	}
}
class Customer {
	String name;
	public Customer(){}
	public Customer(String name){
		super();
		this.name = name;
	}

	public void doSome(){
		System.out.println(this.name + " do some!");
		System.out.println(name + " do some!");
		//错误: 找不到符号
		//System.out.println(super.name + " do some!");
	}
}
class Vip extends Customer{

	// 假设子类也有一个同名属性
	// java中允许在子类中出现和父类一样的同名变量/同名属性。
	String name; // 实例变量

	public Vip(){
	}
	public Vip(String name){
		super(name);
		//this.name = null;
	}
	public void shopping(){
		/*
			java是怎么来区分子类和父类的同名属性的？
				this.name：当前对象的name属性
				super.name：当前对象的父类型特征中的name属性。
		*/
		System.out.println(this.name + "正在购物!"); // null 正在购物
		System.out.println(super.name + "正在购物!"); // 张三正在购物
		System.out.println(name + "正在购物!"); //null 正在购物
	}
	
	
}
