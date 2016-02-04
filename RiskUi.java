import javax.swing.*;
import java.awt.*;

public class RiskUi {

    private JFrame mFrame;

    public RiskUi() {
        initUi();
    }

    private void initUi() {

        // Set up the JFrame
        mFrame = new JFrame(Constants.FRAME_TITLE);
        mFrame.setPreferredSize(
                new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT));
        mFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mFrame.setResizable(true);

        // Display the frame
        mFrame.pack();
        mFrame.setVisible(true);
    }

    public static void main(String[] args) {
        RiskUi ui = new RiskUi();
    }
}
