import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperControl {
    MinesweeperView theView;
    MinesweeperModel theModel;
    private int numberOfMines;
    MinesweeperControl(MinesweeperView theView,MinesweeperModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addListener(new minesweeperListener());
    }

    public class minesweeperListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == theView.easyButton)
            {
                initialiseGameBoard(easyPreset());
                theView.consoleTextAreaTBR.setText(theModel.displayMinefieldArray());
            }
            if(e.getSource() == theView.normalButton)
            {
                initialiseGameBoard(normalPreset());
                theView.consoleTextAreaTBR.setText(theModel.displayMinefieldArray());
            }
            if(e.getSource() == theView.hardButton)
            {
                initialiseGameBoard(hardPreset());
                theView.consoleTextAreaTBR.setText(theModel.displayMinefieldArray());
            }
        }
    }

    private int easyPreset(){
        numberOfMines = 25;
        theModel.setXY(10,10);

        return numberOfMines;
    }

    private int normalPreset(){
        numberOfMines = 100;
        theModel.setXY(20,20);
        theView.gameFrame.setSize(300,300);
        return numberOfMines;
    }

    private int hardPreset(){
        numberOfMines = 250;
        theModel.setXY(30,30);
        theView.gameFrame.setSize(500,500);
        return numberOfMines;
    }

    private void switchFrames(){
        theView.selectDifficultyFrame.setVisible(false);
        theView.gameFrame.setVisible(true);
    }

    private void initialiseGameBoard(int numberOfMines)
    {
        theModel.initialiseMinefield();
        theModel.placeMines(numberOfMines);
        switchFrames();
    }
}
