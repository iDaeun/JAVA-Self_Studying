package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 5000000;
		
		if (i<Short.MIN_VALUE || i>Short.MAX_VALUE) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		} else {
			short b = (short) i;
			System.out.println(b);
		}


	}

}
