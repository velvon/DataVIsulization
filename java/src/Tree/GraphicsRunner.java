

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	
	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(800,600);

		getContentPane().add(new Tree());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}

