/*
��д����ʵ�����ֵ������������ֿ��Ե��಻ͬ�������Ӷ�������ͬ��������
���Ե���������������������ٺ����á�
	ʵ��˼·���ؼ����룺
		1)����������Instrument����������makeSound()
		2)��������������ࣺ����Erhu������Piano��С����Violin
		3)����������Musician�����Ե����������play(Instrument i)
		4)��������࣬�����ֲ�ͬ��������������
*/
public class Homework{
	public static void main(String[] args){
		/*
		// ����������������
		Erhu erhu = new Erhu();
		Piano piano = new Piano();
		Violin violin = new Violin();
		// �������ֶ���
		Musician musician = new Musician();
		// play
		musician.play(erhu);
		musician.play(piano);
		musician.play(violin);
		*/

		/*
		// ����������������
		Instrument erhu = new Erhu();
		Instrument piano = new Piano();
		Instrument violin = new Violin();
		// �������ֶ���
		Musician musician = new Musician();
		// play
		musician.play(erhu);
		musician.play(piano);
		musician.play(violin);
		*/

		// �������ֶ���
		Musician musician = new Musician();
		// play
		musician.play(new Erhu());
		musician.play(new Piano());
		musician.play(new Violin());
	}
}

// ��һ��д��
/*
// ����
class Musician{
	// ʵ������
	Instrument i;
	// ���췽��
	public Musician(){
	}
	public Musician(Instrument i){
		this.i = i;
	}
	// play()����
	public void play(){
		i.makeSound();
	}
}
*/

// �ڶ���д�������������⣩
// ����
class Musician{

	// ���ֵ�����
	//private String name;

	public void play(Instrument i){
		// ����׶�makeSound()������Instrument�ġ�
		// ���н׶����makeSound()�����Ͳ�һ����˭���ˡ�
		i.makeSound();
	}
}

// ��������
class Instrument{
	// ��������
	public void makeSound(){
	
	}
}

// ����
class Erhu extends Instrument{
	public void makeSound(){
		System.out.println("����������������");
	}
}
// ����
class Piano extends Instrument{
	public void makeSound(){
		System.out.println("���ٵ�����������");
	}
}
// ����
class Violin extends Instrument{
	public void makeSound(){
		System.out.println("С���ٵ�����������");
	}
}

