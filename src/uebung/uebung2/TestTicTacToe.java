package uebung.uebung2;

public class TestTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%n%n------------------- Test TicTacToe --------------%n%n");
		TicTacToe s1 = new TicTacToe();
		s1.print();
		System.out.println();
		s1.makeMove(0, 2, State.BLACK);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen?     :   "+s1.gewonnen(State.BLACK));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		s1.makeMove(0, 0, State.RED);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.RED));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		s1.makeMove(2, 2, State.BLACK);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.BLACK));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		System.out.println();
		s1.makeMove(1, 1, State.RED);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.RED));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		s1.makeMove(1, 0, State.BLACK);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.BLACK));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		s1.makeMove(0, 1, State.RED);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.RED));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		System.out.println();
		s1.makeMove(2, 1, State.BLACK);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.BLACK));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		s1.makeMove(1, 2, State.RED);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.RED));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		s1.makeMove(1, 0, State.BLACK);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.BLACK));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		System.out.println();
		s1.makeMove(2, 0, State.RED);
		s1.print();
		System.out.println();
		System.out.println("Spiel gewonnen? :   "+s1.gewonnen(State.RED));
		System.out.println("Spiel unentschieden?:   "+ s1.unentschieden());
		
	}

}
