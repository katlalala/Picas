import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// prototips voaaavvvv
public class Picerija extends JFrame {
	private Queue<String> aktiviePasutijumi;
	private ArrayList<String> pabeigtie;
	private ArrayList<Pica> picuKatalogs;
	private ArrayList<Klients> klienti;
	
	private int pasutijumaNumurs;
	
	public Picerija() {
		aktiviePasutijumi = new LinkedList<String>();
		pabeigtie = new ArrayList<String>();
		picuKatalogs = new ArrayList<Pica>();
		klienti = new ArrayList<Klients>();
		pasutijumaNumurs = 1001;
		//pievienotPicas(); vel bus
		izveidotLogu();
		izveidotPogas();
		
	}
	
	// parmaina klasi uz main
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Picerija().setVisible(true);
		}
	});
}
	
	private void izveidotLogu() {
		setTitle("Picērija");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(140, 38, 23));
		setLayout(null);
	}
	
	private void izveidotPogas() {
		//paaaaaaaaliigaaaaaaaaaa
	}
}
