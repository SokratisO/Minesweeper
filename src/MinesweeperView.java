import javax.swing.*;
import java.awt.*;

public class MinesweeperView {

    JFrame selectDifficultyFrame = new JFrame(), gameFrame = new JFrame();
    JPanel difficultyPanel = new JPanel();
    final Dimension SELECT_FRAME_DIMENSION = new Dimension(500,500);
    JButton easyButton = new JButton("Easy"), normalButton = new JButton("Normal"),
            hardButton = new JButton("Hard");

    MinesweeperView(){
        selectDifficultyFrame.setTitle("Minesweeper");
        selectDifficultyFrame.setSize(SELECT_FRAME_DIMENSION);
        selectDifficultyFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        selectDifficultyFrame.setLocationRelativeTo(null);
        selectDifficultyFrame.setResizable(false);
        selectDifficultyFrame.add(difficultyPanel);
        difficultyPanel.setLayout(new BoxLayout(difficultyPanel, BoxLayout.PAGE_AXIS));
        difficultyPanel.add(easyButton);
        difficultyPanel.add(normalButton);
        difficultyPanel.add(hardButton);
    }
}
