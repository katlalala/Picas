import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Klients {

		// ATRIBUTI
	private String vards, adrese, telefons;
	private boolean vaiPiegadi;
			
			// KONSTRUKTORS
		public Klients(String vards, String telefons, String adrese, boolean vaiPiegadi) {
			this.vards = vards;
			this.adrese = adrese;
			this.vaiPiegadi = vaiPiegadi;
			this.telefons = telefons;
			
			}
			// METODES
			public String getVards() {
				return vards;
			}
			
//			public void setVards(String vards) {
//				this.vards = vards;
//			}
			
			public boolean vaiPiegadi() {
				return vaiPiegadi;
			}
			
			
			public String getAdrese() {
				return adrese;
			}
			
//			public void setAdrese(String adrese) {
//				this.adrese = adrese;
//			}
			
			public String getTelefons() {
				return telefons;
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



