//Имате двумерен масив от числа, 
//чийто стойности са въведени 
//предварително. Да се отпечатат сумата на елементите на масива, 
//както и средноаритметичното на тези числа
public class DomashnaO4Cikli2DZad3 {
	public static void main(String[] args) {
		//kopirame masiva ot 1 zad.
		int[][] mas = { { 48, 72, 13, 14, 15 },
				{ 21, 22, 53, 24, 75 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 65 } 
					};
		int sum=0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				sum+=mas[i][j];
				System.out.print(mas[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("suma: \n"+sum+"\nSredno: \n"+(sum/(mas.length*mas[1].length)));
	}
}
