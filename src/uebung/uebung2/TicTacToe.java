package uebung.uebung2;

public class TicTacToe {

	State[][] field;

	public TicTacToe()
	{
		field = new State[3][3];
		for(int i=0; i<this.field.length; i++)
		{
			for(int j=0; j<this.field[i].length; j++)
			{
				field[i][j]=State.EMPTY;
			}
		}
	}

	public void makeMove(int row, int col, State player)
	{
		if(row>= 0 && row < this.field.length && col >= 0 && col < this.field[row].length && 
				this.field[row][col] == State.EMPTY)
		{
			if(player!=State.EMPTY)   
			{	
				field[row][col]=player;
			}
		}
	}

	public void print()
	{
		for(int row = 0; row< field.length; row++)
		{
			for(int col = 0; col < field[row].length; col++)
			{
				if(field[row][col] == State.EMPTY)
				{
					System.out.print("- ");
				}
				else if(field[row][col] == State.RED)
				{
					System.out.print("x ");
				}
				else
				{
					System.out.print("o ");
				}
			}
			System.out.println();
		}
	}
	
	/*public boolean gewonnen(State player)
	{
		if(player == State.EMPTY) return false;
		
		for(int row = 0; row < this.field.length; row++)
		{
			if(this.field[row][0] == player && this.field[row][1] == player && this.field[row][0] == player)
			{
				return true;
			}
		}
		for(int col = 0; col < this.field.length; col++)
		{
			if(this.field[0][col] == player && this.field[1][col] == player && this.field[2][col] == player)
			{
				return true;
			}
		}
		if(this.field[0][0]== player && this.field[1][1] == player && this.field[2][2] == player)
		{
			return true;
		}
		if(this.field[0][2]== player && this.field[1][1] == player && this.field[2][0] == player)
		{
			return true;
		}

			return false;
	}*/
	
	  public boolean gewonnen(State player)
	    {
	        if(player == State.EMPTY) return false;

	        // alle drei Zeilen pruefen
	        for(int row=0; row<this.field.length; row++)
	        {
	            if(this.field[row][0] == player && this.field[row][1] == player && this.field[row][2] == player)
	            {
	                return true;
	            }
	        }

	        // alle drei Spalten pruefen
	        for(int col=0; col<this.field.length; col++)
	        {
	            if(this.field[0][col] == player && this.field[1][col] == player && this.field[2][col] == player)
	            {
	                return true;
	            }
	        }

	        // Diagonale von links oben nach rechts unten
	        if(this.field[0][0] == player && this.field[1][1] == player && this.field[2][2] == player)
	        {
	            return true;
	        }

	        // Diagonale von rechts oben nach links unten
	        if(this.field[0][2] == player && this.field[1][1] == player && this.field[2][0] == player)
	        {
	            return true;
	        }
	        return false;
	    }
	
	public boolean voll()
	{
		for(int row = 0; row < this.field.length; row++)
		{
			for(int col = 0; col < this.field[row].length; col++)
			{
				if(this.field[row][col]== State.EMPTY)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean unentschieden()
	{
		return (this.voll()&& ! this.gewonnen(State.BLACK)&& !this.gewonnen(State.RED));
	}
	
}
