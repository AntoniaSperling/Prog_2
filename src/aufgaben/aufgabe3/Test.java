package aufgaben.aufgabe3;

public class Test {

	public static void main(String[] args) {
		
		Solitaire game = new Solitaire();
		System.err.println("    START");
		System.out.println();
		game.print();
		System.out.println();
		int zug =1;
		while(game.moveFirstPossible())
		{
			System.err.println("After "+ zug+". move:");
			System.out.println();
			zug++;
			game.print();	
		}

		System.out.println();
		System.out.println("No possible move");
		System.out.println();
		game.print();
		
		//Exception 
//		Move move=new Move(1,2,1,8);
//		game.move(move);


	}

}
