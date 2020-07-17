import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MinesweeperView {

    JFrame selectDifficultyFrame = new JFrame(), gameFrame = new JFrame();
    JPanel difficultyPanel = new JPanel(), gamePanel = new JPanel();
    final Dimension SELECT_FRAME_DIMENSION = new Dimension(500,500);
    JButton easyButton = new JButton("Easy"), normalButton = new JButton("Normal"),
            hardButton = new JButton("Hard");
    JTextArea consoleTextAreaTBR = new JTextArea();

    MinesweeperView(){
        selectDifficultyFrame.setTitle("Minesweeper");
        selectDifficultyFrame.setSize(SELECT_FRAME_DIMENSION);
        selectDifficultyFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        selectDifficultyFrame.setLocationRelativeTo(null);
        selectDifficultyFrame.setResizable(false);

        gameFrame.setTitle("Minesweeper");
        gameFrame.setSize(SELECT_FRAME_DIMENSION);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);

        selectDifficultyFrame.add(difficultyPanel);


        difficultyPanel.setLayout(new BoxLayout(difficultyPanel, BoxLayout.PAGE_AXIS));
        difficultyPanel.add(easyButton);
        difficultyPanel.add(normalButton);
        difficultyPanel.add(hardButton);

        gameFrame.add(gamePanel);
        gamePanel.add(consoleTextAreaTBR);
    }

    public void addListener(ActionListener actionListener)
    {
        easyButton.addActionListener(actionListener);
        normalButton.addActionListener(actionListener);
        hardButton.addActionListener(actionListener);
    }
}
