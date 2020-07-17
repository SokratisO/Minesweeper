

import java.util.Arrays;
import java.util.Random;

public class MinesweeperModel {

    Random rand = new Random();
    private int minefieldX= 10, minefieldY=10;
    private int[][] minefield;

    //Initialise and fill the minefield with 0s
    public void initialiseMinefield()
    {
        this.minefield = new int[this.minefieldX][this.minefieldY];
        for(int[] row:minefield) {
            Arrays.fill(row, 0);
        }

    }

    public void setXY(int minefieldX,int minefieldY)
    {
        this.minefieldX = minefieldX;
        this.minefieldY = minefieldY;

    }

    public int getMinefieldX() {
        return minefieldX;
    }

    public int getMinefieldY() {
        return minefieldY;
    }

    public int[][] getMinefield() {
        return minefield;
    }

    //Place the mines in the 2D array and the count of each cell
    public void placeMines(int numberOfMines)
    {
        //Place mines
        while( numberOfMines > 0)
        {
            int randomX = rand.nextInt(minefield.length);
            int randomY = rand.nextInt(minefield[0].length);
            try {
                if (minefield[randomX][randomY] != 10) {
                    minefield[randomX][randomY] = 10;
                    numberOfMines--;
                }
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array out of bounds");
            }
        }

        //Place counters
        for(int i = 0 ; i < minefield.length; i++) {
            for (int j = 0; j < minefield[0].length; j++) {
                if(minefield[i][j] !=10) {
                    try {
                        if (minefield[i - 1][j] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}
                    try {
                        if (minefield[i - 1][j-1] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}
                    try {
                        if (minefield[i - 1][j+1] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}
                    try {
                        if (minefield[i][j+1] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}
                    try {
                        if (minefield[i][j-1] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}
                    try {
                        if (minefield[i + 1][j] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}
                    try {
                        if (minefield[i + 1][j-1] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}
                    try {
                        if (minefield[i + 1][j+1] == 10)
                            minefield[i][j] ++;
                    }catch(ArrayIndexOutOfBoundsException e)
                    {}

                }

            }
        }
    }

    //Debug method to show the minefield
    public String displayMinefieldArray()
    {
        String arrayString = "";
        for(int i = 0 ; i < minefield.length; i++) {
            for (int j = 0; j < minefield[0].length; j++) {
                if(minefield[i][j] == 10)
                    arrayString += "* ";
                else
                    arrayString += minefield[i][j] + " ";
            }
            arrayString += "\n";
        }
        System.out.println(arrayString);
        return arrayString;
    }
}
