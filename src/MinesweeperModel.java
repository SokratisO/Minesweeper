import java.util.Random;

public class MinesweeperModel {

    Random rand = new Random();
    private int minefieldX, minefieldY;
    private int[][] minefield;

    public void initialiseMinefield()
    {
        this.minefield = new int[this.minefieldX][this.minefieldY];
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

    public void placeMines(int numberOfMines)
    {
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
    }
}
