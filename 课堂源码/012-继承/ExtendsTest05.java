//Ĭ�ϼ̳�Object��Object��������Щ�����أ�
/*
public class Object {
	 
	 // ע�⣺��Դ�뵱��һ�������ԡ�;����β���������η��б����С�native���ؼ���
	 // ��ʾ�ײ����C++д��dll����dll��̬���ӿ��ļ���
    private static native void registerNatives();

	 // ��̬�����
    static {
		  // ����registerNatives()������
        registerNatives();
    }

	 // �޲������췽��
    @HotSpotIntrinsicCandidate
    public Object() {}

	 // �ײ�Ҳ�ǵ���C++
    @HotSpotIntrinsicCandidate
    public final native Class<?> getClass();

	 // �ײ�Ҳ�ǵ���C++
    @HotSpotIntrinsicCandidate
    public native int hashCode();

	 // equals������Ӧ���ܿ�����
	 // public�ǹ�����
	 // boolean �Ƿ����ķ���ֵ����
	 // equals ��һ�������������
	 // (Object obj) �β�
	 // ֻ����Ŀǰ����֪������������ڵ����塣
    public boolean equals(Object obj) {
		 //������
       return (this == obj);
    }
    
	 // ���ж���a���봴��һ����aһģһ���Ķ�������Ե��������¡������
	 // �ײ�Ҳ�ǵ���C++
    @HotSpotIntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;

	 // һ�����ǿ��Բ���һ��toString()������
	 // public��ʾ������
	 // String �Ƿ���ֵ���ͣ�toString()����ִ�н���֮�󷵻�һ���ַ�����
	 // toString ���Ƿ�������
	 // () ��ʾ�βθ���Ϊ0
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @HotSpotIntrinsicCandidate
    public final native void notify();

    @HotSpotIntrinsicCandidate
    public final native void notifyAll();

    public final void wait() throws InterruptedException {
        wait(0L);
    }

    public final native void wait(long timeoutMillis) throws InterruptedException;

    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }

        wait(timeoutMillis);
    }
    @Deprecated(since="9")
    protected void finalize() throws Throwable { }
}
*/
public class ExtendsTest05 {

	// ExtendsTest05Ĭ�ϼ̳�Object
	// ExtendsTest05�൱������toString()����
	// ����toString()������һ��ʵ����������Ҫ����������ܵ��á�
	/*
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	*/
	
	public static void main(String[] args){

		// ��������������ִ����
		//ExtendsTest05.toString();

		// ��new����
		ExtendsTest05 et = new ExtendsTest05();
		String retValue = et.toString();

		// 2f92e0f4 ���ԡ���ͬ�����������ڶ��ڴ浱�е��ڴ��ַ��
		// ʵ�������ڴ��ַ��������ϣ�㷨���ó���ʮ�����ƽ����
		System.out.println(retValue); // ExtendsTest05@2f92e0f4

		// ��������
		Product pro = new Product();

		String retValue2 = pro.toString();
		System.out.println(retValue2); // Product@5305068a

		// �������д����ܷ�ϲ�Ϊһ�У���������
		System.out.println(pro.toString()); //Product@5305068a

		// ���ֱ����������á��أ�������������
		System.out.println(pro); //Product@5305068a

		System.out.println(100);
		System.out.println(true);
		// Product@5305068a
		System.out.println(pro); // println�������Զ�����pro��toString()������
	}
}

class Product{
	/*
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	*/
}