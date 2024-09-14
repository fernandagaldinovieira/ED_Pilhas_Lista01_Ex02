package view;

import model.Pilhas02;

public class Main {

	public static void main(String[] args) {
		
		Pilhas02 P1 = new Pilhas02();
		
		P1.push(40);
		P1.push(30);
		P1.push(25);
		P1.push(10);
		
		
		Pilhas02 P2 = new Pilhas02();
		
		P2.push(34);
		P2.push(60);
		P2.push(28);
		P2.push(15);
		
		Pilhas02 P3 = new Pilhas02();
		
		P3.push(20);
		P3.push(35);
		
		Pilhas02 A1 = new Pilhas02();
		Pilhas02 A2 = new Pilhas02();

		while(!P1.isEmpty() || !P2.isEmpty()) {
			try {
				if (!P1.isEmpty()) {
					A1.push(P1.pop());
				}
				if (!P2.isEmpty()) {
					A1.push(P2.pop());
				} 
			} catch (Exception e) {
					e.printStackTrace();
			}
		}
		
		while(!P3.isEmpty()) {
			try {
				A1.push(P3.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		while(!A1.isEmpty()) {
			try {
				A2.push(A1.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (!A2.isEmpty()) {
				try {
					System.out.println(A2.pop());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

