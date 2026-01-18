import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Klients {

		// ATRIBUTI
	private int telNr;
	private String vards, adrese;
	private boolean vaiAdrese;
			
			// KONSTRUKTORS
		public Klients(String vards, boolean vaiAdrese, String adrese, int telefonaNr) {
			this.vards = vards;
			this.adrese = adrese;
			this.vaiAdrese = vaiAdrese;
			this.telNr = telNr;
			
			}
			// METODES
			public String getVards() {
				return vards;
			}
			
			public void setVards(String vards) {
				this.vards = vards;
			}
			
			public boolean isVaiAdrese() {
				return vaiAdrese;
			}
			
			public void setVaiAdrese(boolean vaiAdrese) {
				this.vaiAdrese = vaiAdrese;
			}
			
			public String getAdrese() {
				return adrese;
			}
			
			public void setAdrese(String adrese) {
				this.adrese = adrese;
			}
			
			
			/*
			
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
			*/
		}



