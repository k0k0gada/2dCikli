import java.util.Scanner;

//����� ��������� �������� ����� �� ���������� �����, 
//����� ���������
//�� �������� �� ���������. �� �� ��������� ����������� �� ������.
public class DomashnaO4Cikli2DZad2VtoriNachin {
	public static void main(String[] args) {
		int r, c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("kolko da e golqma kvadratnata matrica ?");
			r = sc.nextInt();
		} while (r < 1);
		int[][] mas = new int[r][r];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.println("vuvedi element " + (i + 1) + "  " + (j + 1));
				mas[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		System.out.println("glaven diagonal:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][i] + " ");
		}
		System.out.println("\nvtori diagonal:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((i + j) == (mas[i].length - 1)) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
	}
}
