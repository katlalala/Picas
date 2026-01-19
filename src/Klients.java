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
			
			public boolean vaiPiegadi() {
				return vaiPiegadi;
			}
			
			public String getAdrese() {
				return adrese;
			}
			
			public String getTelefons() {
				return telefons;
			}
			
	}
