import java.util.Scanner;

//Дадена е правоъ­гълна матрица с числа. 
//Да се намери 
//в нея 
//максималната подмат­рица с размер 2 х 2 и да се отпечата на 
//конзолата. Под максимална подматрица се разбира 
//подматрица, която има максимална сума на елементите, които я 
//съставят
public class KlipcheTask9VtoriNachinPravilniq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0, c = 0;
		do {
			System.out.println("kolko reda ima matricata ");
			r = sc.nextInt();
		} while (r < 1);
		do {
			System.out.println("kolko kolonki ima matricata");
			c = sc.nextInt();
		} while (c < 1);
		int[][] mas = new int[r][c];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.println("vuvedi element " + (i + 1) + " " + (j + 1));
				mas[i][j] = sc.nextInt();
			}
		}
		int sum, ind1 = 0,ind2=0;
		sum = mas[0][0] + mas[1][1] + mas[0][1] + mas[1][0];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j]+ "  ");
			}
			System.out.println();
		}
		for (int i = 1; i < mas.length - 1; i++) {
			for (int j = 0; j < mas[i].length - 1; j++) {
				if (sum < mas[i][j] + mas[i + 1][j + 1] + mas[i + 1][j] + mas[i][j + 1]) {
					sum = mas[i][j] + mas[i + 1][j + 1] + mas[i + 1][j] + mas[i][j + 1];
					ind1=i;
					ind2=j;
				}
			}
		}
		System.out.println("nai-golqmata podmatrica");
		System.out.println(mas[ind1][ind2]+ " "+mas[ind1][ind2+1]);
		System.out.println(mas[ind1+1][ind2]+ " "+mas[ind1+1][ind2+1]);
		sc.close();
	}
}
