//����� ������������� �������� ��������� �� ���������� �����. 
//������� �� �������� � ��������� ������� � ������� 6 ���� � 6 
//������.
//�� �� ������� ��������, ���� ����� �� ������ ������ �� ������ 
//�������� �� �������� � ����� ������: 2,4 � 6.
//���������� �� ������� � ������ �� ����� ������� ���.
public class DomashnaO4Cikli2DZad6 {
	public static void main(String[] args) {
		int[][] mas = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int[] sum = new int[3];
		int sumI = 0;

		for (int i = 1; i < mas.length; i += 2) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
				sum[sumI] += mas[i][j];
			}
			System.out.println();
			System.out.println("sumata e :  " + sum[sumI]);
			sumI++;
		}
		int sumTot=0;
		for (int i = 0; i < sum.length; i++) {
			sumTot+=sum[i];
		}
		System.out.println("ob6tata suma e "+sumTot);sumI++;
		}
}
