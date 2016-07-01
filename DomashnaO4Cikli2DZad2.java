import java.util.Scanner;

//Имате квадратен двумерен масив от естествени числа, 
//чийто стойности
//се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
public class DomashnaO4Cikli2DZad2 {
	public static void main(String[] args) {
		int r, c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("kolko reda da ima ?");
			r = sc.nextInt();
		} while (r < 1);
		do {
			System.out.println("kolko koloni da ima ? ");
			c = sc.nextInt();
		} while (c < 1);
		int[][] mas = new int[r][c];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.println("vuvedi element " + (i + 1) + "  " + (j + 1));
				mas[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("glaven diagonal:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][i] + " ");
		}
		System.out.println("\nvtori diagonal:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((i + j) == (mas[i].length-1)) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
		
		System.out.println("\nako matricata ne e kvadrat .diagonalite sa gre6no izkarani!");
		
	}
}
