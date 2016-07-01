//Имате предварително въведени стойности на елементи в двумерен 
//масив - естествени числа.
//Да се състави програма, чрез която се извеждат стойностите на 
//елементите в двумерен масив след обръщането му на +90 градуса.

public class DomashnaO4Cikli2DZad4 {
	public static void main(String[] args) {
		int[][] mas = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		int[][] mas1 = new int[mas.length][mas[1].length];
		System.out.println();
		int k = 3;
		int k1 = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				while (k > -1) {
					mas1[i][j] = mas[k][k1];
					k--;
					j++;
				}
				k = 3;
				k1++;
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print(mas1[i][j] + " ");
			}
			System.out.println();
		}

	}
}
