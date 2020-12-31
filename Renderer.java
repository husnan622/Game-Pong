import java.awt.Graphics;
import java.awt.Graphics2D;
 
import javax.swing.JPanel;
 
/**
 * @author Husnan
 */
 
public class Renderer extends JPanel
{
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
 
        Pong.pong.render((Graphics2D) g);
    }
 
}