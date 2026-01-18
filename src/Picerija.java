import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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
		JFrame frame = new JFrame();
        JButton b1 = new JButton();	
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
	// JFRAME IZVEIDE + UI
	private void izveidotLogu() {
		setTitle("Picērija");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// VIRSRAKSTS
		JLabel virsraksts = new JLabel("LAIPNI LŪGTI PICĒRIJĀ!", SwingConstants.CENTER);
		virsraksts.setBounds(-10, 10, 600, 30);
		virsraksts.setFont(new Font("Arial", Font.BOLD, 18));
		virsraksts.setForeground(new Color(255, 255, 255));
		add(virsraksts);
		
		// BILDEE
		ImageIcon img = new ImageIcon(getClass().getResource("bildes/logo.png"));
		Image scaled = img.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		
		JLabel logo = new JLabel(new ImageIcon(scaled));
		logo.setBounds(230, 40, 120, 120); // (x, y, width, height)
		add(logo);
		
		// augsaa cita kraasa
		JPanel augsa = new JPanel();
		augsa.setBackground(new Color(220, 90, 60));
		augsa.setBounds(0, 0, 610, 170);
		augsa.setLayout(null);
		add(augsa);
		
		// apaksa cita
		JPanel apaksa = new JPanel();
		apaksa.setBackground(new Color(220, 90, 60));
		apaksa.setBounds(0, 440, 600, 60);
		apaksa.setLayout(null);
		add(apaksa);

	}
	
	// POGU IZVEIDE
	private void izveidotPogas() {
		JButton jaunaPoga = new JButton("Jauns pasūtijums");
		jaunaPoga.setBounds(70, 210, 140, 50); // (x, y, width, height)
		add(jaunaPoga);
		
		JButton skatitPoga = new JButton("Visi pasūtijumi");
		skatitPoga.setBounds(70, 280, 140, 50); // (x, y, width, height)
		add(skatitPoga);
		
		JButton vesturePoga = new JButton("Vēsture");
		vesturePoga.setBounds(370, 210, 140, 50); // (x, y, width, height)
		add(vesturePoga);
		
		JButton pabeigtiePoga = new JButton("Pabeigtie pasūtijumi");
		pabeigtiePoga.setBounds(370, 280, 140, 50); // (x, y, width, height)
		add(pabeigtiePoga);
		
		JButton izietPoga = new JButton("Iziet");
		izietPoga.setBounds(220, 360, 140, 50); // (x, y, width, height)
		add(izietPoga);
		
		// aizsut action no izietPoga seit cik es sapratu
		izietPoga.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Paldies!\n"
						+ "Uz redzēšanos!");
				System.exit(0);
			}
		});
	}
}
