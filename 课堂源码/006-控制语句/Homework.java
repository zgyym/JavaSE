/*
����ָ���·ݣ���ӡ���·������ļ��ڡ�
	3,4,5 ���� 
	6,7,8 �ļ� 
	9,10,11 �＾ 
	12, 1, 2 ����

	if��switch��дһ��
*/
class Homework1{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������Ϸ������֡������ֿ����ǣ�1 2 3 4 5 6 7 8 9 10 11 12��:");
		int i = s.nextInt();

		// if�汾
		/*
		String str = "��������ֲ��Ϸ�";
		if(i == 3 || i == 4 || i == 5){
			str = "����";
		}else if(i == 6 || i == 7 || i == 8){
			str = "�ļ�";
		}else if(i == 9 || i == 10 || i == 11){
			str = "�＾";
		}else if(i == 12 || i == 1 || i == 2){
			str = "����";
		}
		System.out.println(str);
		*/

		// switch�汾
		String str = "��������ֲ��Ϸ�";
		switch(i){
		case 3:case 4:case 5:
			str = "����";
			break;
		case 6:case 7:case 8:
			str = "�ļ�";
			break;
		case 9:case 10:case 11:
			str = "�＾";
			break;
		case 12:case 1:case 2:
			str = "����";
		}
		System.out.println(str);

	}
}

//�Ӽ��̽���һ�����֣��жϸ����ֵ�����
class Homework2{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������һ�����֣��ҿ����ж�����Ŷ��");
		// ����һ������
		//int value = s.nextInt();
		double value = s.nextDouble();
		// �жϸ���������
		/*
		if(value < 0){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		*/
		System.out.println(value < 0 ? "����" : "����");
	}
}

//�Ӽ��̽���һ�����֣��жϸ����ֵ���ż��
class Homework3{
	public static void main(String[] args){
		
		//����һ�Ρ�
		java.util.Scanner s = new java.util.Scanner(System.in);

		while(true){
			System.out.print("������һ�����֣������ж�����ż��Ŷ������0��ʾ�˳�ϵͳ����");
			int value = s.nextInt();
			if(value == 0){
				// �˳�ϵͳ����������
				return; //���潲��
			}
			System.out.println(value % 2 == 0 ? "ż��" : "����");
		}
	}
}

/*
������С�Ƚϣ����������������Ƚϴ�С��
	��x>y ��� >
	��x=y ��� =
	��x<y ��� <
*/
class Homework4{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�������1�����֣�");
		int x = s.nextInt();
		System.out.print("�������2�����֣�");
		int y = s.nextInt();
		if(x > y){
			System.out.println(x + ">" + y);
		}else if(x == y){
			System.out.println(x + "=" + y);
		}else{
			System.out.println(x + "<" + y);
		}
		// ͬѧ�ǳ���һ��ʹ�ö����Ŀ�������α������ϳ���
	}
}


/*
��д�����ɼ����������������ֱ�������num1,num2,num3�У������ǽ�������
ʹ��if-else�ṹ��������С�����˳�����
*/
class Homework5{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("�������1�����֣�");
		int x = s.nextInt();
		System.out.print("�������2�����֣�");
		int y = s.nextInt();
		System.out.print("�������3�����֣�");
		int z = s.nextInt();

		// ���ж�����ֵ�Ƿ����
		if(x == y && y == z){
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			return; //��ֹ�����򣬺��潲
		}

		// �����ܹ��ߵ�����˵��x y z���Ƕ���ȡ�
		// x��y��ȣ����Ǻ�z���� 
		if(x == y){
			if(x > z){
				System.out.println(z);
				System.out.println(x);
				System.out.println(y);
			}else{
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}
		// x��z��ȣ����Ǻ�y����
		if(x == z){ 
			if(x > y){
				System.out.println(y);
				System.out.println(x);
				System.out.println(z);
			}else{
				System.out.println(x);
				System.out.println(z);
				System.out.println(y);
			}
		}
		// y��z��ȣ����Ǻ�x����
		if(y == z){ // x y z
			if(y > x){
				System.out.println(x);	
				System.out.println(y);	
				System.out.println(z);	
			}else{
				System.out.println(y);	
				System.out.println(z);	
				System.out.println(x);
			}
		}

		// ����ִ�е�����˵�� x y z �������
		/*
		if(x > y){
			if(y > z){
				System.out.println(z);
				System.out.println(y);
				System.out.println(x);
			}else{ 
				if(x < z){
					System.out.println(y);
					System.out.println(x);
					System.out.println(z);
				}else{
					System.out.println(y);
					System.out.println(z);
					System.out.println(x);
				}
			}
		}else{
			// x < y
			// 50 < 100
		}
		*/

		// ������ȵģ�һ����6�������
		if(x > y && x > z){ // ����x������
			if(y > z){
				System.out.println(z);
				System.out.println(y);
			}else{
				System.out.println(y);
				System.out.println(z);
			}
			System.out.println(x);
		}else if(y > x && y > z){ // ����y������
			if(x > z){
				System.out.println(z);
				System.out.println(x);
			}else{
				System.out.println(x);
				System.out.println(z);
			}
			System.out.println(y);
		}else{ //����z������
			if(x > y){
				System.out.println(y);
				System.out.println(x);
			}else{
				System.out.println(x);
				System.out.println(y);
			}
			System.out.println(z);
		}
		

	}
}

/*
���𲽼�8Ԫ��3KM���ڣ�
����3KM��������ÿ����1.2Ԫ
����5KM��������ÿ����1.5Ԫ
���ڼ����Ͻ��չ��������ó��ܼۡ�
*/
class Homework6{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������ʻ�Ĺ�������");
		int dis = s.nextInt(); 
		if(dis <= 3){
			System.out.println("�ܼ��ǣ�" + 8 + "Ԫ");
		}else if(dis <= 5){
			System.out.println("�ܼ��ǣ�" + ((dis - 3) * 1.2 + 8) + "Ԫ");
		}else{
			// ���ﳬ��5KM
			System.out.println("�ܼ��ǣ�" + ((8 + 2 * 1.2) + (dis - 5) * 1.5) + "Ԫ");
		}
	}
}