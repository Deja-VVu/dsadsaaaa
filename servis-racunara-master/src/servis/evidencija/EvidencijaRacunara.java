package servis.evidencija;

import java.time.LocalDate;

import racunar.Racunar;

public class EvidencijaRacunara {

	private String evidencioniBroj;
	private String vlasnik;
	private LocalDate datumPrijemaServisa;
	private LocalDate datumZavrsetkaServisa;
	private Status statusServisa;
	private Racunar racunar;
	
	
	
	// string cena

	public EvidencijaRacunara(String evidencioniBroj, String vlasnik, Racunar racunar ) {
		this(evidencioniBroj, vlasnik, LocalDate.now(), null, Status.ZA_POPRAVKU, racunar);
		// string cena dodati
	}
	
	public EvidencijaRacunara(String evidencioniBroj, String vlasnik, LocalDate datumPrijemaServisa,
			LocalDate datumZavrsetkaServisa, Status statusServisa, Racunar racunar) {
		// dodati string cena
		super();
		this.evidencioniBroj = evidencioniBroj;
		this.vlasnik = vlasnik;
		//this.datumPrijemaServisa = LocalDate.now();
		//this.datumZavrsetkaServisa = LocalDate.now() ;
		this.datumPrijemaServisa =datumPrijemaServisa;
		this.datumZavrsetkaServisa = datumZavrsetkaServisa ;
		this.statusServisa = statusServisa;
		this.racunar = racunar;
		//this.cena = "1000";
	}

	public void informacijeOEvidenciji() {
		System.out.println("Racunar " + racunar.getSerijskiBroj()
		+ " je u statusu " + statusServisa +" primljen na servis dana "+ datumPrijemaServisa );
		// moj pokusajSystem.out.println("Racunar je primljen" + datumPrijemaServisa + "a zavrsen je" + datumZavrsetkaServisa);
		if (datumZavrsetkaServisa !=null) {
			System.out.println(" Datum zavrsetka je " + datumZavrsetkaServisa); //+ "Sad plati" +cena);
			//System.out.println("Iznos racuna je " + cena);
		}
		// datum ili localdate dodat
	}
	
	
	
	////////////////////////////////////////////
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "Racunar " + racunar.getSerijskiBroj()
		+ " je u statusu " + statusServisa + datumPrijemaServisa;
	}
	
	////////////////////////////////////////
	
	
	
	
	

	public String getEvidencioniBroj() {
		return evidencioniBroj;
	}

	public void setEvidencioniBroj(String evidencioniBroj) {
		this.evidencioniBroj = evidencioniBroj;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public LocalDate getDatumPrijemaServisa() {
		return datumPrijemaServisa = LocalDate.now();
	}

	public void setDatumPrijemaServisa(LocalDate datumPrijemaServisa) {
		this.datumPrijemaServisa = datumPrijemaServisa;
	}

	public LocalDate getDatumZavrsetkaServisa() {
		return datumZavrsetkaServisa;
	}

	public void setDatumZavrsetkaServisa(LocalDate datumZavrsetkaServisa) {
		this.datumZavrsetkaServisa = datumZavrsetkaServisa;
	}

	public Status getStatusServisa() {
		return statusServisa;
	}

	public void setStatusServisa(Status statusServisa) {
		this.statusServisa = statusServisa;
	}

	public Racunar getRacunar() {
		return racunar;
	}

	public void setRacunar(Racunar racunar) {
		this.racunar = racunar;
	}
	
	
}
