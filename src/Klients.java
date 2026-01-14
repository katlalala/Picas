import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Klients {

		// ATRIBUTI
	private int telNr;
	private String vards, adrese, pasutijums;
	private boolean vaiAdrese;
			
			// KONSTRUKTORS
		public Klients(int telNr, int pasutijumaNr, String vards, String adrese, boolean vaiAdrese) {
			this.vards = vards;
			this.adrese = adrese;
			this.vaiAdrese = vaiAdrese;
			this.telNr = telNr;
			this.pasutijums = 0;
		}
			// METODES
		
			public String getVards() {
				return vards;
		}
			// papildinaas
		public void info() {
			JOptionPane.showMessageDialog(null,
					"Vārds: " + vards +
					"\nTelefona numurs:" + telNr +
					"\nPasūtītā pica: " + pasutijums);
		}
			
		public void panemtGramatu() {
			if(skaits > 0) {
				skaits--;
				panemts = LocalDate.now();
				// pievieno minutes dazas
				izveidot = panemts.plusMonths(1);
				JOptionPane.showMessageDialog(null, "Pica izveidota: " + izveidot + "\nPica paņemta: " + panemts);
					
			} else
				JOptionPane.showMessageDialog(null, "Grāmata nav pieejama, visi eksemplāri paņemti.", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
			}
		}



