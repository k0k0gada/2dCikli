//Имате предварително въведени стойности от естествени числа,  
//въведени в квадратна таблица с размери 6 реда и 6 колони.

//Да се състави програма , чрез която се намира сумата на всички 
//елементи, чиято сума на индекси за ред и колона е четно число. 
//Програмата да извежда формираните суми за всеки отделен ред на 
//квадратната таблица, както и общата сума от тези елементи.
//Да се използва само един цикъл.
public class DomashnaO4Cikli2DZad7 {
	public static void main(String[] args) {
		int[][] mas = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sumChetni = 0;
		int sumRow = 0;
		for (int i = 0; i < mas.length * mas.length; i++) {
			if ((i / mas.length + i % mas.length) % 2 == 0) {
				System.out.print(mas[i / mas.length][i % mas.length] + " ");
				sumChetni += mas[i / mas.length][i % mas.length];
				sumRow += mas[i / mas.length][i % mas.length];
			}
			if (i % mas.length == 5) {
				System.out.println("sumata za reda e " + sumRow);
				sumRow = 0;
			}
		}
		System.out.println("cqlata suma e : " + sumChetni);
	}
}
