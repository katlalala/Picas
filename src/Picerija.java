import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

// prototips voaaavvvv
public class Picerija extends JFrame {
	private ArrayList<String> aktiviePasutijumi;
	private ArrayList<String> pabeigtie;
	private ArrayList<Pica> picuKatalogs;
	private ArrayList<Klients> klienti;
	
	private int pasutijumaNumurs;
	
	static String virknesParbaude(String zinojums, String nokl) {
		String ievade;
		
		do {
			ievade = JOptionPane.showInputDialog(null, zinojums, nokl);
			
			if(ievade == null)
			return null;
			
			ievade = ievade.trim();
		} while(ievade.isEmpty());
		
		return ievade;
	}
	
	public Picerija() {
		aktiviePasutijumi = new ArrayList<String>();
		pabeigtie = new ArrayList<String>();
		picuKatalogs = new ArrayList<Pica>();
		klienti = new ArrayList<Klients>();
		pasutijumaNumurs = 1;
		
		pievienotPicas();
		izveidotLogu();
		izveidotPogas();
		
		JFrame frame = new JFrame();
        JButton b1 = new JButton();	
	}
	
	private void pievienotPicas() {
		if (picuKatalogs == null) {
			picuKatalogs = new ArrayList<Pica>();
		}
		picuKatalogs.add(new Pica("Vegetara pica", "Maza", "Siers, Tomāti", "Tomātu mērce", 4.50));
		picuKatalogs.add(new Pica("Vegetara pica", "Liela", "Siers, Tomāti", "Tomātu mērce", 7.00));
		
		picuKatalogs.add(new Pica("Pepperoni", "Maza", "Siers, Pepperoni", "Tomātu mērce", 6.50));
		picuKatalogs.add(new Pica("Pepperoni", "Liela", "Siers, Pepperoni", "Tomātu mērce", 9.00));
		
		picuKatalogs.add(new Pica("Havaju", "Maza", "Siers, Šķiņķis, Ananāsi","Tomātu mērce", 7.50));
		picuKatalogs.add(new Pica("Havaju", "Liela", "Siers, Šķiņķis, Ananāsi", "Tomātu mērce",  10.00));
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
		
		jaunaPoga.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				izveidotJaunuPasutijumu();
			}
		});
		
		JButton skatitPoga = new JButton("Visi pasūtijumi");
		skatitPoga.setBounds(70, 280, 140, 50); // (x, y, width, height)
		add(skatitPoga);
		
		skatitPoga.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				skatitPasutijumu();
			}
		});
		
		JButton vesturePoga = new JButton("Vēsture");
		vesturePoga.setBounds(370, 210, 140, 50); // (x, y, width, height)
		add(vesturePoga);
		
		vesturePoga.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pasutijumuVesture();
			}
		});
		
		JButton pabeigtiePoga = new JButton("Pabeigt pasūtijumu");
		pabeigtiePoga.setBounds(370, 280, 140, 50); // (x, y, width, height)
		add(pabeigtiePoga);
		
		pabeigtiePoga.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pabeigtPasutijumu();
			}
		});
		
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
	
	private void izveidotJaunuPasutijumu() {

		try {
			if (picuKatalogs.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Katalogs ir tukšs.");
				return;
			}
			
			String[] picuTeksti = new String[picuKatalogs.size()];
			for (int i = 0; i < picuKatalogs.size(); i++) {
				Pica p = picuKatalogs.get(i);
				picuTeksti[i] = p.getNosaukums() + " (" + p.getLielums() + ") - €" + p.getCena();
			}
			
			String izveletaTeksts = (String) JOptionPane.showInputDialog(this, "Izvēlieties picu:", "Pica", JOptionPane.PLAIN_MESSAGE, null, picuTeksti, picuTeksti[0]);
			
			if (izveletaTeksts == null) {
				return;
			}
			
			Pica izveletaPica = null;
			for (int i = 0; i < picuKatalogs.size(); i++) {
				if (picuTeksti[i].equals(izveletaTeksts)) {
					izveletaPica = picuKatalogs.get(i);
					break;
				}
			}
			
			if (izveletaPica == null) {
				JOptionPane.showMessageDialog(this, "Pica nav atrasta!");
				return;
			}
			
			// PIEDEVAS
			double kopejaCena = izveletaPica.getCena();
			String[] piedevas = {"Nav", "Pepperoni (+€2.00)", "Salami (+€1.50)", "Sēnes (+€0.50)", "Tomāti (+€0.99)"};
			String piedevasIzvele = (String) JOptionPane.showInputDialog(this, "Papildus piedevas?", "Piedevas", JOptionPane.PLAIN_MESSAGE, null, piedevas, piedevas[0]);
			
			if(piedevasIzvele == null) {
				return;
			}
			
			String piedavasTeksts = "Nav";
			if (piedevasIzvele.contains("Pepperoni")) {
				kopejaCena = kopejaCena + 2.00;
				piedavasTeksts = "Pepperoni";
				
			} else if (piedevasIzvele.contains("Salami")) {
				kopejaCena = kopejaCena + 1.50;
				piedavasTeksts = "Salami";
				
			} else if (piedevasIzvele.contains("Sēnes")) {
				kopejaCena = kopejaCena + 0.50;
				piedavasTeksts = "Sēnes";
				
			} else if (piedevasIzvele.contains("Tomāti")) {
				kopejaCena = kopejaCena + 0.99;
				piedavasTeksts = "Tomāti";
			}
			
			// DZERIENII
			String[] dzerieni = {"Nav", "Cola (+€2.00)", "Sprite (+€2.00)", "Fanta (+€2.00)", "Ūdens (+€1.00)"};
			String dzeriensIzvele = (String) JOptionPane.showInputDialog(this, "Dzēriens?", "Dzēriens", JOptionPane.PLAIN_MESSAGE, null, dzerieni, dzerieni[0]);
			if (dzeriensIzvele == null) {
				return;
			}
			
			String dzerienaTeksts = "Nekas";
			if (dzeriensIzvele.contains("Cola")) {
				kopejaCena = kopejaCena + 2.00;
				dzerienaTeksts = "Cola";
				
			} else if (dzeriensIzvele.contains("Sprite")) {
				kopejaCena = kopejaCena + 2.00;
				dzerienaTeksts = "Fanta";
				
			} else if (dzeriensIzvele.contains("Fanta")) {
				kopejaCena = kopejaCena + 2.00;
				dzerienaTeksts = "Fanta";
				
			} else if (dzeriensIzvele.contains("Ūdens")) {
				kopejaCena = kopejaCena + 1.00;
				dzerienaTeksts = "Ūdens";
			}
			
			int atbilde = JOptionPane.showConfirmDialog(this, "Vai sūtīsiet ar piegādi? (+€5.00)", "Piegāde", JOptionPane.YES_NO_OPTION);
	        boolean irPiegade = (atbilde == JOptionPane.YES_OPTION);
			
			Klients klients = null;
			
			if (irPiegade) {
				kopejaCena = kopejaCena += 5.00;

				String vards = virknesParbaude("Ievadiet klienta vārdu:", "Maikls Aftons");
				if (vards == null)
					return;
				
				
				String telefons = virknesParbaude("Ievadiet tālruņa numuru:", "+ 371 19831987");
				if (telefons == null)
					return;
				
			
				String adrese = virknesParbaude("Ievadiet piegādes adresi:", "Ventspils iela 51");
				if (adrese == null)
					return;
				
				
				klients = new Klients(vards, telefons, adrese, true);
				klienti.add(klients); 
				
			}
			
			String pasutijums = "PASŪTĪJUMS #" + pasutijumaNumurs + "\n";
			pasutijums += "===================\n";
			pasutijums += "Pica: " + izveletaPica.getNosaukums() + "\n";
			pasutijums += "Lielums: " + izveletaPica.getLielums() + "\n";
			pasutijums += "Mērce: " + izveletaPica.getMerces() + "\n";
			pasutijums += "Papildus: " + piedavasTeksts + "\n";
			pasutijums += "Dzēriens: " + dzerienaTeksts + "\n";
			
			if (irPiegade && klients != null) {
				pasutijums += "-------------------\n";
				pasutijums += "Piegāde klientam: " + klients.getVards() + "\n";
				pasutijums += "Telefons: " + klients.getTelefons() + "\n";
				pasutijums += "Adrese: " + klients.getAdrese() + "\n";
			} else {
				pasutijums += "-------------------\nPaņemts uz vietas\n";
			}
			
			pasutijums += "-------------------\n";
			pasutijums += "CENA: €" + String.format("%.2f", kopejaCena) + "\n";
			pasutijums += "===================";
			
			aktiviePasutijumi.add(pasutijums);
			pasutijumaNumurs++;
			
			JOptionPane.showMessageDialog(this, "Pasūtījums izveidots!\n\n" + pasutijums);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Kļūda: " + e.getMessage());
			e.printStackTrace();
	}
}

	private void skatitPasutijumu() {
		if (aktiviePasutijumi.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Pašlaik nav aktīvu pasūtījumu.", "Informācija", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		StringBuilder teksts = new StringBuilder();
		teksts.append("AKTĪVIE PASŪTĪJUMI (" + aktiviePasutijumi.size() + "):\n\n");
		
		int numurs = 1;
		for (String pasutijums : aktiviePasutijumi) {
			teksts.append("--- Pasūtījums Nr.").append(numurs).append(" ---\n");
			teksts.append(pasutijums).append("\n\n");
			numurs++;
		}
		
		JTextArea tekstsArea = new JTextArea(teksts.toString());
		tekstsArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(tekstsArea);
		scrollPane.setPreferredSize(new Dimension(500, 400));
		
		JOptionPane.showMessageDialog(this, scrollPane, "Aktīvie Pasūtījumi", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void pabeigtPasutijumu() {
		if (aktiviePasutijumi.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Nav pasūtījumu, ko pabeigt!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String[] izveles = new String[aktiviePasutijumi.size()];
		for (int i = 0; i < aktiviePasutijumi.size(); i++) {
			izveles[i] = aktiviePasutijumi.get(i).split("\n")[0];
		}
		
		String izvele = (String) JOptionPane.showInputDialog(this, "Kuru pasūtījumu vēlaties pabeigt?", "Pabeigt pasūtījumu", JOptionPane.QUESTION_MESSAGE, null, izveles, izveles[0]);
		
		if (izvele != null) {
			int indekss = -1;
			for (int i = 0; i < izveles.length; i++) {
				if (izveles[i].equals(izvele)) {
					indekss = i;
					break;
				}
			}
			
			if (indekss != -1) {
				String pabeigtais = aktiviePasutijumi.remove(indekss);
				pabeigtie.add(pabeigtais);
				DarbsArFailu.saglabatPasutijumu(pabeigtais);
				JOptionPane.showMessageDialog(this, "Pasūtījums pabeigts, dabūsi veselus bonusa 10 centus algā.");
			}
		}	
	}
	
	private void pasutijumuVesture() {
		
		String vesture = DarbsArFailu.nolasit();
		JTextArea tekstsArea = new JTextArea(vesture);
		tekstsArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(tekstsArea);
		scrollPane.setPreferredSize(new Dimension(500, 400));
		
		Object[] opcijas = {"Aizvērt", "Izdzēst visu vēsturi"};
		int izvele = JOptionPane.showOptionDialog(this, scrollPane, "Pasūtījumu vēsture", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,  null, opcijas, opcijas[0]);
		
		if (izvele == 1) {
			int apstiprinajums = JOptionPane.showConfirmDialog(this, "Vai tiešām vēlaties izdzēst vēsturi?", "Apstiprinājums", JOptionPane.YES_NO_OPTION);
			
			if (apstiprinajums == JOptionPane.YES_OPTION) {
					DarbsArFailu.iztiritVesturi();
					pabeigtie.clear();
			}
		}
	}
}