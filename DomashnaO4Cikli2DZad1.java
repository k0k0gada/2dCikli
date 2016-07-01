
public class DomashnaO4Cikli2DZad1 {
	public static void main(String[] args) {
		int[][] mas = { { 48, 72, 13, 14, 15 },
				{ 21, 22, 53, 24, 75 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 65 } 
					};
		int min=mas[0][0],max=mas[0][0];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(mas[i][j]>max)
					max=mas[i][j];
				if(mas[i][j]<min)
					min=mas[i][j];
			}
		}
		System.out.println("nai-malkoto: "+ min);
		System.out.println("nai-golqmoto: "+ max);
	}
}
