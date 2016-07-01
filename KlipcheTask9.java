import java.util.Scanner;

//Дадена е правоъ­гълна матрица с числа. 
//Да се намери 
//в нея 
//максималната подмат­рица с размер 2 х 2 и да се отпечата на 
//конзолата. Под максимална подматрица се разбира 
//подматрица, която има максимална сума на елементите, които я 
//съставят
//namirat se 4etirite nai-golemi 4isla v matricata i pravi nova matrica v koqto gi izpisva tezi 4 4isla 
public class KlipcheTask9 {
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
		int[][] mas1 = new int[r][c];
		int[][] masMax = new int[2][2];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.println("vuvedi element " + (i + 1) + " " + (j + 1));
				mas[i][j] = sc.nextInt();
				mas1[i][j] = mas[i][j];// kopirame originalniq masiv
			}
		}
		for (int i = 0; i < masMax.length; i++) {
			for (int j = 0; j < masMax.length; j++) {
				int max = mas[0][0];// max- vzima max stoinost
				int ind1 = 0, ind2 = 0;// ind da zapazim mqstoto na max-a
				for (int j2 = 0; j2 < mas.length; j2++) {
					for (int k = 0; k < mas[j2].length; k++) {
						if (max < mas[j2][k]) {// ako max ne e max
							max = mas[j2][k];// max vzima stoinostta
							ind1 = j2;// i zapazvame adresa v ind 1 i ind2
							ind2 = k;
						}
					}
				}
				masMax[i][j] = max;// prehvurlqme nai-golqmata stoinost v 2x2
									// max masiva
				mas[ind1][ind2] = 0;// triem elementa ot masiva !! 6te raboti
									// samo ako maximalnite 4 4isla sa po-golemi
									// ot 0;za da raboti bez problem trqbva da
									// se slaga elementa s nai-malka vuzmojna
									// int stoinost -2^31
			}
		}
		for (int i = 0; i < mas1.length; i++) {// izkarvame originalniq masiv
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print(mas1[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < masMax.length; i++) {
			for (int j = 0; j < masMax.length; j++) {
				System.out.print(masMax[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
