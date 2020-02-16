package pacerUI;

import java.awt.Dimension;

import javax.swing.*;

public class ui {
	public static void main(String[] args) {
		JFrame jf = new JFrame("PACER File Retriever");
		JPanel jp = new JPanel();
		JLabel title = new JLabel("Download Set Up");
		
		jp.add(title);
		
		jf.setSize(new Dimension(1000,1000));
		jf.setResizable(false);
		jf.add(jp);
		
		jf.setVisible(true);
		
	}
}
