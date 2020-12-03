import javax.swing.SwingUtilities;
import javax.swing.JFrame;

/**
 * TitlesFrame, displayed Application UI
 * @author Angelika Neroda
 */
public class TitlesFrame extends JFrame
{

    /**
     * Constuctor TitlesFrame
     */
    public TitlesFrame() {
        this.initUI();
    }

    /**
     * Method initUI displaying UI with title,
     * size and drawing panel
     */

    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(18));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    /**
     * main program method
     */
    public static void main(final String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }
}
