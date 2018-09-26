package edu.jsu.mcis;
import java.util.*;

import edu.jsu.mcis.TicTacToeModel.Mark;

public class TicTacToeView {

    private TicTacToeModel model;
    public int playerInput;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
        //System.out.print(model);

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */
        
        /* INSERT YOUR CODE HERE */
        

        System.out.println("Enter the row and column numbers, seperated by a space: ");
        Scanner in = new Scanner(System.in);
        playerInput = in.nextInt();
        /* for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                if (answer == "0 0" && grid[i][j] == Mark.EMPTY)  {
                    grid[i][j] = Mark.X;
                    System.out.print(grid[i][j]);
            }
        }
    } */
         ArrayList<Integer> inputs = new ArrayList<>();
        Integer next;
        int nextInt = in.nextInt();
        next = nextInt;
        inputs.add(next); 


    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        
        if (playerInput > 2) {
            System.out.println("ERROR: Invalid input, please try again");
        }
    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}