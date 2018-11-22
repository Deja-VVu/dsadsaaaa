package servis.evidencija;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import racunar.Desktop;
import racunar.LapTop;
import racunar.Naplata;

public class Servis {

	private List<EvidencijaRacunara> racunari; 
	
	public Servis() {
		this.racunari = new ArrayList<>(); 
	}
	
	public void dodajRacunarNaServis(EvidencijaRacunara racunarZaEvidenciju) throws IOException{
		racunari.add(racunarZaEvidenciju);
		///////////////////////////DODATO///////////////////////////////////////////
		// import bufferedwirter filewriter i
		BufferedWriter writer = new BufferedWriter(new FileWriter("c:/servis/"
				+racunarZaEvidenciju.getEvidencioniBroj()
				+".txt" ) );
		// lista svih racunara u evidenciji iz komande 1
		
		
		
		writer.write(racunarZaEvidenciju.toString());
		writer.close();
		
	}
	
	public void preuzmiURad(String evidencioniBroj) {
		for (EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getEvidencioniBroj().equals(evidencioniBroj)){
				evidencija.setStatusServisa(Status.U_RADU);
			}
		}
	}
	
	
	
	public void zavrsiServis(String evidencioniBroj ) {
		for (EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getEvidencioniBroj().equals(evidencioniBroj)){
				evidencija.setStatusServisa(Status.ZAVRSEN_SERVIS);
				evidencija.setDatumZavrsetkaServisa(LocalDate.now());
				
				//System.out.println(LocalDate.now());
				// mozda
				// mora localDate now da bi mogao da ga stampa u suprotnom je null
			}
		}
	}
	
	
	
	
	public void otpremaRacunara(String evidencioniBroj,Boolean placeno) {
		
		
		for (EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getEvidencioniBroj().equals(evidencioniBroj)){
				evidencija.setStatusServisa(Status.ZAVRSEN_SERVIS);
				evidencija.setDatumZavrsetkaServisa(LocalDate.now());
		
		
		
		
		
		
	}
	
	
	
	public void racunariNaServisu() throws IOException{
		
		BufferedWriter pisac = new BufferedWriter(new FileWriter("c:/servis/RacunariNaServisu.txt"));
			//	+evidencija.getEvidencioniBroj()
				//+".txt" ) );
		
		
		
		
		
		for (EvidencijaRacunara evidencija : racunari) {
			evidencija.informacijeOEvidenciji();
			
			
			// lista svih racunara u evidenciji iz komande 1
			
		
			
			pisac.write(evidencija.toString());
			pisac.newLine();
			
		
			
			
			
			
			
			
			
			
		}
		pisac.close();
		// pisac van petlje ali unutar metode
		////////////////////////////////////////////////////////////////////////////////////////////
	}
		public void desktopRacunariNaServisu() {
			
			for (EvidencijaRacunara evidencija : racunari) {
				if(evidencija.getRacunar() instanceof Desktop) {
				evidencija.informacijeOEvidenciji(); {
					// import desktop
					
				}
				}
			
			
			}
		}
		
				
				public void laptopRacunariNaServisu() {
					
					for (EvidencijaRacunara evidencija : racunari) {
						if(evidencija.getRacunar() instanceof LapTop) {
						evidencija.informacijeOEvidenciji(); {
							// import desktop
				
				
				
						}
						

						}
		
						}
		
			}
					
					public void spisakRacunaraURadu() {
						
						for (EvidencijaRacunara evidencija : racunari) {
							if(evidencija.getStatusServisa().equals(Status.U_RADU)){
								evidencija.informacijeOEvidenciji(); {
								}
								}
								else {
									System.out.println("Nijedan nije u radu / Serviseri zabusavaju");
									
								}
							break;
								// super moze i sa break ali bolje je van petlje 
							
						
					
								// isprobati sa else i BREAK
								
								// ili neki boolean
									// 3 puta stampa jer je u petlji
							
								// pomocu booleana
								
								// van viticastih if
								
								
					// nije get evidencioni broj vc statusservisa
								
					
							
					
							}
					}


					

	}

