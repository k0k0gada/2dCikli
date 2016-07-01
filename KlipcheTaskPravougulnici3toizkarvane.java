import java.util.Scanner;

public class KlipcheTaskPravougulnici3toizkarvane {
	public static void main(String[] args) {
		int r, c;// row coloumn
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("kolko reda ima matricata ");
			r = sc.nextInt();
		} while (r < 1);
		do {
			System.out.println("kolko kolonki ima matricata");
			c = sc.nextInt();
		} while (c < 1);
		int br = 1;
		int[][] mas = new int[r][c];
		for (int i = 0; i < mas.length; i++) {// normalen masiv
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = br;
				br++;
			}
		}
		System.out.println("purvi na4in(normalno) na izkarvane");// normalno izkarvane
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("treti na4in na izkarvane");
		int[][] mas1 = new int[r][c];
		int k1 = 0, z = 0;
		int lesserLength;
		if (mas1.length < mas1[0].length) {
			lesserLength = mas1.length;
		} else {
			lesserLength = mas1[0].length;
		}
//		int greaterLength;
//		if(mas1.length > mas1[0].length) {
//			greaterLength = mas1.length;
//		} else {
//			greaterLength = mas1[0].length;
//		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {

				if (z < lesserLength) {
					k1 = z;
					for (int k = 0; k <= z; k++) {
						mas1[k1][z - k1] = mas[i][j];
						k1--;
						j++;
						if (j == mas1[i].length) {
							j = 0;
							i++;
						}
					}
					if (j == 0) {
						j = mas1[i].length;
						i--;
					} else {
						j--;
					}

				} else {
					if (mas[0].length > mas.length) {
						k1 = lesserLength - 1;
						for (int k = 0; k < lesserLength; k++) {
							if((z-k1)==mas1[k1].length){
								break;
							}
							if (i == mas.length || mas[i].length == j) {
								break;
							}
							mas1[k1][z - k1] = mas[i][j];
							k1--;
							j++;
							if (j == mas1[i].length) {
								j = 0;
								i++;
							}
						}
						if (j == 0) {
							j = mas1[i].length;
							i--;
						} else {
							j--;
						}
						if (i == mas.length || mas[i].length == j) {
							break;
						}

						
					} else {
						k1 = z;
						while (k1 >= mas1.length) {
							k1--;
						}
						for (int k = 0; k < lesserLength; k++) {
							if (i == mas.length || mas[i].length == j) {
								break;
							}
							if((z-k1)==mas1[k1].length){
								break;
							}
							mas1[k1][z - k1] = mas[i][j];
							k1--;
							j++;
							if (j == mas1[i].length) {
								j = 0;
								i++;
							}
						}
						if (i == mas.length || mas[i].length == j) {
							break;
						}
						if (j == 0) {
							j = mas1[i].length;
							i--;
						} else {
							j--;
						}
					}
				}
				if (i == mas.length && mas[i].length == j) {
					break;
				}
				z++;
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
