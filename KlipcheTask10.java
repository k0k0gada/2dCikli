import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

//Напишете програма, която намира най-често срещания елемент 
//в масив. Пример: { 4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3} => 4 (5 times).
public class KlipcheTask10 {
	public static void main(String[] args) {
		System.out.println("iska6 li da vuvejda6 masiv ili da polzva6 demoto(1-demo;2-za vuvejdane");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			int[] masDemo = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };
			int br = 0, temp = 0, brPerm = 0, tempPerm = 0;
			for (int i = 0; i < masDemo.length; i++) {
				for (int j = i; j < masDemo.length; j++) {
					if (masDemo[i] == masDemo[j]) {
						br++;
						temp = masDemo[j];
					}
				}
				if (brPerm < br) {
					tempPerm = temp;
					brPerm = br;
				}
				br = 0;
				temp = 0;
			}
			for (int i = 0; i < masDemo.length; i++) {
				System.out.print(masDemo[i] + " ");
			}
			System.out.println("elementa " + tempPerm + " se povtarq nai-mnogo puti .Te sa " + brPerm);
			break;

		case 2:
			int n = 0;
			do {
				System.out.println(" kolko elementa 6te ima masiva");
				n = sc.nextInt();
			} while (n < 1);
			int[] mas = new int[n];
			for (int i = 0; i < mas.length; i++) {
				System.out.println("vuvedi element " + (i + 1));
				mas[i] = sc.nextInt();
			}
			br = 0;
			temp = 0;
			brPerm = 0;
			tempPerm = 0;
			for (int i = 0; i < mas.length; i++) {
				for (int j = i; j < mas.length; j++) {
					if (mas[j] == mas[i]) {
						br++;
						temp = mas[j];
					}
				}
				if (brPerm < br) {
					tempPerm = temp;
					brPerm = br;
				}
				br = 0;
				temp = 0;
			}
			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i] + " ");
			}
			System.out.println("Purviq sre6tnat element koito se povtarq nai -mnogo puti e " + tempPerm
					+ " i se povtarq " + brPerm + " puti ");
			break;
		default:
			System.out.println("gre6no vuvejdane.bye bye");

		}
		sc.close();
	}
}
