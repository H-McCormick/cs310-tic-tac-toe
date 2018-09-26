package edu.jsu.mcis;

public class TicTacToeModel {
    
    private static final int DEFAULT_WIDTH = 3;
    
    /* Mark (represents X, O, or an empty square */
    
    public enum Mark {
        
        X("X"), 
        O("O"), 
        EMPTY("-");

        private String message;
        
        private Mark(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    /* Result (represents the final state of the game: X wins, O wins, a tie,
       or NONE if the game is not yet over) */
    
    public enum Result {
        
        X("X"), 
        O("O"), 
        TIE("Tie"), 
        NONE("none");

        private String message;
        
        private Result(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    private Mark[][] grid; /* Game grid */
    private boolean xTurn; /* True if X is current player */
    private int width;     /* Size of game grid */
    
    
    /* DEFAULT CONSTRUCTOR */
    
    public TicTacToeModel() {
        
        /* No arguments (call main constructor; use default size) */
        
        this(DEFAULT_WIDTH);
        
    }
    
    /* CONSTRUCTOR */
    
    public TicTacToeModel(int width) {
        
        /* Initialize width; X goes first */
        
        this.width = width;
        xTurn = true;
        //Create.newgrid = [width][width];
        //grid = [width][width];
        
        /* Create grid (width x width) as a 2D Mark array */

        
        
        grid = new Mark[width][width];

        /* Initialize grid by filling every square with empty marks */
        System.out.println(" 0  1 2 ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = Mark.EMPTY;
                //System.out.print(" " + grid[i][j] + " " + "\n");
                //System.out.print(" " + grid[i][j] + " " + "\n");
            }
        }

        System.out.print("0" + " " + Mark.EMPTY + " " + Mark.EMPTY + " "  + Mark.EMPTY + "\n");
        System.out.print("1" + " " + Mark.EMPTY + " " + Mark.EMPTY + " "  + Mark.EMPTY + "\n");
        System.out.print("2" + " " + Mark.EMPTY + " " + Mark.EMPTY + " "  + Mark.EMPTY + "\n");
                

        }

     
        /* int i = 0;
        do {
            System.out.print( " " + grid[i][j] + " " + " " + grid[i][j] + " " + " " + grid[i][j] + " " + "\n");
            i++;
        } while (i < width);
        
    } */

    public boolean makeMark(int row, int col) {
        
        /* Place the current player's mark in the square at the specified
           location, but only if the location is valid and if the square is
           empty! */
        
        /* INSERT YOUR CODE HERE */
        /*
        if (isValidSquare = true) {
            if (isSquareMarked = false) { 
                return true;
            }
            else {
                return false;
            }
                
            
        } 
        */

        return false; /* remove this line! */
        
    }
	
    private boolean isValidSquare(int row, int col) {
        
        /* Return true if specified location is within grid bounds */
        
        /* INSERT YOUR CODE HERE */
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == Mark.EMPTY) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }    
            }
        
        

        //return false; /* remove this line! */
       return true; 
    }

	
    private boolean isSquareMarked(int row, int col) {
        
        /* Return true if square at specified location is marked */
        
        /* INSERT YOUR CODE HERE */
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == Mark.EMPTY) {
                    return true; 
                }
                else if (grid[i][j] == Mark.X) {
                    return false;
                }
                else {
                    return false;
                 }
                }

            }
        
        return true;

       // return false; /* remove this line! */
            
    }
	
    public Mark getMark(int row, int col) {
        
        /* Return mark from the square at the specified location */
        
        /* INSERT YOUR CODE HERE */
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == Mark.X) {
                    return Mark.X;
                }
                else if (grid[i][j] == Mark.O) {
                    return Mark.O;
                }
                }
            }
        


         return Mark.X; /* remove this line! */
      
    }
	
    public Result getResult() {
        
        /* Use isMarkWin() to see if X or O is the winner, if the game is a
           tie, or if the game is not over, and return the corresponding Result
           value */
        
        /* INSERT YOUR CODE HERE */

        return null; /* remove this line! */

    }
	
    private boolean isMarkWin(Mark mark) {
        
        /* Check the squares of the board to see if the specified mark is the
           winner */
        
        /* INSERT YOUR CODE HERE */

        return false; /* remove this line! */

    }
	
    private boolean isTie() {
        
        /* Check the squares of the board to see if the game is a tie */

        /* INSERT YOUR CODE HERE */

        return false; /* remove this line! */
        
    }

    public boolean isGameover() {
        
        /* Return true if the game is over */
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] != Mark.EMPTY) {
                    return true; 
                }
                else {
                    return false;
                }
                }
            }
        
        
        return Result.NONE != getResult();
        
    }

    public boolean isXTurn() {
        
        /* Getter for xTurn */
        
        return xTurn;
        
    }

    public int getWidth() {
        
        /* Getter for width */
        
        return width;
        
    }
    
}