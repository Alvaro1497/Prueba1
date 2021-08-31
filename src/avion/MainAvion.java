package avion;

import java.util.Scanner;

public class MainAvion {

	public static void main(String[] args) {
//pasajeros vip
		Vip vip1 = new Vip();
		vip1.setVip("pasajeroVip1");
		vip1.setMembresia(1);

		Vip vip2 = new Vip();
		vip2.setVip("pasajeroVip2");
		vip2.setMembresia(2);

		Vip vip3 = new Vip();
		vip3.setVip("pasajeroVip3");
		vip3.setMembresia(3);

		Vip vip4 = new Vip();
		vip4.setVip("pasajeroVip4");
		vip4.setMembresia(4);

		Vip vip5 = new Vip();
		vip5.setVip("pasajeroVip5");
		vip5.setMembresia(5);

		Vip vip6 = new Vip();
		vip6.setVip("pasajeroVip6");
		vip6.setMembresia(6);

		Vip vip7 = new Vip();
		vip7.setVip("pasajeroVip7");
		vip7.setMembresia(7);

		Vip vip8 = new Vip();
		vip8.setVip("pasajeroVip8");
		vip8.setMembresia(8);

		Vip vip9 = new Vip();
		vip9.setVip("pasajeroVip9");
		vip9.setMembresia(9);

		Vip vip10 = new Vip();
		vip10.setVip("pasajeroVip10");
		vip10.setMembresia(10);

		// pasajeros economicos

		Economico eco1 = new Economico();
		eco1.setEco("pasajeroeco1");
		eco1.setDescuento(123);

		Economico eco2 = new Economico();
		eco2.setEco("pasajero eco2");
		eco2.setDescuento(123);

		Economico eco3 = new Economico();
		eco3.setEco("pasajero eco3");
		eco3.setDescuento(123);

		Economico eco4 = new Economico();
		eco4.setEco("pasajero eco4");
		eco4.setDescuento(123);

		Economico eco5 = new Economico();
		eco5.setEco("pasajero eco5");
		eco5.setDescuento(123);

		Economico eco6 = new Economico();
		eco6.setEco("pasajero eco6");
		eco6.setDescuento(123);

		Economico eco7 = new Economico();
		eco7.setEco("pasajero eco7");
		eco7.setDescuento(123);

		Economico eco8 = new Economico();
		eco8.setEco("pasajero eco8");
		eco8.setDescuento(123);

		Economico eco9 = new Economico();
		eco9.setEco("pasajero eco9");
		eco9.setDescuento(123);

		Economico eco10 = new Economico();
		eco10.setEco("pasajero eco10");
		eco10.setDescuento(123);

		MainAvion avion[][] = new MainAvion[4][5];
		avion[0][0] = vip1;
		avion[0][1] = vip2;
		avion[0][2] = vip3;
		avion[0][3] = vip4;
		avion[0][4] = vip5;
		avion[3][0] = vip6;
		avion[3][1] = vip7;
		avion[3][2] = vip8;
		avion[3][3] = vip9;
		avion[3][4] = vip10;

		avion[1][0] = eco1;
		avion[1][1] = eco2;
		avion[1][2] = eco3;
		avion[1][3] = eco4;
		avion[1][4] = eco5;
		avion[2][0] = eco6;
		avion[2][1] = eco7;
		avion[2][2] = eco8;
		avion[2][3] = eco9;
		avion[2][4] = eco10;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				System.out.print(avion  + " ");

			}
			System.out.println();
		}
		
		

	}

}
