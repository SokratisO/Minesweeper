public class MinesweeperModel {

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

}
