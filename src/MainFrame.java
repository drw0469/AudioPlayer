
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton jbtnStart;
	
	public MainFrame() {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame("AudioPlayer");
		
		// Specify a flow layout
		jfrm.getContentPane().setLayout(new FlowLayout());
		
		// Give the frame an initial size.
		jfrm.setSize(600, 600);
		
		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create the first JPanel.
		JPanel jpnl1 = new JPanel();
		
		// Set the preferred size of the first panel. width, height
		jpnl1.setPreferredSize(new Dimension(580, 270));
		
		// Make panel grey
		jpnl1.setBackground(Color.DARK_GRAY);
		
		
		// Add a red border to the panel
		//jpnl1.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		JPanel jpnl2 = new JPanel();
		
		// Set the preferred size of the first panel. width, height
		jpnl2.setPreferredSize(new Dimension(580, 270));
		
		// Make panel grey
		jpnl2.setBackground(Color.DARK_GRAY);
		
		
		// Add a red border to the panel
		//jpnl2.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		// Add the panels to the frame.
		jfrm.getContentPane().add(jpnl1);
		jfrm.getContentPane().add(jpnl2);
		
		// Display the frame
		jfrm.setVisible(true);
		
		// Disable frame resizing
		setResizable(false);
	}
	
	
	
	
	public static void main(String[] args) {
		// Create the frame on the event dispatching method
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});

	}

}
