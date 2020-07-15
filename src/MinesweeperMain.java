public class MinesweeperMain {

    public static void main(String[] args) {
        MinesweeperModel theModel = new MinesweeperModel();
        MinesweeperView theView = new MinesweeperView();
        MinesweeperControl theControl = new MinesweeperControl(theView,theModel);
        theView.selectDifficultyFrame.setVisible(true);
    }
}
