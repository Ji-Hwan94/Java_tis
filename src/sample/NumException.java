package sample;

public class NumException {

	public static void main(String[] args) {
		String [] stringNumber = {"23", "12", "1.14", "998"};
		
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("������ ��ȯ�� ���� " + j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "�� ������ ��ȯ �� �� �����");
		}

	}

}
