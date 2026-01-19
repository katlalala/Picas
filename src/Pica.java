class Pica {
	
		// ATRIBUTI
		private double cena;
		private String nosaukums, piedevas, merces, lielums, uzkodas;
			
			// KONSTRUKTORS
		public Pica(String nosaukums, String lielums, String piedevas, String merces, String uzkodas, double cena) {
			this.nosaukums = nosaukums;
			this.lielums = lielums;
			this.piedevas = piedevas;
			this.merces = merces;
			this.uzkodas = uzkodas;
			this.cena = cena;

		}
			// METODES
			
			// case 0
			public String getNosaukums() {
				return nosaukums;
		}
			
			// case 1
			public String getLielums() {
				return lielums;
		}
			
			// case 2
			public String getPiedevas() {
				return piedevas;
		}
			
			// case 3
			public String getMerces() {
				return merces;
		}
			// case 4
			public String getUzkodas() {
				return uzkodas;
		}
			
			// case 5
			public double getCena() {
				return cena;
		}

	}