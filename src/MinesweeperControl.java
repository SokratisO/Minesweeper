import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperControl {
    MinesweeperView theView;
    MinesweeperModel theModel;
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
                theView.selectDifficultyFrame.setVisible(false);
                theView.gameFrame.setVisible(true);
                theModel.initialiseMinefield();
                theModel.placeMines(25);
                theView.consoleTextAreaTBR.setText(theModel.displayMinefieldArray());
            }
        }
    }
}
