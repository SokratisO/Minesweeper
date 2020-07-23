import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperControl {
    MinesweeperView theView;
    MinesweeperModel theModel;
    private int numberOfMines;
    private int easyXY = 10, normalXY = 20, hardXY = 20;
    MinesweeperControl(MinesweeperView theView,MinesweeperModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.setActionListener(new minesweeperListener());
        this.theView.addListener();
    }

    public class minesweeperListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == theView.easyButton)
            {
                initialiseGameBoard(easyPreset());
                //theView.consoleTextAreaTBR.setText(theModel.displayMinefieldArray());
            }
            else if(e.getSource() == theView.normalButton)
            {
                initialiseGameBoard(normalPreset());
                //theView.consoleTextAreaTBR.setText(theModel.displayMinefieldArray());
            }
            else if(e.getSource() == theView.hardButton)
            {
                initialiseGameBoard(hardPreset());
                //theView.consoleTextAreaTBR.setText(theModel.displayMinefieldArray());
            }
            else if(e.getSource() instanceof JButton)
            {
                ((JButton)e.getSource()).setEnabled(false);
                ((JButton)e.getSource()).setText(((JButton)e.getSource()).toString());
                System.out.println("button pressed");
                System.out.println(((JButton)e.getSource()).toString());
            }
        }
    }

    private int easyPreset(){
        numberOfMines = 25;
        theModel.setXY(easyXY,easyXY);
        theView.gameFrame.setSize(500,400);
        theView.setButtons(100, easyXY);
        return numberOfMines;
    }

    private int normalPreset(){
        numberOfMines = 100;
        theModel.setXY(normalXY,normalXY);
        theView.gameFrame.setSize(800,800);
        theView.setButtons(400, normalXY);
        return numberOfMines;
    }

    private int hardPreset(){
        numberOfMines = 250;
        theModel.setXY(hardXY,hardXY);
        theView.gameFrame.setSize(800,800);
        theView.setButtons(900, hardXY);
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
        theView.initialiseButtons();
        switchFrames();
    }
}
