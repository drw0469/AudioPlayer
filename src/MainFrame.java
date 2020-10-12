
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
