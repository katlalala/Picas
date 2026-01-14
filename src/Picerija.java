import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

// prototips voaaavvvv
public class Picerija {

	
	static String virknesParbaude(String zinojums, String nokl) {
		String ievade;
		
		do {
			ievade = JOptionPane.showInputDialog(null, zinojums, nokl);
			
			if(ievade == null)
			return null;
			
			ievade = ievade.trim();
		} while(!Pattern.matches("^[\\p{L} ]+$", ievade));
		
		return ievade;
	}
	
	public static double skaitlaParbaude(String zinojums, double tips) {
		String ievade;
		double skaitlis;
		
		while (true) {
			ievade = JOptionPane.showInputDialog(null, zinojums, tips);
			
			if(ievade == null)
				return -1.0;
			
			try {
				skaitlis = Double.parseDouble(ievade);
				if(skaitlis < 0.1) {
					JOptionPane.showMessageDialog(null,
							"Ievadīts negatīvs skaitlis.",
							"Nekorekti dati", JOptionPane.WARNING_MESSAGE);
					//continue;
				}
				return skaitlis;
				
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Netika ievadīts korekts datu tips",
						"Nepareizi ievadīts", JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
	
	public static void main(String[] args) {
		String cilveks = null, izvelne;
		int id = 1, skaits, lppSk, indekss;
		double cena;
		int kartasNr;
		Queue<String> rinda = new LinkedList<>();
		
		String[] darbibas = {"Veikt pasūtijumu", "Skatīt pirmo rindā stāvošo",
				"Noteikt rindas garumu", "Cik pirms manis?", "Aplūkot visus rindā stāvošos",
				"Apkalpot pirmo", "Apturēt"};
		
		do {
			izvelne = (String)JOptionPane.showInputDialog(null, "Darbības izvēle", "Izvēle", JOptionPane.QUESTION_MESSAGE,
					null, darbibas, darbibas[0]);
			
			
			if(izvelne == null)
				izvelne = "Apturēt";
			
			
			switch(izvelne) {
			
			case "Nostāties rindā":
				cilveks = virknesParbaude("Kā sauc cilvēku?", "Jānis");
				
				if(cilveks == null)
					
				break;
				
				telNr = skaitlaParbaude("Kāds ir cilvēka telefona numurs?", "Jānis");
				
				if(telNr == null)
					// ievietot iespeju ielikt tikai 8 ciparus
				break;
				
				// nomainit par JOptionPane message
				vaiAdrese = virknesParbaude("Vai ēdīs restorānā vai ņems līdzņemšanā?", "Jānis");
				
				if(cilveks == null)
					
				break;
				
				adrese = virknesParbaude("Kāda ir adreses iela?", "Rožu iela");
				
				if(adrese == null)
					
				break;
				
				// parmainis uz iespeju izveleties + bilde / joption message
				pasutijums = virknesParbaude("Kādu picu pasūtīs?", "Rožu iela");
				
				if(adrese == null)
					
				break;
				
				rinda.add(cilveks);
				JOptionPane.showMessageDialog(null, "Cilvēks nostājās rindā.", "Paziņojums",
						JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Skatīt pirmo rindā stāvošo":
				if(!rinda.isEmpty())
					JOptionPane.showMessageDialog(null, "Pirmais rindā ir "+ rinda.peek(), "Informācija", JOptionPane.INFORMATION_MESSAGE);
				
				else
					JOptionPane.showMessageDialog(null, "Rindā neviens nestāv.", "Tukša rinda",
							JOptionPane.WARNING_MESSAGE);
				break;
				
			case "Noteikt rindas garumu":
				if(!rinda.isEmpty())
					JOptionPane.showMessageDialog(null, "Rindā stāvošo skaits: "+ rinda.size(), "Informācija", JOptionPane.INFORMATION_MESSAGE);
				
				else
					JOptionPane.showMessageDialog(null, "Rindā neviens nestāv.", "Tukša rinda",
							JOptionPane.WARNING_MESSAGE);
				break;
				
			case "Cik pirms manis?":
				if(!rinda.isEmpty()) {
					cilveks = virknesParbaude("Kā Tevi sauc?", "Jānis");
					
					if(cilveks == null)
						break;
					
					kartasNr = 0;
					boolean atrasts = false;
					for(String persona : rinda) {
						if(cilveks.equalsIgnoreCase(persona)) {
							atrasts = true;
							break;
						}
						kartasNr++;
					}
					if(atrasts)
						JOptionPane.showMessageDialog(null, "Pirms Tevis stāv "+ kartasNr + " cilvēki.", "Informācija", JOptionPane.INFORMATION_MESSAGE);
					
					else
						JOptionPane.showMessageDialog(null, "Nemānies, Tu nemaz rindā nestāvi.", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				} else
					JOptionPane.showMessageDialog(null, "Rindā neviens nestāv.", "Tukša rinda",
							JOptionPane.WARNING_MESSAGE);
				break;
				
			case "Aplūkot visus rindā stāvošos":
				if(!rinda.isEmpty()) {
					String virkne = "";
					kartasNr = 1;
					for(String persona : rinda) {
						virkne += kartasNr + ". " + persona + "\n";
						kartasNr++;
					}
					JOptionPane.showMessageDialog(null, "Rindā stāv: \n" + virkne, "Cilvēki", JOptionPane.INFORMATION_MESSAGE);
				
				} else
					JOptionPane.showMessageDialog(null, "Rindā neviens nestāv.", "Tukša rinda",
							JOptionPane.WARNING_MESSAGE);
				break;
				
			case "Apkalpot pirmo":
				if(!rinda.isEmpty()) {
					JOptionPane.showMessageDialog(null, rinda.poll() + " tika apkalpots.", "Apkalpošana", JOptionPane.INFORMATION_MESSAGE);
				
				} else
					JOptionPane.showMessageDialog(null, "Rindā neviens nestāv.", "Tukša rinda",
							JOptionPane.WARNING_MESSAGE);
				break;
				
			case "Apturēt":
				JOptionPane.showMessageDialog(null, "Programma apturēta.", "Paziņojums",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
		}while(!izvelne.equals("Apturēt"));

	}



}


