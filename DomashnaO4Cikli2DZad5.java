//Да се състави програма, при която предварително са въведени 
//естествени числа в двумерен масив 4*4 елемента.
//Програмата да извежда резултат от проверката какво е съотношението
//на най-голямата сума по редове спрямо най-голямата сума по колони.
public class DomashnaO4Cikli2DZad5 {
	public static void main(String[] args) {
		int[][] mas = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		int[] sumRow = new int[mas.length];
		int[] sumCol = new int[mas[0].length];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				sumRow[i] += mas[i][j];
				sumCol[j] += mas[i][j];
			}
		}
		int maxSumCol = 0;
		int maxSumRow = 0;
		for (int i = 0; i < sumCol.length; i++) {
			if (maxSumCol < sumCol[i]) {
				maxSumCol = sumCol[i];
			}
			if (maxSumRow < sumRow[i]) {
				maxSumRow = sumRow[i];
			}
		}
		double suotno=(maxSumRow*100)/maxSumCol;
		System.out.println("syotno6enieto mejdu max red/max kolona e : " + (suotno/100));
	}
}
