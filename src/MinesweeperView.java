import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MinesweeperView {

    private final GridBagConstraints layoutConstraints = new GridBagConstraints();
    JFrame selectDifficultyFrame = new JFrame(), gameFrame = new JFrame();
    JPanel difficultyPanel = new JPanel(), gamePanel = new JPanel();
    final Dimension SELECT_FRAME_DIMENSION = new Dimension(200,300),
            GAME_FRAME_DIMENSION = new Dimension(300,300);
    JButton easyButton = new JButton("Easy"), normalButton = new JButton("Normal"),
            hardButton = new JButton("Hard");
    JTextArea consoleTextAreaTBR = new JTextArea();

    MinesweeperView(){
        //initialise selection frame
        selectDifficultyFrame.setTitle("Minesweeper");
        selectDifficultyFrame.setSize(SELECT_FRAME_DIMENSION);
        selectDifficultyFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        selectDifficultyFrame.setLocationRelativeTo(null);
        selectDifficultyFrame.setResizable(false);

        //initialise game frame
        gameFrame.setTitle("Minesweeper");
        gameFrame.setSize(GAME_FRAME_DIMENSION);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);

        //other GUI stuff to be added
        selectDifficultyFrame.add(difficultyPanel);
        difficultyPanel.setLayout(new GridBagLayout());

        gameFrame.add(gamePanel);
        gamePanel.add(consoleTextAreaTBR);

        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.anchor = GridBagConstraints.BASELINE;
        layoutConstraints.insets = new Insets(10, 10, 0, 0);
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 2;
        layoutConstraints.gridwidth = 1;
        difficultyPanel.add(easyButton, layoutConstraints);

        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 3;

        difficultyPanel.add(normalButton, layoutConstraints);

        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 4;
        difficultyPanel.add(hardButton, layoutConstraints);

    }

    public void addListener(ActionListener actionListener)
    {
        easyButton.addActionListener(actionListener);
        normalButton.addActionListener(actionListener);
        hardButton.addActionListener(actionListener);
    }
}
