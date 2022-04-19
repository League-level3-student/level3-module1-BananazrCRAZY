package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class _02_GuestBook implements ActionListener{
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
	
	_02_GuestBook() {
		add.addActionListener(this);
		view.addActionListener(this);
		
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		
		f.add(p);
		p.add(add);
		p.add(view);
		f.setVisible(true);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == view) {
			for (int i = 0; i < names.size(); i++) {
				System.out.println("Guest #" + (i+1) + ": " + names.get(i));
			}
		}
		if (e.getSource() == add) {
			String name = JOptionPane.showInputDialog("Type a Name You Would Like to Add");
			names.add(name);
		}
	}
}
