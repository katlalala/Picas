class Pica {
	
		// ATRIBUTI
		private double cena;
		private String nosaukums, piedevas, merces, lielums;
			
			// KONSTRUKTORS
		public Pica(String nosaukums, String lielums, String piedevas, String merces, double cena) {
			this.nosaukums = nosaukums;
			this.lielums = lielums;
			this.piedevas = piedevas;
			this.merces = merces;
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
			public double getCena() {
				return cena;
		}
			
			String nolasitAtributus() {
				return "Pasūtītā pica: " + nosaukums +
						"Picas lielums: " + lielums +
						"Pievienotās piedevas: " + piedevas +
						"Pievienotā mērce: " + merces +
						"Cena: " + cena;
			}
			
			// nav pabeigts
			
			/*
		
			// case 5
			public double NoteiktKusAtr() {
				double celsM, laiksS;
				Random rand = new Random();
				celsM = rand.nextDouble()*(1000-1)+1;
				laiksS = rand.nextDouble()*(60-10)+10;
				return Math.round(celsM/laiksS);
		}
			// nav pabeigts
			
			
			
			// case 5
			public double noteiktAtr() {
				return atrumsMS;
		}
			
			public String izvadit() {
				return "Riteņa ražotājs: " + noteiktRaz() + "\nRiteņa cena: " + noteiktCenu() + " EUR"
						+ "\nRiteņa lielums collās: " + noteiktRitenaD()
						+ "\nIestatītais sēdekļa augstums: " + noteiktSedeklaPoz()
						+ "\\nKustības ātrums: " + noteiktAtr() + "m/s";
		}
			
			public void iestatitSedeklaPoz(int pozicija) {
				sedeklaPoz = pozicija;
		}
			
			public void mities(int minienuSk) {
				atrumsMS += noteiktAtr() + (0.15 * minienuSk);
		}
			
			public void bremzet(int berze) {
				if(noteiktAtr() > 0) {
					atrumsMS -= (noteiktAtr() * 0.55) * berze;
					
					if(atrumsMS < 0)
						atrumsMS = 0;
		}
	}
				
				@Override
				public int compareTo(Velosipeds v) {
					return this.noteiktCenu().compareTo(v.noteiktCenu());
					
				}
				*/
		}