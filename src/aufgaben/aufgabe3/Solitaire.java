package aufgaben.aufgabe3;

public class Solitaire {

	private Moves game;
	private State[][] field;

	public Solitaire()
	{
		this.game = new Moves();
		this.field = new State[7][7];
		for(int row = 0; row < this.field.length; row++)
		{
			for(int col = 0; col < this.field[row].length; col++)
			{
				if((row < 2 || row > 4) && (col < 2 || col > 4))
				{
					this.field[row][col] = State.NOT;
				}
				else
				{
					this.field[row][col] = State.USED;
				}
			}
		}
		this.field[3][3] = State.FREE;
	}

	public void print()
	{
		for(int row = 0; row < this.field.length; row++)
		{
			for(int col = 0; col < this.field[row].length; col++)
			{
				if(this.field[row][col] == State.USED) System.out.print("O ");
				else if(this.field[row][col] == State.NOT) System.out.print("  ");
				else System.out.print("X ");
			}
			System.out.println();
		}
		System.out.println();
	}



	public boolean possibleFrom(int row, int col)
	{
		if(row>=0 && row<7 && col>=0 && col<7 && this.field[row][col]== State.USED)
		{
			if(row < 5 && this.field[row+2][col] == State.FREE && this.field[row+1][col] == State.USED) return true; 
			if(row > 1 && field[row-2][col] == State.FREE && field[row-1][col] == State.USED) return true;
			if(col < 5 && field[row][col+2] == State.FREE && field[row][col+1] == State.USED) return true;
			if(col > 1 && field[row][col-2] == State.FREE && field[row][col-1] == State.USED) return true;
		}
		return false;
	}
	
	public Point[] possibleTo(int fromRow, int fromCol)
	{
		int index = 0;
		if(!possibleFrom(fromRow, fromCol)) return new Point[index];
		if(fromRow < 5 && field[fromRow+2][fromCol] == State.FREE && field[fromRow+1][fromCol] == State.USED) index++;
		if(fromRow > 1 && field[fromRow-2][fromCol] == State.FREE && field[fromRow-1][fromCol] == State.USED) index++;
		if(fromCol < 5 && field[fromRow][fromCol+2] == State.FREE && field[fromRow][fromCol+1] == State.USED) index++;
		if(fromCol > 1 && field[fromRow][fromCol-2] == State.FREE && field[fromRow][fromCol-1] == State.USED) index++;
		Point[] p = new Point[index];
		index = 0;
		if(fromRow < 5 && field[fromRow+2][fromCol] == State.FREE && field[fromRow+1][fromCol] == State.USED)
		{
			Point p1 = new Point(fromRow+2,fromCol);
			p[index] = p1;
			index++;
		}
		if(fromRow > 1 && field[fromRow-2][fromCol] == State.FREE && field[fromRow-1][fromCol] == State.USED)
		{
			Point p2 = new Point(fromRow-2, fromCol);
			p[index] = p2;
			index++;
		}
		if(fromCol < 5 && field[fromRow][fromCol+2] == State.FREE && field[fromRow][fromCol+1] == State.USED)
		{
			Point p3 = new Point(fromRow, fromCol+2);
			p[index] = p3;
			index++;
		}
		if(fromCol >1 && field[fromRow][fromCol-2] == State.FREE && field[fromRow][fromCol-1] == State.USED)
		{
			Point p4 = new Point(fromRow, fromCol-2);
			p[index] = p4;
			index++;
		}

		return p;
	}
	
	public Moves possibleMoves()
	{
		Moves possibleMoves = new Moves();

		for( int row = 0; row < this.field.length; row++)
		{
			for(int col = 0; col < this.field[row].length; col++)
			{
				if(possibleFrom(row,col))
				{
					Point from = new Point(row, col);
					Point[] to = possibleTo(row,col);
					for(int index = 0; index < to.length; index++)
					{
						Move move = new Move(from, to[index]);
						possibleMoves.addMove(move);
					}
				}
			}
		}
		possibleMoves.printMoves();
		return possibleMoves;
	}

	public boolean movePossible()
	{
		for(int row = 0; row < this.field.length; row++)
		{
			for(int col = 0; col < this.field[row].length; col++)
			{
				if(possibleFrom(row, col))
				{
					return true;
				}
			}
		}

		return false;
	}

	//	 Von Lilit
	public void move(Move move) throws IllegalArgumentException
	{

		int middleRow = (move.getFrom().getRow() + move.getTo().getRow()) / 2;
		int middleCol = ( move.getFrom().getCol() + move.getTo().getCol()) / 2;
		try {
			this.field[move.getFrom().getRow()][move.getFrom().getCol()] = State.FREE;
			this.field[middleRow][middleCol] = State.FREE;
			this.field[move.getTo().getRow()][move.getTo().getCol()] = State.USED;	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			throw new IllegalArgumentException("Move is not possible(" + move.getFrom().getRow() + ", " + move.getFrom().getCol() + ") --> "
					+ "( " + move.getTo().getRow() + ", " + move.getTo().getCol() + ") ");
		}
	}

	public boolean moveFirstPossible()
	{ System.out.println("Make the first possible move from the following list of possible ones:");
	if(!movePossible()) return false;
	else {
		Moves possibleMoves = possibleMoves();
		Move move = possibleMoves.getMoveAtIndex(0);
		this.move(move);
	}
	return true;
	}


}
