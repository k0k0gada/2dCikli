import java.rmi.dgc.Lease;
import java.util.Scanner;

public class KlipcheTaskPravougulnici {
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
		System.out.println("purvi na4in(normalno) na izkarvane");// normalno
		sc.close();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("vtori na4in na izkarvane");
		br = 1;
		for (int i = 0; i < mas.length; i++) {// vtoro izkarvane masiva se
												// prezapisva ne e originalniq
			br = 1 + i;
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = br;
				br += mas.length;
			}
		}
		for (int i = 0; i < mas.length; i++) {// izkarvane
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("treti na4in na izkarvane");
		br = 1;// normalizirame masiva
		for (int i = 0; i < mas.length; i++) {// normalen masiv
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = br;
				br++;
			}
		}
		int[][] mas1 = new int[r][c];// nov masiv zapisva jelaniq izhod
		int k1 = 0, z = 0;// z=suma ot diagonala koito se izpisva ,k1-indeksite
							// na noviq masiv
		int lesserLength;// namirame po-malkata ot 2te duljini
		if (mas1.length < mas1[0].length) {
			lesserLength = mas1.length;
		} else {
			lesserLength = mas1[0].length;
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {// vzimame posledovatelno
														// vsi4kite stoinosti ot
														// originalniq masiv

				if (z < lesserLength) {// ako sumata ot 2ta nomera na indeksite
										// na diagonalite sa po-malki ot
										// po-malkata duljina na masiva
					k1 = z;// purviq indeks ot [k1][z-k1]
					for (int k = 0; k <= z; k++) {// imame da izpisvame z na
													// broi 4isla za 00-1;za
													// 01,10-2;20,11,02-3....
						mas1[k1][z - k1] = mas[i][j];// zapisvame v purvoto
														// 4islo purviq element
														// na masiva
						k1--;// k1 namalqva
						j++;// sledva6toto 4islo ot originalniq masiv
						if (j == mas1[i].length) {// proverka dali sledva6toto
													// 4islo ne e stignalo kraq
													// na podmasiva si
							j = 0;
							i++;
						}
					}
					if (j == 0) {// tui kato i & j se vurtqt v dvata originalni
									// for-a trqbva da vyrnem edin element nazad
						j = mas1[i].length;
						i--;
					} else {
						j--;
					}

				} else {// ako sumata na dvete 4isla nadminava sbora ot
						// indeksite na elementite
					if (mas[0].length > mas.length) {// i masiva e po-dulug
														// otkolkoto 6irok
						k1 = lesserLength - 1;// k1 trqbva da zapo4va ot
												// po-malkata duljina -1
						for (int k = 0; k < lesserLength; k++) {// imame da
																// izpisvame z
																// na broi 4isla
																// za 00-1;za
																// 01,10-2;20,11,02-3....
							if ((z - k1) == mas1[k1].length) {// no ako vtoriq
																// indeks(z-k1)
																// e dostignal
																// duljinata na
																// masiva
																// spirame da
																// izkarvame
																// 4isla
								break;
							}
							if (i == mas.length || mas[i].length == j) {// ako e
																		// svur6ill
																		// originalniq
																		// masiv
																		// nqma
																		// kakvo
																		// pove4e
																		// da
																		// vzimame
																		// ot
																		// nego
								break;
							}
							mas1[k1][z - k1] = mas[i][j];
							k1--;
							j++;
							if (j == mas1[i].length) {// otnovo proverka za
														// originalniq masiv
														// kade se namirame
								j = 0;
								i++;
							}
						}
						if (j == 0) {// otnovo vru6tane edna poziciq na
										// originalniq masiv(zaradi 2ta for-a)
							j = mas1[0].length;
							i--;
						} else {
							j--;
						}
						if (i == mas.length || mas[i].length == j) {// ako sme
																	// stignali
																	// kraq na
																	// masiva
																	// izlizame
																	// ot
																	// for-ovete
							break;
						}

					} else {// ili puk masiva e po-6irok ot kolkoto dulug
						k1 = z;// k1 stava ravno na z(narisuvai si masiv i 6te
								// go vidi6)
						while (k1 >= mas1.length) {// ako se slu4i taka 4e
													// na4alniq element e
													// po-golqm ot duljinata go
													// karame da se smalii
							k1--;
						}
						for (int k = 0; k < lesserLength; k++) {// imame da
																// izpisvame
																// elementi
																// kolkoto e
																// razmera
																// po-kusata
																// strana na
																// masiva
							if (i == mas.length || mas[i].length == j) {// proverka
																		// dali
																		// ne
																		// sme v
																		// kraq
																		// na
																		// originalniq
																		// masiv
								break;
							}
							if ((z - k1) == mas1[k1].length) {// proverka dali
																// ne sme izvun
																// noviq masiv
								break;
							}
							mas1[k1][z - k1] = mas[i][j];
							k1--;
							j++;
							if (j == mas1[i].length) {// orig.masiv sledva6t
														// element
								j = 0;
								i++;
							}
						}
						if (i == mas.length || mas[i].length == j) {
							break;// proverka dali ne sme v kraq na orig.masiv
						}
						if (j == 0) {// vru6tame nazad edin element zarad
										// for-ovete
							j = mas1[i].length;
							i--;
						} else {
							j--;
						}
					}
				}
				if (i == mas.length && mas[i].length == j) {// izlizame i ot
															// for-ovete ako sme
															// v kraq na masiva
					break;
				}
				z++;
			}
		}
		for (int i = 0; i < mas1.length; i++) {// print-vame noviq masiv kakto
												// trqq da izglejda
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print(mas1[i][j] + " ");
			}
			System.out.println();
		}
		int[][] mas2 = new int[r][c];
		System.out.println("4etvurto izkarvane :");
		int k = 0, k2 = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				while (k < mas.length && k > -1) {
					mas2[k][k2] = mas[i][j];
					if (k2 % 2 == 0) {
						k++;
					} else {
						k--;
					}
					j++;
					if (j == mas[0].length) {
						j = 0;
						i++;
					}
				}
				if (j == 0) {// vru6tame nazad edin element zarad
					// for-ovete
					j = mas2[0].length;
					i--;
				} else {
					j--;
				}
				if (k == mas1.length) {
					k--;
				} else {
					k = 0;
				}
				k2++;
			}
		}
		for (int i = 0; i < mas1.length; i++) {// print-vame noviq masiv kakto
			// trqq da izglejda
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.print(mas2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("RAZGELE");
	}
}
